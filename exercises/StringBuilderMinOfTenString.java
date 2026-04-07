/*
Write a program that prompts the user to enter a string of at least 10 characters. 
Using the StringBuilder class, 
perform the following operations:

Print the length of the string.
Print the first character of the string.
Print the last character of the string.
Print the index of the first occurrence of the letter 'a' in the string.
Print the substring of the string from index 3 to index 6.
Append the string "123" to the end of the string.
Insert the string "xyz" at index 4.
Delete the substring from index 2 to index 4.
Delete the character at index 8.
Reverse the string and print it.
Your program should utilize the charAt(), indexOf(), length(), 
substring(), append(), insert(), 
delete(), deleteCharAt(), and reverse() methods of the StringBuilder class.
*/

import java.util.Scanner;

public class StringBuilderMinOfTenString {
    private static String inpuString;
    public static void main(String[] args) {
        getInput("Enter your name", 10, 400);
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
            String[] words = inpStr.split("\\s+");
            System.out.println("Word Count / Length: " + words.length);
            if(words.length >= min && words.length <= max){
                inpuString = inpStr;
                notValid = false;
            }else{
                notValid = true;
                System.out.println("NOT VALID INPUT, MUST BE TEN(10) WORDS ABOVE!");
                System.out.print("Press any key to continue, Press 'y' if you want to exit this program. Exit?(y) > ");
                inpStr = scanner.next().toLowerCase();

                if(inpStr.equalsIgnoreCase("y")){
                    clearScreen();
                    System.out.println("\n\nThank you buboy!\n");
                    System.exit(0);
                }else{
                    clearScreen();
                    scanner.nextLine();
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
        System.out.println(hLine);
        System.out.println("Original String: " + yellowBG+ blackText +  str + reset);
        System.out.println(hLine);
        System.out.println("Printing the " + yellowText + "length " + reset +  "using StringBuilder: " + yellowBG+ blackText + sb.length() + reset);
        System.out.println("Printing the " + yellowText + " first character " + reset + "using StringBuilder: " + yellowBG+ blackText + sb.charAt(0) + reset);
        System.out.println("Printing the " + yellowText + "last character " + reset + "using StringBuilder: " + yellowBG+ blackText + sb.charAt(sb.length()-1) + reset);
        System.out.println("Print the " + yellowText + "index of the first occurrence of the letter 'a' " + reset + "using StringBuilder: " + yellowBG+ blackText + sb.indexOf("a") + reset);
        System.out.println("Print the " + yellowText + " substring of the string from index 3 to index 6 using StringBuilder: " + yellowBG+ blackText + sb.substring(3, 6) + reset);
        System.out.println("Append the string " + yellowText + "\"123\" to the end " + reset + "using StringBuilder: " + yellowBG+ blackText + sb.append("\"123\"") + reset);
        System.out.println("Insert the string " + yellowText + "\"xyz\" at index 4 "+ reset +"using StringBuilder: " + yellowBG+ blackText + sb.insert(4, "\"xyz\"") + reset);  
        System.out.println("Delete the " + yellowText + "character at index 8 " + reset + "using StringBuilder: " + yellowBG+ blackText + sb.deleteCharAt(8) + reset);
        System.out.println( yellowText + "Reverse the string and print it " + reset + "using StringBuilder: " + yellowBG+ blackText + sb.reverse() + reset);
        System.out.println(hLine);
        
        
    }
    
}
