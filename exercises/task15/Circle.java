package task15;

public class Circle extends AbstractClass {
    double radius;

    public Circle(String color, double radius) {
        super(color, 0, 0); // length and width are not relevant for Circle
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
    
}
