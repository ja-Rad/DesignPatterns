package patterns.creational.builder.challenge;

public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        MealBuilder vegMealBuilder = new VegMealBuilder();
        MealBuilder nonVegMealBuilder = new NonVegMealBuilder();


        director.construct(vegMealBuilder);
        Meal vegMeal = vegMealBuilder.getMeal();
        vegMeal.showItems();
        System.out.println("Total Cost: " + vegMeal.getCost());


        System.out.println();


        director.construct(nonVegMealBuilder);
        Meal nonVegMeal = nonVegMealBuilder.getMeal();
        nonVegMeal.showItems();
        System.out.println("Total Cost: " + nonVegMeal.getCost());
    }
}
