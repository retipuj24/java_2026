import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumOfAllIntegersAndAverage {
        public static List<Integer> numbers;
public static void main(String[] args) {
        numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String input = "";
        do {
            displayEnteredNumbers();
            System.out.print("\nPlease enter a number only: > ");
            if (scanner.hasNextInt()) {
                int inputNumber = scanner.nextInt();
                addInput(inputNumber);
                clearScreen();
                displayEnteredNumbers();
            } else {
                System.out.println("THAT'S NOT A VALID NUMBER!");
                scanner.next();   
            }
            System.out.print("\nPress any key to continue, \nPress 'y' if you want to exit this program. Exit?(y) > ");
            input = scanner.next().toLowerCase();
            clearScreen();
            
        } while (!input.equalsIgnoreCase("y"));
        scanner.close();
        // displayEnteredNumbers();
    } 
        
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    public static void addInput(int inputNum){
        int inputNumber = inputNum ;
        numbers.add(inputNumber);
    }
    public static void displayEnteredNumbers(){
        String msg = "===================================================================================";
        //String hLine = "--------------------------------------------------------------";
        String yellowBG = "\u001B[43m";
        String blackText = "\u001B[30m";
        String yellowText ="\u001B[33m";
        String reset = "\u001B[0m";

        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        double average = numbers.size() == 0? 0:sum/numbers.size();
        
        System.out.println(msg);
        System.out.println("Entered integers are: " + yellowBG + blackText + numbers + reset);
        System.out.println(yellowText + "SUM "+ reset +"of all entered integers is: " + yellowBG + blackText + sum + reset);
        System.out.println("The " + yellowText + "AVERAGE "+ reset + "is: " + yellowBG + blackText + average + reset);
        System.out.println(msg);
    }
}
