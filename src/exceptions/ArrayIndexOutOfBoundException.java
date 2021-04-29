package exceptions;

import meta.ArrayDefinition;

public class ArrayIndexOutOfBoundException extends NobleScriptException {

    public ArrayIndexOutOfBoundException(ArrayDefinition arrayDef, int index) {
        super("Invalid array index " + index + " of size " + arrayDef.size);
    }
}
