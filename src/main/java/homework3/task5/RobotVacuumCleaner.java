package homework3.task5;

public class RobotVacuumCleaner extends Appliance {

    private double volume;
    public RobotVacuumCleaner(double price, String description, double length, double width, double height,
                              double weight, int batteryLife, double power) {
        super(price, description, length, width, height, weight, batteryLife, power);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public void printInformation() {
        System.out.println("Робот-пылесос");
        System.out.println("Цена: " + getPrice() + "Р");
        System.out.println("Описание: " + getDescription());
        System.out.println("Габариты: " + getLength() + " см * " + getWidth() + " см * " + getHeight() + " см");
        System.out.println("Вес: " + getWeight() + " кг");
        System.out.println("Объём контейнера для пыли: " + getVolume() + " кг");
        System.out.println("Автономное время работы: " + getBatteryLife() + " мин");
        System.out.println("Мощность: " + getPower() + " Вт");
    }
}
