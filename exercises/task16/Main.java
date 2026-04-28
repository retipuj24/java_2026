package task16;

public class Main {
    public static void main(String[] args) {
        Gorilla gorilla = new Gorilla();
        
        // Feeding the gorilla
        boolean isFed = gorilla.feed(true);
        System.out.println("Gorilla fed: " + isFed);
        
        // Grooming the gorilla
        gorilla.groom();
        
        // Petting the gorilla
        gorilla.pet();
    }
}
