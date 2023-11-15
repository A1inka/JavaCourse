package homework6.task11;

import java.time.DayOfWeek;
import java.util.*;

public class Menu {
    private HashMap<Kitchener, Set<Dish>> menu;
    public Menu(HashMap<Kitchener, Set<Dish>> menu) {
        this.menu = menu;
    }
    public void addKitchener(Kitchener kitchener) {
        menu.put(kitchener, new HashSet<>());
    }
    public void removeKitchener(Kitchener kitchener) {
        menu.remove(kitchener);
    }
    public void addDish(Kitchener kitchener, Dish dish) {
        Set<Dish> dishes = menu.get(kitchener);
        if (dishes != null) {
            dishes.add(dish);
        }
    }
    public List<Dish> sortedMenu(Feast feast, int menuSize) {
        List<Dish> menuList = new ArrayList<>();
        List<Kitchener> availableKitcheners = new ArrayList<>();
        for (Kitchener kitchener : menu.keySet()) {
            for (DayOfWeek workingDay : kitchener.getWorkingDays()) {
                if (workingDay == feast.getFeastDayOfWeek()) {
                    availableKitcheners.add(kitchener);
                    break;
                }
            }
        }
        for (Kitchener kitchener : availableKitcheners) {
            Set<Dish> dishes = menu.get(kitchener);
            for (Dish dish : dishes) {
                boolean hasIngredients = true;
                for (String product : dish.getNecessaryIngredients()) {
                    if (!feast.getAvailableProducts().contains(product)) {
                        hasIngredients = false;
                        break;
                    }
                }
                if (hasIngredients && !menuList.contains(dish)) {
                    menuList.add(dish);
                }
            }
        }
        menuList.sort((dish1, dish2) -> {
            if (dish1.getKingsRating() != dish2.getKingsRating()) {
                return dish2.getKingsRating() - dish1.getKingsRating();
            } else {
                return dish2.getCourtiersRating() - dish1.getCourtiersRating();
            }
        });

        return (menuList.subList(0, Math.min(menuSize, menuList.size())));
    }
}
