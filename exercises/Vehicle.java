public class Vehicle {
    private String make; 
    private String model; 
    private int year; 

    public Vehicle(String make, String model, int year) {
        this.make = make; 
        this.model = model; 
        this.year = year; 
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    
}

class Car extends Vehicle {
    private int numberOfDoors; 

    
    public Car(String make, String model, int year, int numberOfDoors) {
        super(make, model, year); 
        this.numberOfDoors = numberOfDoors; 
    }

    public void displayDetails() {
        System.out.println("Car Details: ");
        System.out.println("Make: " + this.getMake()); 
        System.out.println("Model: " + this.getModel()); 
        System.out.println("Year: " + this.getYear()); 
        System.out.println("Number of Doors: " + this.getNumberOfDoors()); 
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}

class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 2022, 4);
        car.displayDetails();
    }
}

/**
 * Task13.java

1. Create a base class called Vehicle with the following attr`ibutes:
make (String): The make of the vehicle.
model (String): The model of the vehicle.
year (int): The manufacturing year of the vehicle
2. Create a derived class called Car that extends the Vehicle class. T
he Car class should have an additional attribute:
numberOfDoors (int): The number of doors in the car.
3. Create an instance of the Car class and set values for its attributes.
4. Implement a method in the Car class called displayDetails() that prints out the details of the car, including the inherited attributes from the Vehicle class.

Sample output: 


Car Details: 
Make: Toyota 
Model: Camry 
Year: 2022 
Number of Doors: 4
 */