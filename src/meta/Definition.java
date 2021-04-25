package meta;

import types.DefinitionType;
import types.VarType;

public class Definition {
    final public String id;
    final public VarType type;
    final public DefinitionType defType;
    final public boolean isGlobal;

    public Definition(String id, VarType type, DefinitionType defType, boolean isGlobal) {
        this.id = id;
        this.type = type;
        this.defType = defType;
        this.isGlobal = isGlobal;
    }
}
