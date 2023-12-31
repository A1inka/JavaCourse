package homework3.task6;

public class Circle extends Figure {

    private int radius;

    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle (" + getX() + ", " + getY() + "), " + getRadius() + ": ";
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

}
