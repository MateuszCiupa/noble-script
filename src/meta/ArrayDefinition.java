package meta;

import types.DefinitionType;
import types.VarType;

public class ArrayDefinition extends Definition {

    final public int size;

    public ArrayDefinition(String id, VarType type, boolean isGlobal, int size) {
        super(id, type, DefinitionType.ARRAY, isGlobal);
        this.size = size;
    }
}
