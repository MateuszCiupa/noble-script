public class LLVMGenerator {

    private final StringBuilder header = new StringBuilder();
    private final StringBuilder main = new StringBuilder();
    private final StringBuilder buffer = new StringBuilder();

    private int register = 1;

    public String generate() {
        main.append(buffer);

        StringBuilder sb = new StringBuilder();
        for (String line : main.toString().split("\n")) {
            sb.append("  ").append(line).append("\n");
        }

        return "declare i32 @printf(i8*, ...)\n" +
                "declare i32 @scanf(i8*, ...)\n" +
                "@strpi = constant [4 x i8] c\"%d\\0A\\00\"\n" +
                "@strpd = constant [4 x i8] c\"%f\\0A\\00\"\n" +
                "@strps = constant [4 x i8] c\"%s\\0A\\00\"\n" +
                "@strsi = constant [3 x i8] c\"%d\\00\"\n" +
                "@strsd = constant [4 x i8] c\"%lf\\00\"\n" +
                "\n" +
                header.toString() +
                "define i32 @main() nounwind {\n" +
                sb.toString() +
                "  ret i32 0\n" +
                "}\n";
    }

    // TODO is global?
    public void print_i32(String id) {
        buffer.append("%")
                .append(register++)
                .append(" = load i32, i32* %")
                .append(id)
                .append("\n");
        buffer.append("%")
                .append(register)
                .append(" = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %")
                .append(register - 1)
                .append(")\n");
        register++;
    }

    public void declare_i32(String id, boolean global) {
        if (global) {
            header.append("@")
                    .append(id)
                    .append(" = global i32 0\n");
        } else {
            buffer.append("%")
                    .append(id)
                    .append(" = alloca i32\n");
        }
    }

    public void assign_i32(String id, String value, boolean global) {
        buffer.append("store i32 ")
                .append(value)
                .append(", i32* ");
        if (global) {
            buffer.append("@");
        } else {
            buffer.append("%");
        }
        buffer.append(id)
                .append("\n");
    }
}
