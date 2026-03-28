public class Chick {

    private String name = "Fluffy";
    {System.out.println("setting field");}
    
    public static void main(String[] args) {
        Chick chick = new Chick();
        System.out.println(chick.name);

    }

    public Chick() {
        this.name = "Tiny";
        System.out.println("setting constructor");
    }

    
}
