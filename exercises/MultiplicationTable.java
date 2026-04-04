public class MultiplicationTable {
    public static void main(String[] args) {
        int rows = 10;
        int columns = 10;
        System.out.println("=============================");
        System.out.println("using for loop:");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
        System.out.println("=============================");
        System.out.println("using while loop: ");
        int k = 1;
        int l = 1;
        do {
            l = 1;
            do {
                System.out.printf("%4d", k * l);
                l++;
            } while (l <= columns);
            System.out.println();
            k++;         
        } while (k <= rows);       
    }
}
