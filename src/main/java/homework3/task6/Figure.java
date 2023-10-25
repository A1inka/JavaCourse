package homework3.task6;

import java.awt.*;

public abstract class Figure implements Movable{

    protected int x;
    protected int y;

    public Figure(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void move (int dx, int dy) {
        setX(getX() + dx);
        setY(getY() + dy);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}
