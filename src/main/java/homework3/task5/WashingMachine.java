package homework3.task5;

public class WashingMachine extends Appliance{

    private boolean dryer;
    private int maxSpeedSpin;
    private int maxLoading;

    public WashingMachine(double price, String description, double length, double width, double height, double weight,
                          int batteryLife, double power) {
        super(price, description, length, width, height, weight, batteryLife, power);
        this.dryer = dryer;
        this.maxLoading = maxLoading;
        this.maxSpeedSpin = maxSpeedSpin;
    }

    public boolean isDryer() {
        return dryer;
    }

    public void setDryer(boolean dryer) {
        this.dryer = dryer;
    }

    public int getMaxSpeedSpin() {
        return maxSpeedSpin;
    }

    public void setMaxSpeedSpin(int maxSpeedSpin) {
        this.maxSpeedSpin = maxSpeedSpin;
    }

    public int getMaxLoading() {
        return maxLoading;
    }

    public void setMaxLoading(int maxLoading) {
        this.maxLoading = maxLoading;
    }

    @Override
    public void printInformation() {
        if (isDryer()) {
            System.out.println("Стиральная машина с сушкой");
        }
        else {
            System.out.println("Стиральная машина");
        }
        System.out.println("Цена: " + getPrice() + "Р");
        System.out.println("Описание: " + getDescription());
        System.out.println("Габариты: " + getLength() + " см * " + getWidth() + " см * " + getHeight() + " см");
        System.out.println("Вес: " + getWeight() + " кг");
        System.out.println("Максимальная загрузка вещей: " + getMaxLoading() + " кг");
        System.out.println("Скорость отжима: " + getMaxSpeedSpin() + " об/мин");
        System.out.println("Автономное время работы: " + getBatteryLife() + " ч");
        System.out.println("Мощность: " + getPower() + " Вт");
    }
}
