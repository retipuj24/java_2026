import java.util.Scanner;

public class OddEvenDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        do {
            System.out.print("\nPlease enter a number only: > ");
            if (scanner.hasNextInt()) {
                int inputNumber = scanner.nextInt();
                System.out.println(evaluateInput(inputNumber));
            } else {
                System.out.println("THAT'S NOT A VALID NUMBER!");
                scanner.next();   
            }
            System.out.print("Press any key to continue, Press 'y' if you want to exit this program. Exit?(y) > ");
            input = scanner.next().toLowerCase();
            clearScreen();
        } while (!input.equalsIgnoreCase("y"));
        scanner.close();
    } 
        
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    public static String evaluateInput(int inputNum){
        int inputNumber = inputNum ;
        String msg = "===================================================================================";
        // String msg2 = "\"You have entered \" +inputNumber + \" equivalent as \" + dayEquivalentInWeek[--inputNumber] + \" of the Week.\\n\"";
        String oddEven = (inputNumber % 2 == 0) ? "EVEN" : "ODD";
        String zeroNum = (inputNumber == 0) ? "ZERO" : "NOT ZERO";
        String negPosNum = (inputNumber < 0) ? "NEGATIVE" : "POSITIVE";
        return msg + "\nYou have entered " + inputNumber + " which is an " + oddEven + " number, " + zeroNum + ", and " + negPosNum + ".\n" + msg;  
    }

}