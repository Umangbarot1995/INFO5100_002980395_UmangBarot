package Builder;

public class BuilderPattern {
    public static void main(String[] args) {

        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " + vegMeal.getCost());

    }
}