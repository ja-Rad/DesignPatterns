package patterns.behavioral.template_method.implementation;

public class Client {
    public static void main(String[] args) {
        HouseTemplate templateWooden = new WoodenHouse();

        // using template method
        templateWooden.buildHouse();
        /*
            Building foundation with cement, iron and sand...
            Building Pillars with Wood coating
            Building Wooden Walls
            Building Glass Windows by default...
            House is built...
         */

        System.out.println("----------------------");


        HouseTemplate templateGlass = new GlassHouse();
        // using template method
        templateGlass.buildHouse();
        /*
            Building foundation with cement, iron and sand...
            Building Pillars with Glass coating
            Building Glass Walls
            Building Glass Windows by default...
            House is built...
         */
    }
}
