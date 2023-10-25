package homework3.task5;

public class Plate extends Appliance {

    private String type;
    private int volume;
    private int maxTemperature;

    public Plate(double price, String description, double length, double width, double height, double weight,
                 int batteryLife, double power) {
        super(price, description, length, width, height, weight, batteryLife, power);
        this.type = type;
        this.volume = volume;
        this.maxTemperature = maxTemperature;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
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
        System.out.println("Цена: " + getPrice() + "Р");
        System.out.println("Описание: " + getDescription());
        System.out.println("Габариты: " + getLength() + " см * " + getWidth() + " см * " + getHeight() + " см");
        System.out.println("Вес: " + getWeight() + " кг");
        System.out.println("Объём духовки: " + getVolume() + " л");
        System.out.println("Максимальная температура разогрева: " + getMaxTemperature() + " °C");
        System.out.println("Автономное время работы: " + getBatteryLife() + " ч");
        System.out.println("Мощность: " + getPower() + " Вт");
    }
}
