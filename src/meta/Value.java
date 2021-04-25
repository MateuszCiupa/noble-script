package meta;

import types.ValueType;

public class Value {
    public String content;
    public ValueType type;

    public Value(String content, ValueType type) {
        this.content = content;
        this.type = type;
    }
}
