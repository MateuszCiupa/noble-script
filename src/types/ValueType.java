package types;

public enum ValueType {
    VALUE_BOOLEAN, VALUE_INT, VALUE_DOUBLE, VALUE_STRING, VALUE_STRING_REGISTER, VALUE_NULL, VALUE_REGISTER, VALUE_FUNC_CALL, VALUE_INT_REGISTER, VALUE_DOUBLE_REGISTER;

    public boolean notEquals(ValueType another){
        switch (this){
            case VALUE_INT:
            case VALUE_INT_REGISTER:
                return another != VALUE_INT && another != VALUE_INT_REGISTER;
            case VALUE_DOUBLE:
            case VALUE_DOUBLE_REGISTER:
                return another != VALUE_DOUBLE && another != VALUE_DOUBLE_REGISTER;
            default:
                // TODO implement more types in ValueType comparator method
                throw new UnsupportedOperationException();
        }
    }
}
