package homework3.task6;

public class Main {

    public static void main (String[] args) {
        Circle circle = new Circle(100, 100, 10);
        Rectangle rectangle = new Rectangle(100, 100, 150, 200);
        Annotation annotationCircle = new Annotation("Tree", circle);
        Annotation annotationRectangle = new Annotation("Car", rectangle);
    }

}
