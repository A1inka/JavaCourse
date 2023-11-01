package homework4.task7;

public class Stove extends Appliance {

    private String type;
    private int maxTemperature;

    public Stove(double price, String description, double length, double width, double height, double weight,
                 double power, String type, int maxTemperature, int batteryLife, String country, boolean gharantip) {
        super(price, description, length, width, height, weight, batteryLife, power, country, gharantip);
        this.type = type;
        this.maxTemperature = maxTemperature;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(int maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    @Override
    public void printInformation() {
        System.out.println("Плита: " + getType());
        System.out.println("Цена: " + getPrice() + " Р");
        System.out.println("Описание: " + getDescription());
        System.out.println("Габариты: " + getLength() + " м * " + getWidth() + " м * " + getHeight() + " м");
        System.out.println("Вес: " + getWeight() + " кг");
        System.out.println("Максимальная температура разогрева: " + getMaxTemperature() + " °C");
        if (getBatteryLife() == -1) {
            System.out.println("Может работать без подключения к электричеству");
        }
        else {
            System.out.println("Автономное время работы: " + getBatteryLife() + " ч");
        }
        System.out.println("Мощность: " + getPower() + " Вт");
        if (getCountry() != "Россия") {
            System.out.println("Страна " + getCountry());
            if (isGharantip()) {
                System.out.println("Гарантия: есть");
            } else {
                System.out.println("Гарантия: нет");
            }
        }
        else {
            System.out.println("Страна: Россия");
        }
    }
}
