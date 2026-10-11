class Shape {
    double getArea() {
        return 0.0;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double getArea() {
        return length * width;
    }
}

public class ShapeRectangleOverride {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Rectangle rectangle = new Rectangle(5.0, 3.0);
        System.out.println("Base shape area: " + shape.getArea());
        System.out.println("Rectangle area: " + rectangle.getArea());
    }
}
