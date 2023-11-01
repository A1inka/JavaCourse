package homework3.task6;

public class Rectangle extends Figure {

    private int x2;
    private int y2;

    public Rectangle(int x, int y, int x2, int y2) {
        super(x, y);
        this.x2 = x2;
        this.y2 = y2;
    }

    @Override
    public void move(int dx, int dy) {
        setX(dx + getX());
        setY(dy + getY());
        setX2(dx + getX2());
        setY2(dx + getY2());
    }

    @Override
    public String toString() {
        return "Rectangle (" + getX() + ", " + getY() + "), (" + getX2() + ", " + getY2() + "): ";
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }
}
