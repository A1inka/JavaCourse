package homework3.task6;

public class AnnotatedImage {
    private final String imagePath;

    private final Annotation[] annotations;

    public AnnotatedImage(String imagePath, Annotation... annotations) {
        this.imagePath = imagePath;
        this.annotations = annotations;
    }

    public Annotation findByPoint(int x, int y) {
        for (Annotation annotation : annotations) {
            Figure figure = annotation.getFigure();
            if (figure instanceof Circle) {
                Circle circle = (Circle) figure;
                int dx = x - circle.x;
                int dy = y - circle.y;
                if (dx * dx + dy * dy <= circle.getRadius() * circle.getRadius()) {
                    return annotation;
                }
            }
            else {
                Rectangle rectangle = (Rectangle) figure;
                if (rectangle.getX() <= x && rectangle.getY() <= y && rectangle.getX2() >= x && rectangle.getY2() >= y) {
                    return annotation;
                }
            }
        }
        return null;
    }

    public Annotation findByLabel(String label) {
        for (Annotation annotation: annotations) {
            if (annotation.getLabel().contains(label)) {
                return annotation;
            }
        }
        return null;
    }

    public String getImagePath() {
        return this.imagePath;
    }

    public Annotation[] getAnnotations() {
        return this.annotations;
    }

}
