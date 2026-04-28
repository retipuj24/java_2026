package task15;

public abstract class AbstractClass implements Shape{
    String color;
    double length;
    double width;

    // Constructor to initialize common attributes
    public AbstractClass(String color, double length, double width) {
        this.color = color;
        this.length = length;
        this.width = width;
    }
}
