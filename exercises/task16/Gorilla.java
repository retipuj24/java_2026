package task16;

public class Gorilla implements Animal {
    @Override
    public boolean feed(boolean timeToEat) {
        // put gorilla food into cage
        if (timeToEat) {
            // put gorilla food into cage
            System.out.println("Feeding the gorilla bananas.");
            return true;
        }
        return false;
    }

    @Override
    public void groom() {
        // lather, rinse, repeat
        System.out.println("starting to groom the gorilla's fur.");
        for (int i = 0; i < 5; i++) {
            System.out.println("\t- Applying shampoo to the gorilla's fur.");
            System.out.println("\t- Rinsing the gorilla's fur.");
            System.out.println("\t- Repeating the grooming process.\n"); 
        }
        System.out.println("Finished grooming the gorilla.");
    }

    @Override
    public void pet() {
        // pet at your own risk
        System.out.println("Petting the gorilla.");
    }
}
