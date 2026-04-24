/**
 * 
 * Math Operations with Static Import
 * Create a Java program that performs 
 * basic math operations 
 * (addition, subtraction, multiplication, division) 
 * using static imports for the Math class methods. 
 * The program should have the following features:
 * Define a class named Task9.
 * Inside the class, create static methods for addition, subtraction, multiplication, and division. 
 * Each method should take two parameters and return the result.
 * Use static imports for the Math class methods 
 * (Math.addExact(), Math.subtractExact(), Math.multiplyExact(), Math.floorDiv()).
 * In the main method, 
 * demonstrate the use of these static methods by performing some math operations with different values.
 * Display the results of each operation.
 */


public class Task9{

    public static int add(int a, int b) {
        return Math.addExact(a, b);
    }

    public static int subtract(int a, int b) {
        return Math.subtractExact(a, b);    
    }

    public static int multiply(int a, int b) {
        return Math.multiplyExact(a, b);
    }

    public static float divide(int a, int b) {
        return Math.floorDiv(a, b);
    }

    public static void main(String[] args) {
        // Demonstrate the math operations here
        int a1 = 10;
        int b1 = 85;
        
        System.out.println("Addition: " + Task9.add(a1, b1));
        System.out.println("Subtraction: " + Task9.subtract(a1, b1));
        System.out.println("Multiplication: " + Task9.multiply(a1, b1));
        System.out.println("Division: " + Task9.divide(a1, b1));
    }
}