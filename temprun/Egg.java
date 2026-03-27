public class Egg {

    public static void main(String[] args) {
        Egg egg = new Egg();
        System.out.println(egg.number);
    }

    public Egg() {
        number = 5;
    }
    

    private int number = 3;
    {number = 4;}

    // getter and setter for number
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    
}
