package homework4.task7.Order;

import homework4.task7.Appliance.Appliance;
import homework4.task7.OrderStatus.AvailableForReceiving;
import homework4.task7.Notification.Notify;
import homework4.task7.OrderStatus.OrderStatus;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Order implements Notify, AvailableForReceiving {

    private final int MAX_ORDER_SIZE = 75;
    private final LocalDateTime creationDate;
    private LocalDateTime assemblyDate, receivingDate;
    private String phoneNumber;
    private String orderNumber;
    private ArrayList<Appliance> orderList;
    private String surname;
    private String name;
    private String patronymic;
    private OrderStatus orderStatus;

    public Order(String phoneNumber, ArrayList<Appliance> orderList, String name, String surname,
                 String patronymic) {
        this.creationDate = LocalDateTime.now(ZoneId.of("Europe/Moscow"));
        this.phoneNumber = phoneNumber;
        this.orderNumber = getOrderNumber();
        if (orderList.size() <= MAX_ORDER_SIZE) {
            this.orderList = orderList;
        } else {
            throw new IndexOutOfBoundsException("Превышен лимит заказа! Удалите что-то из корзины, чтобы добавить" +
                    " новую позицию.");
        }
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.orderStatus = OrderStatus.CREATED;
    }
    public void addAppliance(Appliance appliance) throws Exception{
        if (orderList.size() < MAX_ORDER_SIZE) {
            orderList.add(appliance);
        } else {
            throw new Exception("Превышен лимит заказа! Удалите что-то из корзины, чтобы добавить новую позицию.");
        }
    }

    public void removeAppliance(Appliance appliance) {
        orderList.remove(appliance);
    }

    public void collectOrder() {
        if (getOrderStatus() == OrderStatus.CREATED) {
            setAssemblyDate(LocalDateTime.now(ZoneId.of("Europe/Moscow")));
            orderStatus = OrderStatus.COLLECTED;
        } else {
            throw new RuntimeException("Сборка заказа возможна только при статусе заказа: созданный");
        }
    }
    public void receivingOrder() throws Exception {
        if (orderStatus == OrderStatus.COLLECTED && isAvailableForReceiving()) {
            receivingDate = LocalDateTime.now();
            orderStatus = OrderStatus.CLOSED;
        } else {
            throw new RuntimeException("Выдача заказа возможна только при статусе заказа: собранный");
        }
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setAssemblyDate(LocalDateTime assemblyDate) {
        this.assemblyDate = assemblyDate;
    }

    public LocalDateTime getAssemblyDate() {
        return assemblyDate;
    }

    public LocalDateTime getReceivingDate() {
        return receivingDate;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getOrderNumber() {
        StringBuilder num = new StringBuilder();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyMMddHHmmss");
        String formattedDate = getCreationDate().format(formatter);
        num.append(formattedDate);
        num.append(getPhoneNumber().substring(getPhoneNumber().length() - 4));
        this.orderNumber = num.toString();
        return num.toString();
    }

    public ArrayList<Appliance> getOrderList() {
        return orderList;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }
}
