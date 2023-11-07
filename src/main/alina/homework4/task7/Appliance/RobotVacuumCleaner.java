package homework4.task7.Appliance;

import homework4.task7.Appliance.Appliance;

public class RobotVacuumCleaner extends Appliance {

    private double volume;
    public RobotVacuumCleaner(double price, String description, double length, double width, double height,
                              double weight, int batteryLife, double power, double volume, String country, boolean gharantip) {
        super(price, description, length, width, height, weight, batteryLife, power, country, gharantip);
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
        System.out.println("Цена: " + getPrice() + " Р");
        System.out.println("Описание: " + getDescription());
        System.out.println("Габариты: " + getLength() + " м * " + getWidth() + " м * " + getHeight() + " м");
        System.out.println("Вес: " + getWeight() + " кг");
        System.out.println("Объём контейнера для пыли: " + getVolume() + " кг");
        System.out.println("Автономное время работы: " + getBatteryLife() + " мин");
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

    @Override
    public String printName() {
        return ("Робот-пылесос");
    }
}
