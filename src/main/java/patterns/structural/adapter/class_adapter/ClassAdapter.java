package patterns.structural.adapter.class_adapter;

public class ClassAdapter extends IntegerValueImpl {
    @Override
    public int getInteger() {
        return 15 + super.getInteger(); // overrode hardcoded value
    }
}

// EXAMPLE of a difference between Class and Object Adapter
class ObjectAdapter {
    private IntegerValue integerValue;

    public ObjectAdapter(IntegerValue integerValue) {
        this.integerValue = integerValue;
    }

    // @Override
    public int getInteger() {
        return 15 + this.integerValue.getInteger(); // overrode hardcoded value
    }

}