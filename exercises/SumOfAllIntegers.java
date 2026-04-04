import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumOfAllIntegers {
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
            System.out.print("Press any key to continue, Press 'y' if you want to exit this program. Exit?(y) > ");
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
        System.out.println(msg);
        System.out.println("Entered integers are: " + numbers);
        System.out.println("Sum of all entered integers is: " + numbers.stream().mapToInt(Integer::intValue).sum());
        System.out.println(msg);
    }
}
