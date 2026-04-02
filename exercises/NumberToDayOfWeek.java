import java.util.Scanner;

public class NumberToDayOfWeek {
    static String[] dayEquivalentInWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"} ;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        do {
            System.out.print("\nPlease enter 1 to 7 only for day in Week equivalent: > ");
            if (scanner.hasNextInt()) {
                int inputNumber = scanner.nextInt();
                getInput(inputNumber);
            } else {
                System.out.println("THAT'S NOT A VALID NUMBER!");
                scanner.next();   
            }
            System.out.println("Do you want to exit this program? (y/n) > ");
            input = scanner.next().toLowerCase();
        } while (!input.equalsIgnoreCase("y"));
    }

    public static void getInput(int inputNum){
        int inputNumber = inputNum ;

                
        switch (inputNumber) {

            case 1:
                System.out.println("\nYou have entered " +inputNumber + " equivalent as " + dayEquivalentInWeek[--inputNumber] + " of the Week.\n");
                break;
            case 2:
                System.out.println("\nYou have entered " +inputNumber + " equivalent as " + dayEquivalentInWeek[--inputNumber] + " of the Week.\n");               
                break;
            case 3:
                System.out.println("\nYou have entered " +inputNumber + " equivalent as " + dayEquivalentInWeek[--inputNumber] + " of the Week.\n");               
                break;
            case 4:
                System.out.println("\nYou have entered " +inputNumber + " equivalent as " + dayEquivalentInWeek[--inputNumber] + " of the Week.\n");               
                break;
            case 5:
                System.out.println("\nYou have entered " +inputNumber + " equivalent as " + dayEquivalentInWeek[--inputNumber] + " of the Week.\n");               
                break;
            case 6:
                System.out.println("\nYou have entered " +inputNumber + " equivalent as " + dayEquivalentInWeek[--inputNumber] + " of the Week.\n");               
                break;
            case 7:
                System.out.println("\nYou have entered " +inputNumber + " equivalent as " + dayEquivalentInWeek[--inputNumber] + " of the Week.\n");               
                break;
            default:
                System.out.println("\nSorry, Input must be from 1 to 7 only.\n");
                break;
        }
    }
}
