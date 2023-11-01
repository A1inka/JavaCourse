package homework4.task7;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;

public interface Notify {
    LocalDateTime getCreationDate();
    LocalDateTime getAssemblyDate();
    String getPhoneNumber();
    String getOrderNumber();
    ArrayList<Appliance> getOrderList();
    String getName();
    default void sendNotification() {
        NumberFormat format = NumberFormat.getNumberInstance();
        format.setMaximumFractionDigits(2);
        format.setRoundingMode(RoundingMode.UP);
        double price = 0;
        System.out.println("Уважаемый " + getName() + "!");
        System.out.println("Рады сообщить, что Ваш заказ " + getOrderNumber() + " готов к выдаче.");
        System.out.println("Состав заказа:");
        for (Appliance a: getOrderList()) {
            price += a.getPrice();
            if (a instanceof  Fridge) {
                if (((Fridge) a).isMiniFridge() && ((Fridge) a).isHasFreezer()) {
                    System.out.println("Мини-холодильник с морозильной камерой.");
                }
                else if (((Fridge) a).isMiniFridge() && !((Fridge) a).isHasFreezer()) {
                    System.out.println("Мини-холодильник без морозильной камеры");
                }
                else if (!((Fridge) a).isMiniFridge() && ((Fridge) a).isHasFreezer()) {
                    System.out.println("Холодильник с морозильной камерой");
                }
                else {
                    System.out.println("Холодильник без морозильной камеры");
                }
            }
            else if (a instanceof Stove) {
                System.out.println("Плита " + ((Stove) a).getType());
            }
            else if (a instanceof WashingMachine) {
                if (((WashingMachine) a).isDryer()) {
                    System.out.println("Стиральная машина с сушкой");
                }
                else {
                    System.out.println("Стиральная машина без сушки");
                }
            }
            else {
                System.out.println("Робот-пылесос");
            }
            System.out.println("Цена: " + format.format(a.getPrice()));
            System.out.println("Габариты: " + a.getLength() + " м * " + a.getWidth() + " м * " + a.getHeight() + " м");
        }
        System.out.println();
        System.out.println("Сумма к оплате: " + format.format(price));
        System.out.println("Срок хранения заказа: " + getAssemblyDate().plusWeeks(2));
        System.out.println("С наилучшими пожеланиями, магазин “Кошки и картошки”!");
    }
}
