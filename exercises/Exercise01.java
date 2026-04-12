
import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) throws java.io.IOException {
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
}