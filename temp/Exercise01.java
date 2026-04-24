
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercise01 {
    public static String input = "";
    List<Integer> numbers;
    List<String> nonNumbers;

    public static void main(String[] args) throws java.io.IOException {
        Exercise01 exer1 = new Exercise01();
        exer1.numbers = new ArrayList<>();
        exer1.nonNumbers = new ArrayList<>();
        
        do{
            getInput("Enter three numbers: > ");
        }while(true);
    }

    public void sortInput(String inp){
        String newString = "";
        if(inp.is)
        if (inp.isBlank() || inp.isEmpty()){

        }    
     
    }

    public static showInput(){
        
        String hLine = "---------------------------------------------------------------------------------------------";
        String yellowBG = "\u001B[43m";
        String blackText = "\u001B[30m";
        String boldRedText = "\033[1;31m";
        String boldYellowText ="\033[1;33m";
        String reset = "\u001B[0m";
        String vowels = "AEIOUaeiou";
        String consonants = "CDFGHJKLMNPQRSTVWXYZcdfghjklmnpqrstvwxyz";

        List<Character> selectedChars = new ArrayList<>();

    }

    public static void showOldProgram() {
        System.out.print("Enter three numbers: ");
        Scanner input = new Scanner(System.in);
        
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        

        if(num1 > num2 && num1 > num3) {
            System.out.println("The largest number is: " + num1);
        } else if(num2> num1 && num2 > num3) {
            System.out.println("The largest number is: " + num2);
        } else if(num1 == num2 && num2 == num3) {
            System.out.println("All numbers are equal: " + num1);
        } else {
            System.out.println("The largest number is: " + num3);
        }
        input.close();
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
    
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}