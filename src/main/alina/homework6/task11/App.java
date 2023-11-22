package homework6.task11;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.*;

public class App {
    public static void main(String[] args) {

        Set<String> notAvailableProducts = new HashSet<>(Arrays.asList("яблоки", "орехи", "мед", "спагетти", "панчетта",
                "сыр пармезан", "черный перец", "мясо", "зелень", "приправы"));
        LocalDate feastDate = LocalDate.of(2023, 11, 13);
        Feast myFeast = new Feast(feastDate, notAvailableProducts);

        HashMap<Kitchener, Set<Dish>> kitchenerDish = new HashMap<>();

        Kitchener kitchener1 = new Kitchener("Петров Аркадий Александрович",
                new HashSet<>(Arrays.asList(DayOfWeek.MONDAY, DayOfWeek.WEDNESDAY, DayOfWeek.FRIDAY)));
        Kitchener kitchener2 = new Kitchener("Иванов Петр Сергеевич",
                new HashSet<>(Arrays.asList(DayOfWeek.MONDAY, DayOfWeek.TUESDAY, DayOfWeek.WEDNESDAY, DayOfWeek.THURSDAY)));
        Kitchener kitchener3 = new Kitchener("Смирнова Анна Ивановна",
                new HashSet<>(Arrays.asList(DayOfWeek.TUESDAY, DayOfWeek.WEDNESDAY, DayOfWeek.FRIDAY, DayOfWeek.SATURDAY)));
        Kitchener kitchener4 = new Kitchener("Козлов Дмитрий Александрович",
                new HashSet<>(Arrays.asList(DayOfWeek.MONDAY, DayOfWeek.WEDNESDAY, DayOfWeek.FRIDAY, DayOfWeek.SATURDAY)));
        Kitchener kitchener5 = new Kitchener("Попова Екатерина Владимировна",
                new HashSet<>(Arrays.asList(DayOfWeek.MONDAY, DayOfWeek.TUESDAY, DayOfWeek.THURSDAY, DayOfWeek.SATURDAY)));
        Kitchener kitchener6 = new Kitchener("Соколов Алексей Игоревич",
                new HashSet<>(Arrays.asList(DayOfWeek.TUESDAY, DayOfWeek.WEDNESDAY, DayOfWeek.THURSDAY, DayOfWeek.SATURDAY)));
        Kitchener kitchener7 = new Kitchener("Михайлова Ольга Андреевна",
                new HashSet<>(Arrays.asList(DayOfWeek.TUESDAY, DayOfWeek.THURSDAY, DayOfWeek.FRIDAY, DayOfWeek.SATURDAY)));

        Dish carbonara = new Dish("Карбонара", new HashSet<>(Arrays.asList("спагетти", "панчетта",
                "яйца", "сыр пармезан", "черный перец")), DishCategory.HOT, 90, 85,
                70, 30, "мясное");
        Dish capreseSalad = new Dish("Салат Капрезе", new HashSet<>(Arrays.asList("помидоры", "сыр моцарелла",
                "базилик", "оливковое масло", "бальзамический соус")), DishCategory.SNACK, 85, 83,
                40, 10, "вегетарианское");
        Dish ratatouille = new Dish("Рататуй", new HashSet<>(Arrays.asList("баклажаны", "кабачки",
                "болгарский перец", "помидоры", "лук", "чеснок", "прованские травы")), DishCategory.HOT, 80,
                75, 50, 20, "вегетарианское");
        Dish fruitParfait = new Dish("Фруктовое парфе", new HashSet<>(Arrays.asList("йогурт", "гранола",
                "фруктовая смесь")), DishCategory.DESSERT, 85, 80, 55, 25,
                "вегетарианское");
        Dish lobsterTermidor = new Dish("Лобстер Термидор", new HashSet<>(Arrays.asList("мясо лобстера",
                "сыр", "яйца", "бренди", "горчица", "эстрагон")), DishCategory.HOT, 95, 100,
                70, 50, "рыбное");
        Dish stuffedEggs = new Dish("Фаршированные яйца", new HashSet<>(Arrays.asList("яйца", "мясо",
                "зелень", "приправы")), DishCategory.SNACK, 90, 80, 60,
                30, "мясное");
        Dish cutletWithCheese = new Dish("Котлета с сыром", new HashSet<>(Arrays.asList("фарш", "сыр", "яйца",
                "хлеб")), DishCategory.HOT, 85, 75, 70, 40, "мясное");
        Dish chop = new Dish("Отбивная", new HashSet<>(Arrays.asList("мясо", "яйца", "мука",
                "панировочные сухари")), DishCategory.HOT, 88, 78, 65, 45,
                "мясное");
        Dish ambrosia = new Dish("Амброзия", new HashSet<>(Arrays.asList("яблоки", "орехи", "мед")),
                DishCategory.DESSERT, 95, 85, 50, 20, "вегетарианское");
        Dish angelCake = new Dish("Ангельский пирог", new HashSet<>(Arrays.asList("мука", "сахар", "яйца",
                "ваниль")), DishCategory.DESSERT, 92, 82, 55, 35,
                "вегетарианское");
        Dish shawarma = new Dish("Шаверма", new HashSet<>(Arrays.asList("мясо", "овощи", "соус")),
                DishCategory.HOT, 87, 61, 75, 50, "мясное");
        Dish plateOfCheeses = new Dish("Тарелка сыров", new HashSet<>(Arrays.asList("сыр чеддер", "сыр бри",
                "сыр гауда")), DishCategory.SNACK, 89, 79, 40, 10,
                "вегетарианское");
        Dish chili = new Dish("Чили", new HashSet<>(Arrays.asList("фасоль", "мясо", "помидоры", "перец")),
                DishCategory.HOT, 86, 76, 68, 55, "мясное");
        Dish sushi = new Dish("Суши", new HashSet<>(Arrays.asList("рис", "рыба", "водоросли")),
                DishCategory.SNACK, 93, 83, 80, 25, "рыбное");
        Dish friedSalmon = new Dish("Жареный лосось", new HashSet<>(Arrays.asList("лосось", "лимон",
                "зелень")), DishCategory.HOT, 91, 81, 72, 40,
                "рыбное");
        Dish friedCheese = new Dish("Жареный сыр", new HashSet<>(Arrays.asList("сыр панир", "мука", "яйцо")),
                DishCategory.HOT, 90, 80, 65, 30, "вегетарианское");

        kitchenerDish.put(kitchener1, new HashSet<>(Arrays.asList(carbonara, capreseSalad, friedSalmon, chili, sushi,
                ambrosia)));
        kitchenerDish.put(kitchener2, new HashSet<>(Arrays.asList(ratatouille, friedCheese, angelCake)));
        kitchenerDish.put(kitchener3, new HashSet<>(Arrays.asList(shawarma)));
        kitchenerDish.put(kitchener4, new HashSet<>(Arrays.asList(fruitParfait, stuffedEggs, plateOfCheeses)));
        kitchenerDish.put(kitchener5, new HashSet<>(Arrays.asList(ambrosia)));
        kitchenerDish.put(kitchener6, new HashSet<>(Arrays.asList(cutletWithCheese, chop)));
        kitchenerDish.put(kitchener7, new HashSet<>(Arrays.asList(lobsterTermidor)));

        Menu menu = new Menu(kitchenerDish);
        List<Dish> list = menu.sortedMenu(myFeast, 10);

        System.out.println(list);
        System.out.println(menu.filterMenuByPredicate(list, DishPredicate.DESSERT));
    }

}
