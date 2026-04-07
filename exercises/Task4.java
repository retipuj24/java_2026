import java.util.Scanner;

public class Task4 {
    private static String inpuString;
    public static void main(String[] args) {
        getInput("Enter your name", 1, 100);
        processString(getValidString());

        
    }

    public static void getInput(String prompt, int min, int max) {
        boolean notValid = true; 
        do {
            // clearScreen();
            Scanner scanner = new Scanner(System.in);
            inpuString= "";
            System.out.print(prompt + ": > ");
            String inpStr = scanner.nextLine().trim();
            if(inpStr.length() >  0 ){
                inpuString = inpStr;
                notValid =false;
            }else{
                notValid = true;
                System.out.println("NOT VALID INPUT!");
                System.out.print("Press any key to continue, Press 'y' if you want to exit this program. Exit?(y) > ");
                inpStr = scanner.next().toLowerCase().trim();

                if(inpStr.equalsIgnoreCase("y")){
                    clearScreen();
                    System.out.println("\n\nThank you buboy!\n");
                    System.exit(0);
                }else{
                    clearScreen();
                    scanner.nextLine();
                    notValid = true;
                }
            }
        } while (notValid);
        
    }
    public static String getValidString(){
        return inpuString;

    }
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    public static void processString(String str){
        String hLine = "---------------------------------------------------------------------------------------------";
        String yellowBG = "\u001B[43m";
        String blackText = "\u001B[30m";
        String yellowText ="\u001B[33m";
        String reset = "\u001B[0m";

        StringBuilder sb = new StringBuilder(str);
        String reversedString = sb.reverse().toString();
        System.out.println(hLine);
        System.out.println("Original String: " + yellowBG+ blackText +  str + reset);
        System.out.println("The input string is " + yellowText + (reversedString.equalsIgnoreCase(str) ? "A PALINDROME" : "NOT A PALINDROME") + reset );
        System.out.println(hLine);        
    }
}

/*
Write a program that takes a string as input and checks if it is a palindrome. A palindrome is a word, number, or other sequence of characters that reads the same forward and backward.
Your program should perform the following steps:

Use StringBuilder to create a new string that is a reverse of the input string.
Use the equals() method to check if the input string and the reversed string are the same.
If the strings are the same, print "The input string is a palindrome."
If the strings are not the same, print "The input string is not a palindrome."

*/
