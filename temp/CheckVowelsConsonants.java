/*
modified to an efficient user input getter
*/
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CheckVowelsConsonants {
    
    public static String input = "";

    public static void main(String[] args) {
  
        do{
            getInput("Enter a string: > " );
            showProcessedString(input);
        }while(true);
    } 
 
    public static void showProcessedString(String str){
        
        String hLine = "---------------------------------------------------------------------------------------------";
        String yellowBG = "\u001B[43m";
        String blackText = "\u001B[30m";
        String boldRedText = "\033[1;31m";
        String boldYellowText ="\033[1;33m";
        String reset = "\u001B[0m";
        String vowels = "AEIOUaeiou";
        String consonants = "CDFGHJKLMNPQRSTVWXYZcdfghjklmnpqrstvwxyz";
        List<Character> selectedChars = new ArrayList<>();

        System.out.println(hLine);
        System.out.printf(boldYellowText +"Entered string: " + reset);
        System.out.print(blackText +yellowBG + str+ reset +"\n");
        System.out.println(hLine);
        
        System.out.print(boldYellowText + "VOWELS"+ reset +" in entered string: ");    
        selectedChars = str.chars().mapToObj(c -> (char)c)
                                .filter(c-> vowels.indexOf(c)!= -1)
                                .collect(Collectors.toList());
        System.out.printf(blackText + yellowBG + selectedChars + reset + "\n");   
        System.out.print(boldYellowText + "CONSONANTS"+ reset +" in entered strings: ");   
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
    
    static public void getInput(String msg){
        String hLine = "---------------------------------------------------------------------------------------------";
        String yellowBG = "\u001B[43m";
        String blackText = "\u001B[30m";
        String boldRedText = "\033[1;31m";
        String boldYellowText ="\033[1;33m";
        String reset = "\u001B[0m";

        Scanner scanner = new Scanner(System.in);

        System.out.println(boldRedText + "Enter \"y\" to Exit this program." + reset);
        System.out.print("or " + boldYellowText + msg + reset);
        String answer = scanner.nextLine();
        if(answer.equalsIgnoreCase("y")){
            System.exit(0);
        }else{
            
            // checked this out - its possible to call the class static variable by instance variable
            // CheckVowelsConsonants cvc = new CheckVowelsConsonants();
            // cvc.input = answer;
            
            CheckVowelsConsonants.input = answer;
            clearScreen();
        }   
    }    
}
