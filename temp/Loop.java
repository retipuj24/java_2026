import java.util.function.Predicate;
/**
 * another documentation
 */

public class Loop {
public static void main(String[] args) {
    System.out.println("545564564");
    for (int i = 0; i < args.length; i++) {
        System.out.println(i);
    }
    Predicate<String> isString = a -> a.contains("abc");

    System.out.println(isString.test("Jupiter"));
    
    Add add = (int a, int b) -> a+b;
    
    int result =  add.addition(10, 25);
    System.out.println(result);
}
}
