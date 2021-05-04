package exceptions;

public class NobleScriptException extends RuntimeException {
    public NobleScriptException(String msg, int line) {
        super(msg + " - at line: " + line);
    }
}
