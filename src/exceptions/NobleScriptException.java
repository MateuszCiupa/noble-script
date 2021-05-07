package exceptions;

public class NobleScriptException extends RuntimeException {
    public NobleScriptException(String msg, int line, int col) {
        super(msg + " - at line: " + line + " column: " + col);
    }
}
