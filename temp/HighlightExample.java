public class HighlightExample {
    public static void main(String[] args) {
        String yellowBG = "\u001B[43m";
        String blackText = "\u001B[30m";
        String reset = "\u001B[0m";

        System.out.println(yellowBG + blackText + " This text is highlighted! " + reset);
        String anotherText = "This text is Another Text.";
        System.out.println();
        System.out.printf(yellowBG + blackText + "%50s" + reset,    anotherText);
        System.out.println("\n\n\n");
         System.out.printf(yellowBG + blackText + "%-50s" + reset,    anotherText);
    }
}
