package meta;

import types.DefinitionType;
import types.VarType;

public class ArrayDefinition extends Definition {

    final public int size;

    public ArrayDefinition(String id, VarType type, DefinitionType defType, boolean isGlobal, int size) {
        super(id, type, defType, isGlobal);
        this.size = size;
    }
}
