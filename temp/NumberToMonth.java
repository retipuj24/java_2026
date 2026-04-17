/*
Number to month(1-12) and print number of days of that month
Write a program that prompts the user to enter a month number 
(1 for January, 2 for February, etc.) 
and outputs the number of days in that month. 
Assume that February has 28 days.

In this program, 
we use a switch-case statement to handle different month numbers 
entered by the user. 
The switch statement checks the value of the variable month, a
nd executes the corresponding case block. 
If none of the cases match, the default block is executed
*/

import java.util.List;
import java.util.Scanner;

public class NumberToMonth {
    public static List<Integer> numOfDaysInMonth = List.of(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31);
    public static List<String> months = List.of(    "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December");
    
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
        String input = "";
        do {
            System.out.print("\nPlease enter 1 to 12 only for month number: > ");
            if (scanner.hasNextInt()) {
                int inputNumber = scanner.nextInt();
                getInput(inputNumber);
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
    public static void getInput(int inputNum){
        int inputNumber = inputNum;
        String msg = "=============================================================";
        clearScreen();
        switch (inputNumber) {          
            case 1:
                System.out.println(msg);
                System.out.println(getEquivMonth(inputNumber));
                System.out.println(msg);
                break;
            case 2:
                System.out.println(msg);
                System.out.println(getEquivMonth(inputNumber));
                System.out.println(msg);               
                break;
            case 3:
                System.out.println(msg);
                System.out.println(getEquivMonth(inputNumber));
                System.out.println(msg);   
                break;
            case 4:
                System.out.println(msg);
                System.out.println(getEquivMonth(inputNumber));
                System.out.println(msg);   
                break;
            case 5:
                System.out.println(msg);
                System.out.println(getEquivMonth(inputNumber));
                System.out.println(msg);  
                break;

            case 6:
                System.out.println(msg);
                System.out.println(getEquivMonth(inputNumber));
                System.out.println(msg);   
                break;

            case 7:
                System.out.println(msg);
                System.out.println(getEquivMonth(inputNumber));
                System.out.println(msg);  
                break;

            case 8:
                System.out.println(msg);
                System.out.println(getEquivMonth(inputNumber));
                System.out.println(msg);   
            case 9:
                System.out.println(msg);
                System.out.println(getEquivMonth(inputNumber));
                System.out.println(msg);   
                break;

            case 10:
                System.out.println(msg);
                System.out.println(getEquivMonth(inputNumber));
                System.out.println(msg);   
                break;

            case 11:
                System.out.println(msg);
                System.out.println(getEquivMonth(inputNumber));
                System.out.println(msg);   
                break;

            case 12:
                System.out.println(msg);
                System.out.println(getEquivMonth(inputNumber));
                System.out.println(msg);   
                break;
                
            default:
                System.out.print("\nSorry, Input must be from 1 to 12 only.\n");
                break;
        }
    }
 
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
 
    public static String getEquivMonth(int num){
        return "Month of " + months.get(--num) + " has " + numOfDaysInMonth.get(num) + " days.".toString();
    }
}
