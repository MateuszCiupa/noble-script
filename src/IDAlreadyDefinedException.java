public class IDAlreadyDefinedException extends NobleScriptException {

    IDAlreadyDefinedException(String id, String scope) {
        super("ID {" + id + "} already exists in the scope {" + scope + "}");
    }
}
