package exceptions;

public class IDNotDefinedException extends NobleScriptException {

    public IDNotDefinedException(String id, int line) {
        super("ID {" + id + "} is undefined.", line);
    }
}
