import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task5 {
    public static String input = "";
    public static String message = "";
    
    public static void main(String[] args) {
  
        do{
            getInput("Enter three(3) numbers: > " );
            showProcessedString(input);
        }while(true);
    } 

    public static void showProcString(String str){

        List<String> enteredStrings = new ArrayList<>();
        List<Number> numberList = new ArrayList<>();
        double n1 = 0;
        
        try {
            if(numberList.size() < 3){
                n1 = Double.parseDouble(str);
                numberList.add(n1);
            }else{
                enteredStrings.add(str);
            }
        } catch (NumberFormatException e) { 
            // System.out.println("Its not a number");
            message = "Its not a number";
            enteredStrings.add(str);
        }
        
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
        String numbers = "01234567890.";
        List<Character> selectedChars = new ArrayList<>();
        List<Number> numberList = new ArrayList<>();
        
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
