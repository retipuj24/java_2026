import java.util.Scanner;

/**
 * Write a program that takes a user input string and performs the following operations:
1. Find and print the length of the string.
2. Convert the string to uppercase and print it.
3. Convert the string to lowercase and print it.
4. Print the first character of the string.
5. Print the last character of the string.
6. Print the substring starting from the second character to the fifth character of the string
 */
public class StringMethods {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        // System.out.print("Please enter a string: > ");
     
        do{
            // input = "";
            System.out.print("Please enter a string: > ");
            if(scanner.hasNextLine()){
                input = scanner.nextLine();
                // System.out.println(">> You entered: " + input);
                clearScreen();
                showProcessedString(input);

                // scanner.next();
            } else {
                System.out.println("THAT'S NOT A VALID STRING!");
                scanner.next();   
            }
            System.out.print("Press any key to continue, Press 'y' if you want to exit this program. Exit?(y) > ");
            input = scanner.next().toLowerCase();
            clearScreen();
            scanner.nextLine();
        }while(!input.equalsIgnoreCase("y"));

        scanner.close();
        
    } 

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
 
    public static void showProcessedString(String str){
        String hLine = "--------------------------------------------------------------";
        String yellowBG = "\u001B[43m";
        String blackText = "\u001B[30m";
        String reset = "\u001B[0m";

        System.out.println(hLine);
        System.out.printf(yellowBG + blackText +"Entered string: " + blackText +yellowBG + str+ reset +"\n");
        System.out.println(hLine);
        
        System.out.print("Length of the string: ");     
            System.out.printf(blackText + yellowBG + str.length() + reset + "\n");   
        System.out.print("String in uppercase: ");    
            System.out.printf(blackText + yellowBG + str.toUpperCase() + reset + "\n");   
        System.out.print("String in lowercase: ");         
            System.out.printf(blackText + yellowBG + str.toLowerCase()+ reset + "\n");   
        System.out.print("First character of the string: "); 
            System.out.printf(blackText + yellowBG + str.charAt(0) + reset + "\n");   
        System.out.print("Last character of the string: ");   
            System.out.printf(blackText + yellowBG + str.charAt(str.length()-1) + reset + "\n");  
        System.out.print("Printing the string from 2nd to fifth character: ");   
            System.out.printf(blackText + yellowBG + str.substring(1, 5) + reset + "\n");  
        System.out.println(hLine);
    }    
}
