package homework4.task7;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Order implements Notify, AvailableForCollection, OrderManager{

    private final int MAX_ORDER_SIZE = 75;
    private LocalDateTime creationDate, assemblyDate, receivingDate;
    private String phoneNumber;
    private String orderNumber;
    private ArrayList<Appliance> orderList;
    private String surname;
    private String name;
    private String patronymic;

    public Order(LocalDateTime creationDate, LocalDateTime assemblyDate, LocalDateTime receivingDate,
                 String phoneNumber, String orderNumber, ArrayList<Appliance> orderList, String name, String surname,
                 String patronymic) {
        this.creationDate = creationDate;
        this.assemblyDate = assemblyDate;
        this.receivingDate = receivingDate;
        this.phoneNumber = phoneNumber;
        this.orderNumber = orderNumber;
        this.orderList = orderList;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
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

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime receiptDate) {
        this.creationDate = receiptDate;
    }

    public LocalDateTime getAssemblyDate() {
        return assemblyDate;
    }

    public void setAssemblyDate(LocalDateTime assemblyDate) {
        this.assemblyDate = assemblyDate;
    }

    public LocalDateTime getReceivingDate() {
        return receivingDate;
    }

    public void setReceivingDate(LocalDateTime receivingDate) {
        this.receivingDate = receivingDate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        StringBuilder num = new StringBuilder();
        num.append(getCreationDate().getYear() % 100);
        num.append(getCreationDate().getMonth());
        num.append(getCreationDate().getDayOfMonth());
        num.append(getCreationDate().getHour());
        num.append(getCreationDate().getMinute());
        num.append(getCreationDate().getSecond());
        num.append(getPhoneNumber().substring(getPhoneNumber().length() - 4));
        this.orderNumber = num.toString();
    }

    public ArrayList<Appliance> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Appliance> orderList) {
        this.orderList = orderList;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }
}
