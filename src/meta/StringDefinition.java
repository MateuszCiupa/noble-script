package meta;

import types.DefinitionType;
import types.VarType;

public class StringDefinition extends Definition {
    public int length;

    public StringDefinition(String id, VarType type, DefinitionType defType, String scope, int length) {
        super(id, type, defType, scope);
        this.length = length;
    }
}
