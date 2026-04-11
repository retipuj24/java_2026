/** 
* Class name Task3:
* Change the variables in the first section, 
* so that each if statement resolves as true.

        String a = new String("Wow");
        String b = "Wow";
        String c = a;
        String d = c;

        boolean b1 = a == b;
        boolean b2 = d.equals(b + "!");
        boolean b3 = !c.equals(a);

        if (b1 && b2 && b3) {
            System.out.println("Success!");
        }
*/


public class Task3 {
    public static void main(String[] args) {
        // String a = new String("Wow");
        String a = "Wow"; // change to directly assign the string literal to a, so it will be interned and point to the same memory location as b
        String b = "Wow";
        String c = a;
        // add code here
        c = a+"!";
        String d = c;        
       

        boolean b1 = a == b;
        boolean b2 = d.equals(b + "!");
        boolean b3 = !c.equals(a);

        if (b1 && b2 && b3) {
            System.out.println("Success!");
        }
        // write a print to as a marker to execution after if
        // System.out.println("nothing to see here...");
    }
}
