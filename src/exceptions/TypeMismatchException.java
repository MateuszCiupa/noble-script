package exceptions;

public class TypeMismatchException extends NobleScriptException {

    public TypeMismatchException(String msg, int line, int col) {
        super(msg, line, col);
    }
}
