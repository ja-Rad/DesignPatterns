package patterns.creational.prototype.implementation;

public class Client {
    public static void main(String[] args) {
        ShapeCache.loadCache(); // we just have 3 pre-defined objects that after clone create a NEW objects!

        Shape clonedShape1 = ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape1.getType()); // Circle@721
        
        Shape clonedShape4 = ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape4.getType()); // Circle@722

        // that means that ShapeCache.getShape("1") returns a new object based on ShapeCache rule (id=1 is Circle, so we create Circles)
        // e.g. clonedShape1 clonedShape4 both are different objects based on the 3rd object that is located in ShapeCache!


        Shape clonedShape2 = ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());

        Shape clonedShape3 = ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape3.getType());

    }
}
