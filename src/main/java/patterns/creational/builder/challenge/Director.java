package patterns.creational.builder.challenge;

public class Director {
    MealBuilder mealBuilder;

    public void construct(MealBuilder mealBuilder) {
        this.mealBuilder = mealBuilder;
        this.mealBuilder.buildBurger();
        this.mealBuilder.buildDrink();
        this.mealBuilder.getMeal();
        this.mealBuilder.getMealName();
    }
}
