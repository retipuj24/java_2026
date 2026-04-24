import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Task7 {
    public static String input;
    List<String> enteredList;
    List<Number> numberList;

    public Task7(){
        enteredList = new ArrayList<>();
        numberList = new ArrayList<>();
    }
    
    public static void main(String[] args) {
        Task7 task = new Task7();
        boolean toContinue = true;
        do{
            // clearScreen();
            // task.printTheList();      
            task.getInput("Enter two(2) numbers: > " );
            task.processTheInput(input);
            clearScreen();
            task.printTheList();   
            toContinue = task.countEqualsTo(2);             
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

        double num1 = 0.0;
        double num2 = 0.0;
        
        if(this.numberList.size() == 2){
            if (numberList.get(0).getClass().equals(Integer.class)) {
                int tempInt = 0; 
                tempInt = (int) numberList.get(0);
                num1 = (double) tempInt;
            }else{
                num1 = (double) numberList.get(0);
            }

            if (numberList.get(1).getClass().equals(Integer.class)) {
                int tempInt = 0; 
                tempInt = (int) numberList.get(1);
                num2 = (double) tempInt;
            }else{
                num2 = (double) numberList.get(1);
            }
            
            System.out.println(greeenText + "Addition of " + reset + num1 + " and " +  num2 + " is " +   yellowBG + blackText + this.add(num1, num2)+ reset);
            System.out.println(greeenText + "Subrtaction of " + reset+ num1 + " and " +  num2 + " is " +   yellowBG + blackText + this.subtract(num1, num2)+ reset);
            System.out.println( greeenText + "Multiplication of " + reset + num1 + " and " +  num2 + " is " + yellowBG + blackText +  this.multiply(num1, num2)+ reset);
            System.out.println(greeenText + "Division of " + reset + num1 + " and " +  num2 + " is " +  yellowBG + blackText + this.divide(num1, num2)+ reset);
            System.out.println(hLine);
        }
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
            Task7.input = answer;
        }  
    }  
    
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    
    public double add(Number n1, Number n2){
        return (n1.doubleValue() + n2.doubleValue());
    }
    
    public double subtract(Number n1, Number n2){
        return (n1.doubleValue() - n2.doubleValue());
    }
    
    public double multiply(Number n1, Number n2){
        return (n1.doubleValue() * n2.doubleValue());
    }
    
    public double divide(Number n1, Number n2){
        return (n1.doubleValue() / n2.doubleValue());
    }
}
