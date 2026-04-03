import java.util.Scanner;

public class ScoreToGrade {
     public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        // System.out.print("\nPlease enter Student Score  : > ");
        String input = "";
        do {
            System.out.print("\nPlease enter Student Score  : > ");
            if (scanner.hasNextInt()) {
                int inputScore = scanner.nextInt();
                getInputScore(inputScore);
            } else {
                System.out.println("THAT'S NOT A VALID SCORE!");
                scanner.next();   
            }
            System.out.print("Press 'y' to exit this program? (y) > ");
            input = scanner.next().toLowerCase();
        } while (!input.equalsIgnoreCase("y"));
        scanner.close();
    }   

    public static void getInputScore(int score) {       

        String grade;

        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("Score: " + score + " - Grade: " + grade);
    }
    
}

/*
A score of 90 or above gets an A grade
A score between 80 and 89 gets a B grade
A score between 70 and 79 gets a C grade
A score between 60 and 69 gets a D grade
A score below 60 gets an F grade
*/