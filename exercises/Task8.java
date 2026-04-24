/**
 * 
 * Write a program featuring an integer variable arguments method. 
 * The method should return the sum of all parameters and, for each parameter, 
 * the cumulative sum up to that point. 
 * For instance, given parameters (4, 5, 10), 
 * the program should compute the total for the first parameter, such as 4 = (1+2+3+4), 
 * and repeat this process for subsequent parameters.
 * 
 */

public class Task8 {
    int[] chosenArgs;    

    public Task8() {
    }

    public static void main(String[] args) {
        Task8 task = new Task8();
        int sumOfAllProcessedNum = 0;
        int[] arguments = {5, 8, 2};
        
        for (int i = 0; i < arguments.length; i++) {
            sumOfAllProcessedNum += task.cumulativeAdditionUpTo(arguments[i]); 
            System.out.println("Cumulative sum of argument[" + i +"] = " + task.cumulativeAdditionUpTo(arguments[i]));
        }
        System.out.println("Sum of all ptocessed argument = " + sumOfAllProcessedNum);
        
    }

    public int cumulativeAdditionUpTo(int point){
        int sumALL = 0;
        for (int i = 0; i <= point; i++) {
            sumALL += i;
        }
        return sumALL;
    }
}
