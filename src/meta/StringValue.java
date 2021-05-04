package meta;

import types.ValueType;

public class StringValue extends Value {
    public String content;
    public ValueType type;
    public int length;

    public StringValue(String content, ValueType type, int length) {
        super(content, type);
        this.length = length;
    }
}
