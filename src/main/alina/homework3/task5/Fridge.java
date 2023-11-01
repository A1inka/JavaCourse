package homework3.task5;

public class Fridge extends Appliance{

    private boolean miniFridge;
    private boolean hasFreezer;
    private int freezerTemperature;
    private int volume;

    public Fridge(double price, String description, double length, double width, double height, double weight,
                  int batteryLife, double power, boolean miniFridge, boolean hasFreezer, int freezerTemperature,
                  int volume, String country, boolean gharantip) {
        super(price, description, length, width, height, weight, batteryLife, power, country, gharantip);
        this.miniFridge = miniFridge;
        this.hasFreezer = hasFreezer;
        this.freezerTemperature = freezerTemperature;
        this.volume = volume;
    }

    public boolean isMiniFridge() {
        return miniFridge;
    }

    public void setMiniFridge(boolean miniFridge) {
        this.miniFridge = miniFridge;
    }

    public boolean isHasFreezer() {
        return hasFreezer;
    }

    public void setHasFreezer(boolean hasFreezer) {
        this.hasFreezer = hasFreezer;
    }

    public int getFreezerTemperature() {
        return freezerTemperature;
    }

    public void setFreezerTemperature(int freezerTemperature) {
        this.freezerTemperature = freezerTemperature;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void printInformation() {
        if (isMiniFridge()) {
            if (isHasFreezer()) {
                System.out.println("Мини-холодильник с морозильной камерой");
            }
            else {
                System.out.println("Мини-холодильник");
            }
        }
        else {
            if (isHasFreezer()) {
                System.out.println("Холодильник с морозильной камерой");
            } else {
                System.out.println("Холодильник без морозильной камеры");
            }
        }
        System.out.println("Цена: " + getPrice() + " Р");
        System.out.println("Описание: " + getDescription());
        System.out.println("Габариты: " + getLength() + " м * " + getWidth() + " м * " + getHeight() + " м");
        System.out.println("Вес: " + getWeight() + " кг");
        System.out.println("Объём: " + getVolume() + " л");
        System.out.println("Автономное сохранение холода: " + getBatteryLife() + " ч");
        if (isHasFreezer()) {
            System.out.println("Температура морозильной камеры: " + getFreezerTemperature() + " °C");
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
