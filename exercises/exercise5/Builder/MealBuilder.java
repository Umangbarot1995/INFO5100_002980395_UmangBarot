package Builder;

public class MealBuilder {

    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBriyani());
        meal.addItem(new Raita());
        return meal;
    }
}