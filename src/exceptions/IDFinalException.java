package exceptions;

public class IDFinalException extends NobleScriptException {
    public IDFinalException(String id, int line, int col) {
        super("ID {" + id + "} is final and cannot be initialized again", line, col);
    }
}
