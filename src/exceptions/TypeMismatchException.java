package exceptions;

public class TypeMismatchException extends NobleScriptException {

    public TypeMismatchException(String msg, int line) {
        super(msg, line);
    }
}
