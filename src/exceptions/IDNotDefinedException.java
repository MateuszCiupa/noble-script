package exceptions;

public class IDNotDefinedException extends NobleScriptException {

    public IDNotDefinedException(String id) {
        super("ID {" + id + "} is undefined.");
    }
}
