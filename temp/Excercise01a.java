package temp;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class Excercise01a {
 

    public static void main(String[] args) throws java.io.IOException {
        System.out.print("Enter three numbers: ");
        Scanner input = new Scanner(System.in);
    
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        List<Integer> numbers = List.of(num1, num2, num3);
        // numbers.stream()
        //         .sorted()
        //         .forEach(System.out::println); 
        int largest = numbers.stream()
                .max(Integer::compare)
                .orElseThrow(() -> new IllegalArgumentException("No numbers provided"));
        System.out.println("The largest number is: " + Collections.max(numbers) );
        System.out.println(Collections.min(numbers)
    );
    }   
    
}
