import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Task5 {
    public static String input = "";

    List<String> enteredList;
    List<Number> numberList;

    public Task5(){
        enteredList = new ArrayList<>();
        numberList = new ArrayList<>();
    }
    
    public static void main(String[] args) {
        Task5 task = new Task5();
        boolean toContinue = true;
        do{
            // clearScreen();
            // task.printTheList();      
            task.getInput("Enter three(3) numbers: > " );
            task.processTheInput(input);
            clearScreen();
            task.printTheList();   
            toContinue = task.countEqualsTo(3);             
        }while(toContinue);
    } 

        
    public void processTheInput(String input){
        Pattern p = Pattern.compile("^[+-]?\\d*(\\.\\d+)?$");
        Matcher matcher = p.matcher(input);
        boolean isNumeric = matcher.find();  
        
        if(isNumeric){
            try { this.numberList.add(Integer.parseInt(input)); } 
            catch (NumberFormatException e) { this.numberList.add(Double.parseDouble(input)); }
        }
    }   

    public void printTheList(){
        String hLine = "---------------------------------------------------------------------------------------------";
        String yellowBG = "\u001B[43m";
        String blackText = "\u001B[30m";
        String boldRedText = "\033[1;31m";
        String boldYellowText ="\033[1;33m";
        String greeenText = "\u001B[32m";
        String reset = "\u001B[0m";
        System.out.println(hLine);
        System.out.println("Entered numbers: " + yellowBG + blackText + this.numberList + reset);
        
        List<Number> arr = new ArrayList<>(this.numberList);
        Collections.sort(arr, Comparator.comparingDouble(Number::doubleValue));
        // System.out.println(arr);
        
        boolean allSame = new HashSet<>(numberList).size() == 1;
        String comparedString = allSame?"EQUAL." : "NOT EQUAL.";

        System.out.println("ALL Numbers are " + greeenText + comparedString +  reset);
        System.out.println(greeenText + "LARGEST NUMBER : "+ reset + yellowBG + blackText + arr.get(arr.size()-1)+reset);
        System.out.println(hLine);
    }
       
    public boolean countEqualsTo(int size){
        return this.numberList.size() < size;
    }

    public void getInput(String msg){
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
        }

        else{    
            
            Task5.input = answer;
        }  
    }  
    
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
