package patterns.structural.adapter.class_adapter;

public class Client {
    public static void main(String[] args) {
        // 1st way of implementation: Class Adapter
        ClassAdapter classAdapter = new ClassAdapter();
        int classAdapterInteger = classAdapter.getInteger();
        System.out.println(classAdapterInteger);


        // 2nd way of implementation: Object Adapter
        ObjectAdapter objectAdapter = new ObjectAdapter(new IntegerValueImpl());
        int objectAdapterInteger = objectAdapter.getInteger();
        System.out.println(objectAdapterInteger);
    }
}
