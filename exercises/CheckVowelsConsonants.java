import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CheckVowelsConsonants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        // System.out.print("Please enter a string: > ");
     
        do{
            // input = "";
            System.out.print("\nPlease enter a string: > ");
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
 
    public static void showProcessedString(String str){
        String hLine = "---------------------------------------------------------------------------------------------";
        String yellowBG = "\u001B[43m";
        String blackText = "\u001B[30m";
        String reset = "\u001B[0m";
        String vowels = "AEIOUaeiou";
        String consonants = "CDFGHJKLMNPQRSTVWXYZcdfghjklmnpqrstvwxyz";
        List<Character> selectedChars = new ArrayList<>();

        System.out.println(hLine);
        System.out.printf(yellowBG + blackText +"Entered string: " + blackText +yellowBG + str+ reset +"\n");
        System.out.println(hLine);
        
        System.out.print("VOWELS in entered string: ");    
        selectedChars = str.chars().mapToObj(c -> (char)c)
                                .filter(c-> vowels.indexOf(c)!= -1)
                                .collect(Collectors.toList());
        System.out.printf(blackText + yellowBG + selectedChars + reset + "\n");   
        System.out.print("CONSONANTS in entered strings: ");   
        selectedChars.clear();
        selectedChars = str.chars().mapToObj(c -> (char)c)
                                .filter(c-> consonants.indexOf(c) != -1)
                                .collect(Collectors.toList());
        System.out.printf(blackText + yellowBG + selectedChars + reset + "\n");   
        System.out.println(hLine);
    }    
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    
}
