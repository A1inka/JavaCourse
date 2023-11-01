package homework3.task6;

public class Main {

    public static void main (String[] args) {

        Circle circle = new Circle(100, 100, 10);
        Rectangle rectangle = new Rectangle(100, 100, 150, 200);
        Annotation annotationCircle = new Annotation("Tree", circle);
        Annotation annotationRectangle = new Annotation("Car", rectangle);
        System.out.println(annotationRectangle.toString()); //Rectangle (100, 100), (150, 200): Car
        System.out.println(annotationCircle.toString()); //Circle (100, 100), 10: Tree

        AnnotatedImage testImage = new AnnotatedImage("fafa", new Annotation[]{annotationCircle, annotationRectangle});

        circle.move(10, 10);
        System.out.println(circle.getX()); //110
        System.out.println(circle.getY()); //110

        rectangle.move(-10, -10);
        System.out.println(rectangle.getX()); //90
        System.out.println(rectangle.getY()); //90
        System.out.println(rectangle.getX2()); //140
        System.out.println(rectangle.getY2()); //190

        System.out.println(testImage.findByPoint(108, 108)); //Circle (110, 110), 10: Tree
        System.out.println(testImage.findByPoint(0, 0)); //null
        System.out.println(testImage.findByPoint(93, 147)); //Rectangle(90, 90), (140, 190): Car
    }
}
