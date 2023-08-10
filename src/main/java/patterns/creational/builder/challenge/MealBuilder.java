package patterns.creational.builder.challenge;

public interface MealBuilder {
    public Meal getMeal();

    public void buildBurger();

    public void buildDrink();

    public void getMealName();
}

class VegMealBuilder implements MealBuilder {

    private Meal meal = new Meal();

    @Override
    public Meal getMeal() {
        return meal;
    }

    @Override
    public void buildBurger() {
        meal.addItem(new VegBurger());
    }

    @Override
    public void buildDrink() {
        meal.addItem(new Coke());
    }

    @Override
    public void getMealName() {
        System.out.println("Veg Meal");
    }
}

class NonVegMealBuilder implements MealBuilder {

    private Meal meal = new Meal();

    @Override
    public Meal getMeal() {
        return meal;
    }

    @Override
    public void buildBurger() {
        meal.addItem(new ChickenBurger());
    }

    @Override
    public void buildDrink() {
        meal.addItem(new Pepsi());
    }

    @Override
    public void getMealName() {
        System.out.println("Non-Veg Meal");
    }
}
