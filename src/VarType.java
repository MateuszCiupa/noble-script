public enum VarType {
    BOOLEAN("boolean"), INT("int"), DOUBLE("double"), STRING("string"), NULL("null");

    private String type;

    VarType(String type) {
        this.type = type;
    }

    static public VarType getType(String type) {
        switch (type) {
            case "boolean": return VarType.BOOLEAN;
            case "int": return  VarType.INT;
            case "string": return VarType.STRING;
            case "null": return VarType.NULL;
            default: throw new IllegalArgumentException(type);
        }
    }
}
