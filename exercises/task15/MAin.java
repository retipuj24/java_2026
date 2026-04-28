package task15;

public class MAin {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle("Red", 5, 3);
        Shape circle = new Circle("Blue", 4);

        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());

        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());
    }
}
