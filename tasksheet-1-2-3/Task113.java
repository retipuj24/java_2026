/**
 * 
 * Steps/Procedure:  
 * Open your Java IDE and create a java file, name it tasksheet-1-1-3 or 
 * follow the Trainer's instructions for online IDE's. 
 * Create an int variable and name it check_number 
 * with an initial value of 10. 
 * Create a String variable and name it message. 
 * Use check_number as a condition on how many loops 
 * the program can print. 
 * Create a loop that will check and print each number if odd or 
 * even numbers using this syntax:  
 * message = (i%2==0) ? i+' is even number' : i+' is odd number'; 
 * The next line should print message value. 
 * Submit the link of your source code.
 * 
 * 
 * 
 */
public class Task113 {
    public static void main(String[] args) {
        int check_number = 10;
        String message;

        for (int i = 1; i <= check_number; i++) {
            message = (i%2==0) ? i+" is even number" : i+ " is odd number";
            System.out.println(message);
        }
    }
}


