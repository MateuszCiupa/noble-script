package exceptions;

public class IDAlreadyDefinedException extends NobleScriptException {

    public IDAlreadyDefinedException(String id, String scope) {
        super("ID {" + id + "} already exists in the scope {" + scope + "}");
    }
}
