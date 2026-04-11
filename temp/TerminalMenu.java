import java.util.Scanner;

public class TerminalMenu {
    public static void main(String[] args) {
        String[] options = {"Home", "Settings", "Profile", "Exit"};
        int selected = 0;
        Scanner sc = new Scanner(System.in);

        while (true) {
            // Clear console (Works in most modern terminals)
            System.out.print("\033[H\033[2J");
            System.out.flush();

            System.out.println("Use 'W' (Up), 'S' (Down), and 'E' to Select:");
            for (int i = 0; i < options.length; i++) {
                if (i == selected) {
                    // Highlight the current choice with a cursor/color
                    System.out.println("> [ " + options[i] + " ]"); 
                } else {
                    System.out.println("    " + options[i]);
                }
            }

            String input = sc.next().toLowerCase();
            if (input.equals("w") && selected > 0) selected--;
            else if (input.equals("s") && selected < options.length - 1) selected++;
            else if (input.equals("e")) {
                System.out.println("Selected: " + options[selected]);
                break;
            }
        }
    }
}