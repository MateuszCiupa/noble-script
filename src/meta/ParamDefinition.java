package meta;

import types.DefinitionType;
import types.VarType;

public class ParamDefinition extends Definition {

    private final Integer register;

    public ParamDefinition(String id, VarType type, DefinitionType defType, String scope, int register) {
        super(id, type, defType, scope);
        this.register = register;
    }

    @Override
    public String getLlvmId() {
        return register.toString();
    }
}
