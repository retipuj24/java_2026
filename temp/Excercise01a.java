// package temp;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Excercise01a {
 

    public static void main(String[] args) {
     
        boolean continueInput = true;
        while (continueInput) {
            getInput();
            try {
                Scanner input2 = new Scanner(System.in);
                
                System.out.println("Do you want to continue? Y/N ");
                String answer = input2.next();
                System.out.println("Input is: " + answer);
                if (answer.equalsIgnoreCase("N")) {
                    continueInput = false;
                    input2.close();
                }else if (!answer.equalsIgnoreCase("Y")) {
                    System.out.println("Invalid input. Please enter Y or N.");
                }

            } catch (Exception e) {
                System.out.println("An error occurred while reading input: " + e.getMessage());
            }
        }

    }

    public static void getInput() {
        System.out.print("Enter three numbers: ");       

        Scanner input = new Scanner(System.in);
    
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        List<Integer> numbers = List.of(num1, num2, num3);
        List<Integer> numerals = numbers.stream()
                // .sorted((n1, n2) -> n1.compareTo(n2))
                .sorted()
                .collect(Collectors.toList());
        if(numerals.stream().distinct().count() == 1){
            System.out.println("All Numbers entered are Equal");
        } else {
            System.out.println("The largest number is: " + Collections.max(numerals));
            System.out.println("The smallest number is: " +Collections.min(numerals));  
        }
        input.close();   
    
        
    }
}   


