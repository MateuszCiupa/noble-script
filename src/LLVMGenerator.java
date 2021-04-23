public class LLVMGenerator {
    static String _example_header_text = "";
    static String _example_main_text = "";
    static int _example_str_i = 0;

    private final StringBuilder sb = new StringBuilder();
    private int register = 0;

    public void print_i32(String id) {
        sb.append("%")
                .append(register++)
                .append(" = load i32, i32* %")
                .append(id)
                .append("\n");
        sb.append("%")
                .append(register)
                .append(" = call i32 (i8, ...) @printf(i8 getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %")
                .append(register - 1)
                .append(")\n");
        register++;
    }

    public void declare_i32(String id) {
        sb.append("%")
                .append(id)
                .append(" = alloca i32\n");
    }

    public void assign_i32(String id, String value) {
        sb.append("store i32 ")
                .append(value)
                .append(", i32* %")
                .append(id)
                .append("\n");
    }

    public String generate() {
        return sb.toString();
    }

    public void _example_print(String text) {
        int str_len = text.length();
        String str_type = "[" + (str_len + 2) + " x i8]";
        _example_header_text += "@str" + _example_str_i + " = constant" + str_type + " c\"" + text + "\\0A\\00\"\n";
        _example_main_text += "call i32 (i8*, ...) @printf(i8* getelementptr inbounds ( " + str_type + ", " + str_type + "* @str" + _example_str_i + ", i32 0, i32 0))\n";
        _example_str_i++;
    }

    public String _example_generate() {
        String text;
        text = "declare i32 @printf(i8*, ...)\n";
        text += _example_header_text;
        text += "define i32 @main() nounwind{\n";
        text += _example_main_text;
        text += "ret i32 0 }\n";
        return text;
    }
}
