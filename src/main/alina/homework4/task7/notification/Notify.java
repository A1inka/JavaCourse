package homework4.task7.notification;

import homework4.task7.appliance.Appliance;

import java.math.RoundingMode;
import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yy");
        String formattedDate = getAssemblyDate().plusWeeks(2).format(formatter);
        double price = 0;
        System.out.println("Уважаемый " + getName() + "!");
        System.out.println("Рады сообщить, что Ваш заказ " + getOrderNumber() + " готов к выдаче.");
        System.out.println("Состав заказа:");
        for (Appliance a: getOrderList()) {
            price += a.getPrice();
            System.out.println("Наименование товара: " + a.printName());
            System.out.println("Цена: " + format.format(a.getPrice()));
            System.out.println("Габариты: " + a.getLength() + " м * " + a.getWidth() + " м * " + a.getHeight() + " м");
        }
        System.out.println();
        System.out.println("Сумма к оплате: " + format.format(price));
        System.out.println("Срок хранения заказа: " + formattedDate);
        System.out.println("С наилучшими пожеланиями, магазин “Кошки и картошки”!");
    }
}
