public class LLVMGenerator {

    private final StringBuilder header = new StringBuilder();
    private final StringBuilder main = new StringBuilder();
    private final StringBuilder buffer = new StringBuilder();

    private int register = 1;

    public int getRegister() {
        return register;
    }

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

    public void load_i32(String id, boolean isGlobal) {
        buffer.append("%")
                .append(register++)
                .append(" = load i32, i32* ")
                .append(isGlobal ? "@" : "%")
                .append(id)
                .append("\n");
    }

    // TODO is global?
    public void print_i32_from_variable(String id) {
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

    public void print_i32_from_register(String content) {
        buffer.append("%")
                .append(register++)
                .append(" = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 ")
                .append(content)
                .append(")\n");
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

    public void add_i32(String val1, String val2) {
        buffer.append("%")
                .append(register)
                .append(" = add i32 ")
                .append(val1)
                .append(", ")
                .append(val2)
                .append("\n");
        register++;
    }

    public void mul_i32(String val1, String val2) {
        buffer.append("%")
                .append(register)
                .append(" = mul i32 ")
                .append(val1)
                .append(", ")
                .append(val2)
                .append("\n");
        register++;
    }

    public void sub_i32(String val1, String val2) {
        buffer.append("%")
                .append(register)
                .append(" = sub i32 ")
                .append(val1).append(", ")
                .append(val2)
                .append("\n");
        register++;
    }

    public void div_i32(String val1, String val2) {
        buffer.append("%")
                .append(register)
                .append(" = sdiv i32 ")
                .append(val1)
                .append(", ")
                .append(val2)
                .append("\n");
        register++;
    }
}
