package homework6.task11;

public interface DishPredicate {
    boolean test(Dish dish);
    public static DishPredicate DESSERT = dish -> dish.getCategory().equals(DishCategory.DESSERT);
}
