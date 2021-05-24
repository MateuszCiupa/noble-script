package meta;

import types.DefinitionType;
import types.VarType;

public class Definition {
    final public String id;
    final public VarType type;
    final public DefinitionType defType;
    final public String scope;

    public Definition(String id, VarType type, DefinitionType defType, String scope) {
        this.id = id;
        this.type = type;
        this.defType = defType;
        this.scope = scope;
    }

    public String getLlvmId() {
        return ((scope == null || scope.isBlank() || scope.trim().isBlank()) ? "" : scope + ".") + id;
    }
}
