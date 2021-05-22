import java.util.Stack;

public class LLVMGenerator {

    private final StringBuilder header = new StringBuilder();
    private final StringBuilder main = new StringBuilder();
    private final StringBuilder buffer = new StringBuilder();

    private int register = 1;
    private int br = 0;
    private int stringRegister = 1;

    static Stack<Integer> br_stack = new Stack<>();

    public int getRegister() {
        return register;
    }

    public int getBr(){ return br; }

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

    /**
     * printing
     */
    public void print_i32(String content) {
        buffer.append("%")
                .append(register++)
                .append(" = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 ")
                .append(content)
                .append(")\n");
    }

    public void printf_double(String content) {
        buffer.append("%")
                .append(register++)
                .append(" = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpd, i32 0, i32 0), double ")
                .append(content)
                .append(")\n");
    }

    public void printf_string(String id, int length) {
        buffer.append("%").append(register).append(" = getelementptr inbounds [").append(length + 1).append(" x i8], [").append(length + 1).append(" x i8]* @").append(id).append(", i32 0, i32 0\n");
        register++;
        buffer.append("%").append(register).append(" = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %").append(register - 1).append(")\n");
        register++;
    }

    public void printf_string_literal(String text) {
        int str_len = text.length();
        String str_type = "[" + (str_len + 2) + " x i8]";
        header.append("@str" + stringRegister + " = constant" + str_type + " c\"" + text + "\\0A\\00\"\n");
        buffer.append("%" + register + " = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ( " + str_type + ", " + str_type + "* @str" + stringRegister + ", i32 0, i32 0))\n");
        stringRegister++;
        register++;
    }

    /**
     * Scanners
     */

    public void scanf_i32() {
        buffer.append("%")
                .append(register++)
                .append(" = alloca i32\n");
        buffer.append("%")
                .append(register++)
                .append(" = call i32 (i8*, ...) @scanf(i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strsi, i32 0, i32 0), i32* %")
                .append(register - 2)
                .append(")\n");
        buffer.append("%")
                .append(register++)
                .append(" = load i32, i32* %")
                .append(register - 3)
                .append("\n");
    }

    public void scanf_fouble() {
        buffer.append("%")
                .append(register++)
                .append(" = alloca double");
        buffer.append("%")
                .append(register++)
                .append(" = call i32 (i8*, ...) @scanf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strsd, i32 0, i32 0), double* %")
                .append(register - 2)
                .append(")\n");
        buffer.append("%")
                .append(register++)
                .append(" = load double, double* %")
                .append(register - 3)
                .append("\n");
    }

    /**
     * IF
     */
    public void icmp(String valueLeft, String valueRight, String code) {
        buffer.append("%").append(register++).append(" = icmp ").append(code).append(" i32 ").append(valueLeft).append(", ").append(valueRight).append("\n");
    }

    public void if_start() {
        br++;
        buffer.append("br i1 %" + (register - 1) + ", label %true" + br + ", label %false" + br + "\n");
        buffer.append("true").append(br).append(":\n");
        br_stack.push(br);
    }

    public void if_end() {
        int b = br_stack.pop();
        buffer.append("br label %false" + b + "\n");
        buffer.append("false" + b + ":\n");
    }

    /**
     * WHILE
     */
    public void while_start(){
        br_stack.push(br);
        buffer.append("br label %whilestart" + br + "\n");
        buffer.append("whilestart" + br + ":\n");
        br++;
    }


    public void whilebody_start() {
        br_stack.push(br);
        buffer.append("br i1 %" + (register - 1) + ", label %whiletrue" + br + ", label %whilefalse" + br + "\n");
        buffer.append("whiletrue").append(br).append(":\n");
    }

    public void whilebody_end() {
        int whilebody = br_stack.pop();
        int whilestart_br = br_stack.pop();

        buffer.append("br label %whilestart" + whilestart_br + "\n");
        buffer.append("br label %whilefalse" + whilebody + "\n");
        buffer.append("whilefalse" + whilebody + ":\n");
    }

    /**
     * String
     */
    public void assign_string(String id, String text, boolean global, String function) {
        int len = text.length() + 1;
        String str_type = "[" + len + " x i8]";
        if (global) {
            header.append("@")
                    .append(id)
                    .append(" = constant")
                    .append(str_type)
                    .append(" c\"")
                    .append(text)
                    .append("\\00\"\n");
        } else {
            header.append("@")
                    .append(function)
                    .append(".")
                    .append(id)
                    .append(" = constant")
                    .append(str_type)
                    .append(" c\"")
                    .append(text)
                    .append("\\00\"\n");
        }
    }

    /**
     * Array
     */
    private void declare_array(String id, int size, boolean isGlobal, String type) {
        if (isGlobal) {
            header.append("@")
                    .append(id)
                    .append(" = common dso_local global [")
                    .append(size)
                    .append(" x ")
                    .append(type)
                    .append("] zeroinitializer, align 16\n");
        } else {
            buffer.append("%")
                    .append(id)
                    .append(" = alloca [")
                    .append(size)
                    .append(" x ")
                    .append(type)
                    .append("], align 16\n");
        }
    }

    public void declare_i32_array(String id, int size, boolean isGlobal) {
        declare_array(id, size, isGlobal, "i32");
    }

    public void declare_double_array(String id, int size, boolean isGlobal) {
        declare_array(id, size, isGlobal, "double");
    }

    private void load_array_index(String id, int size, int index, boolean isGlobal, String type) {
        buffer.append("%")
                .append(register++)
                .append(" = getelementptr inbounds [")
                .append(size).append(" x ")
                .append(type)
                .append("],[")
                .append(size).append(" x ")
                .append(type)
                .append(" ]* ")
                .append(isGlobal ? "@" : "%")
                .append(id)
                .append(", i64 0, i64 ")
                .append(index)
                .append("\n");
        buffer.append("%")
                .append(register++)
                .append(" = load ")
                .append(type)
                .append(", ")
                .append(type)
                .append("* %")
                .append(register - 2).append(", align 4\n");
    }

    public void load_i32_array_index(String id, int size, int index, boolean isGlobal) {
        load_array_index(id, size, index, isGlobal, "i32");
    }

    public void load_double_array_index(String id, int size, int index, boolean isGlobal) {
        load_array_index(id, size, index, isGlobal, "double");
    }

    public void assign_array(String id, int size, int index, boolean isGlobal, String value, String type) {
        buffer.append("%")
                .append(register++)
                .append(" = getelementptr inbounds [")
                .append(size).append(" x ")
                .append(type)
                .append("],[")
                .append(size).append(" x ")
                .append(type)
                .append("]* ")
                .append(isGlobal ? "@" : "%")
                .append(id)
                .append(", i64 0, i64 ")
                .append(index)
                .append("\n");
        buffer.append("store ")
                .append(type)
                .append(" ")
                .append(value)
                .append(", ")
                .append(type)
                .append("* %")
                .append(register - 1)
                .append("\n");
    }

    public void assign_i32_array(String id, int size, int index, boolean isGlobal, String value) {
        assign_array(id, size, index, isGlobal, value, "i32");
    }

    public void assign_double_array(String id, int size, int index, boolean isGlobal, String value) {
        assign_array(id, size, index, isGlobal, value, "double");
    }

    /**
     * i32, INT
     */
    public void declare_i32(String id, boolean isGlobal) {
        if (isGlobal) {
            header.append("@")
                    .append(id)
                    .append(" = global i32 0\n");
        } else {
            buffer.append("%")
                    .append(id)
                    .append(" = alloca i32\n");
        }
    }

    public void load_i32(String id, boolean isGlobal) {
        buffer.append("%")
                .append(register++)
                .append(" = load i32, i32* ")
                .append(isGlobal ? "@" : "%")
                .append(id)
                .append("\n");
    }

    public void assign_i32(String id, String value, boolean global) {
        buffer.append("store i32 ")
                .append(value)
                .append(", i32* ")
                .append(global ? "@" : "%")
                .append(id)
                .append("\n");
    }

    public void add_i32(String val1, String val2) {
        buffer.append("%")
                .append(register++)
                .append(" = add i32 ")
                .append(val1)
                .append(", ")
                .append(val2)
                .append("\n");
    }

    public void sub_i32(String val1, String val2) {
        buffer.append("%")
                .append(register++)
                .append(" = sub i32 ")
                .append(val1).append(", ")
                .append(val2)
                .append("\n");
    }

    public void mul_i32(String val1, String val2) {
        buffer.append("%")
                .append(register++)
                .append(" = mul i32 ")
                .append(val1)
                .append(", ")
                .append(val2)
                .append("\n");
    }

    public void div_i32(String val1, String val2) {
        buffer.append("%")
                .append(register++)
                .append(" = sdiv i32 ")
                .append(val1)
                .append(", ")
                .append(val2)
                .append("\n");
    }

    public void i32_to_double(String content) {
        buffer.append("%")
                .append(register++)
                .append(" = sitofp i32 ")
                .append(content)
                .append(" to double\n");
    }

    /**
     * DOUBLE
     */
    public void declare_double(String id, boolean isGlobal) {
        if (isGlobal) {
            header.append("@")
                    .append(id)
                    .append(" = global double 0.0\n");
        } else {
            buffer.append("%")
                    .append(id)
                    .append(" = alloca double\n");
        }
    }

    public void load_double(String id, boolean isGlobal) {
        buffer.append("%")
                .append(register++)
                .append(" = load double, double* ")
                .append(isGlobal ? "@" : "%")
                .append(id)
                .append("\n");
    }

    public void assign_double(String id, String value, boolean isGlobal) {
        buffer.append("store double ")
                .append(value)
                .append(", double* ")
                .append(isGlobal ? "@" : "%")
                .append(id)
                .append("\n");
    }

    public void add_double(String val1, String val2) {
        buffer.append("%")
                .append(register++)
                .append(" = fadd double ")
                .append(val1)
                .append(", ")
                .append(val2)
                .append("\n");
    }


    public void sub_double(String val1, String val2) {
        buffer.append("%")
                .append(register++)
                .append(" = fsub double ")
                .append(val1)
                .append(", ")
                .append(val2)
                .append("\n");
    }

    public void mul_double(String val1, String val2) {
        buffer.append("%")
                .append(register++)
                .append(" = fmul double ")
                .append(val1)
                .append(", ")
                .append(val2)
                .append("\n");
    }

    public void div_double(String val1, String val2) {
        buffer.append("%")
                .append(register++)
                .append(" = fdiv double ")
                .append(val1)
                .append(", ")
                .append(val2)
                .append("\n");
    }
}
