package meta;

import types.DefinitionType;
import types.VarType;

public class ArrayDefinition extends Definition {

    final public int size;

    public ArrayDefinition(String id, VarType type, String scope, int size) {
        super(id, type, DefinitionType.ARRAY, scope);
        this.size = size;
    }
}
