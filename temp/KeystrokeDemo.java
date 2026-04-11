import java.util.Scanner;

public class KeystrokeDemo {
    static String input ="";

    public static void main(String[] args) {
        do{
            KeystrokeDemo.input = "";
            System.out.print("enter any character: ");
            askContinue();

            System.out.println("You have entered : " + input);
            
        }while(true);

    }

    static public void askContinue(){
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        if(answer.equalsIgnoreCase("y")){
            System.exit(0);
        }else{
            KeystrokeDemo.input = answer;
        }
        
    }
}
