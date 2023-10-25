package homework3.task5;

public abstract class Appliance {

    protected double power;
    protected double price;
    protected String description;

    protected double length, width, height, weight;
    protected int batteryLife;

    public Appliance(double price, String description, double length, double width, double height, double weight,
                     int batteryLife, double power) {
        this.price = price;
        this.description = description;
        this.length = length;
        this.height = height;
        this.width = width;
        this.weight = weight;
        this.batteryLife = batteryLife;
        this.power = power;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(int batteryLife) {
        this.batteryLife = batteryLife;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public abstract void printInformation();
}
