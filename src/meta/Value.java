package meta;

import types.ValueType;

public class Value {
    public String content;
    public ValueType type;

    public Value(String content, ValueType type) {
        this.content = content;
        this.type = type;
    }

    public String valueToLlvm() {
        switch (type) {
            case VALUE_INT:
            case VALUE_INT_REGISTER:
                return "i32 " + this.content;
            case VALUE_DOUBLE:
            case VALUE_DOUBLE_REGISTER:
                return "double %" + this.content;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
