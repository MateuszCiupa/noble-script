package exceptions;

public class IllegalFunctionDefinitionException extends NobleScriptException {
    public IllegalFunctionDefinitionException(String msg, int line, int col) {
        super(msg, line, col);
    }
}
