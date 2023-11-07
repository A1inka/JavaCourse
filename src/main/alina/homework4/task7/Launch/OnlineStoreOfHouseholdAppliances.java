package homework4.task7.Launch;

import homework4.task7.Appliance.*;
import homework4.task7.Order.Order;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;

public class OnlineStoreOfHouseholdAppliances {

    public static void main(String[] args) {

        ArrayList<Appliance> appliancesList = new ArrayList<>();

        Fridge fridgeWithFreezer = new Fridge(46908, "Лучший холодильник в вашей жизни.",0.65,
                0.6, 1.73, 60, 16, 9.3, false, true,
                -20, 301, "Китай", true);
        Fridge fridgeWithoutFreezer = new Fridge(49699, "Инновационный холодильник Атлант Х-1602-100.",
                0.62, 0.6, 1.86, 65, 20, 10.1, false, false,
                0, 370, "Армения", false);
        Fridge fridgeMini = new Fridge(8092, "Компактный холодильник с отделением для быстрого" +
                " охлаждения напитков", 0.45, 0.47, 0.49, 15, 16, 6.2,
                true, true, -18, 45, "Россия", true);
        Stove gasStove = new Stove(19100, "Газовая отдельностоящая плита Weissgauff.", 0.6,
                0.6, 0.85, 38, 5, "Газовая", 300, -1, "Россия",
                true);
        Stove electricStove = new Stove(28900, "Электрическая отдельностоящая плита Weissgauff.",
                0.5, 0.6, 0.85, 41, 6.1, "Электрическая", 250,
                -1, "Южная Корея", true);
        Stove inductionStove = new Stove(10990, "Настольная индукционная плита Kitfort КТ-109.",
                0.34, 0.58, 0.7, 4.2, 7, "Индукционная", 230, 0,
                "США", true);
        RobotVacuumCleaner robotVacuumCleaner = new RobotVacuumCleaner(16139, "Робот-пылесос Polaris PVCR",
                0.5, 0.5, 0.075, 2, 120, 25, 0.5, "Бразилия",
                false);
        WashingMachine washingMachineWithDryer = new WashingMachine(39980, "Стиральная машина с сушкой" +
                " Beko WDW 85636 B3 White", 0.59, 0.6, 0.84, 65, 0, 100,
                true, 1200, 8, "Италия", false);
        WashingMachine washingMachineWithoutDryer = new WashingMachine(18791, "Стиральная машина" +
                " Indesit BWSA 51051 S", 0.43, 0.6, 0.85, 62.5, 0, 93,
                false, 1000, 5, "Россия", true);

        appliancesList.add(fridgeWithFreezer);
        appliancesList.add(fridgeWithoutFreezer);
        appliancesList.add(fridgeMini);
        appliancesList.add(gasStove);
        appliancesList.add(inductionStove);
        appliancesList.add(electricStove);
        appliancesList.add(robotVacuumCleaner);
        appliancesList.add(washingMachineWithDryer);
        appliancesList.add(washingMachineWithoutDryer);

        ArrayList<Appliance> list = new ArrayList<>();
        list.add(washingMachineWithDryer);
        list.add(fridgeMini);
        list.add(electricStove);
        Order order = new Order("+79465337072", list, "Алина", "Баранова", "Дмитриевна");
        order.collectOrder();
        order.sendNotification();
    }
}
