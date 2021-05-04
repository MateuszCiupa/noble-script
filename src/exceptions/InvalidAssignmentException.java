package exceptions;

import meta.Definition;
import meta.Value;

public class InvalidAssignmentException extends NobleScriptException {
    public InvalidAssignmentException(Definition definition, Value value, int line) {
        super("Value {" + value.content + "} is not assignable to ID {" + definition.id + "} of type {" + definition.type + "}.", line);
    }
}
