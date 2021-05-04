package exceptions;

public class IDFinalException extends NobleScriptException {
    public IDFinalException(String id, int line) {
        super("ID {" + id + "} is final and cannot be initialized again", line);
    }
}
