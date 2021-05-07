package exceptions;

public class IDAlreadyDefinedException extends NobleScriptException {

    public IDAlreadyDefinedException(String id, String scope, int line, int col) {
        super("ID {" + id + "} already exists in the scope {" + scope + "}", line, col);
    }
}
