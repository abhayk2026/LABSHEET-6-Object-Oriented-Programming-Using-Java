abstract class Shape {
    abstract double calculateArea();
    abstract double calculatePerimeter();
}

class Circle extends Shape {
    private double radius;

    Circle(double radius) { this.radius = radius; }

    @Override
    double calculateArea() { return Math.PI * radius * radius; }

    @Override
    double calculatePerimeter() { return 2 * Math.PI * radius; }
}

class Triangle extends Shape {
    private double a, b, c;

    Triangle(double a, double b, double c) {
        if (a + b <= c || a + c <= b || b + c <= a || a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalArgumentException("Triangle sides must be positive and form a triangle.");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    double calculateArea() {
        double s = (a + b + c) / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c)); // Heron's formula.
    }

    @Override
    double calculatePerimeter() { return a + b + c; }
}

public class AbstractShapeCalculations {
    public static void main(String[] args) {
        Shape circle = new Circle(4.0);
        Shape triangle = new Triangle(3.0, 4.0, 5.0);
        System.out.printf("Circle area: %.2f, perimeter: %.2f%n",
                circle.calculateArea(), circle.calculatePerimeter());
        System.out.printf("Triangle area: %.2f, perimeter: %.2f%n",
                triangle.calculateArea(), triangle.calculatePerimeter());
    }
}
