package patterns.structural.adapter.class_adapter;

public class IntegerValueImpl implements IntegerValue {
    @Override
    public int getInteger() {
        return 10; // hardcoded value
    }
}
