package homework3.task5;

public class Fridge extends Appliance{

    private boolean miniFridge;
    private boolean hasFreezer;
    private int freezerTemperature;
    private int volume;

    public Fridge(double price, String description, double length, double width, double height, double weight,
                  int batteryLife, double power) {
        super(price, description, length, width, height, weight, batteryLife, power);
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
                System.out.println("Холодильник");
            }
            System.out.println("Цена: " + getPrice() + "Р");
            System.out.println("Описание: " + getDescription());
            System.out.println("Габариты: " + getLength() + " см * " + getWidth() + " см * " + getHeight() + " см");
            System.out.println("Вес: " + getWeight() + " кг");
            System.out.println("Объём: " + getVolume() + " л");
            System.out.println("Автономное сохранение холода: " + getBatteryLife() + " ч");
            if (isHasFreezer()) {
                System.out.println("Температура морозильной камеры: " + getFreezerTemperature() + " °C");
            }
            System.out.println("Мощность: " + getPower() + " Вт");
        }
    }
}
