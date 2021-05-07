package exceptions;

public class IDNotDefinedException extends NobleScriptException {

    public IDNotDefinedException(String id, int line, int col) {
        super("ID {" + id + "} is undefined.", line, col);
    }
}
