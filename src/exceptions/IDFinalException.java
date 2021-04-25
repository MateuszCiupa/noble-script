package exceptions;

public class IDFinalException extends NobleScriptException {
    public IDFinalException(String id) {
        super("ID {" + id + "} is final and cannot be initialized again");
    }
}
