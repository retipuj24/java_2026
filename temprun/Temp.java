import java.time.LocalDate;
import java.time.LocalTime;

public class Temp {
    public static void main(String[] args) {
        System.out.println("Hello World");


        // double num1 = 5.5,  int num2 = 10; // will not compile because of incompatible types
        
        // String chair, table="metal";
        // System.out.println(chair+table); // will not compile because chair is not initialized - local varible must be initialized before use    
    
        // JAVA NAMING CONVENTIONS
        // SEE LINK
        //https://www.oracle.com/java/technologies/javase/codeconventions-namingconventions.html
        // FOO_BAR -sample constant variable name
        // fooBar - sample variable name 
        // FooBar - sample class name
        // fooBar() - sample method name
        // 1. Class names should be nouns, in mixed case with the first letter of each internal word capitalized.
        // 2. Method names should be verbs, in mixed case with the first letter lowercase
        // 3. Variable names should be in mixed case with a lowercase first letter. Internal words start with capital letters.
        // 4. Constants should be in uppercase with words separated by underscores.
        //  5. Package names should be in lowercase. Companies use their reversed Internet domain name to begin their package names - for example, com.example.mypackage.
        // 6. Avoid using the underscore character (_) in variable names, method names, and class names.
        // 7. Avoid using the dollar sign ($) in variable names, method names, and class names.
        // 8. Avoid using single-character names, except for temporary variables.
        //  9. Avoid using names that are too similar to each other, such as "l" (lowercase letter L) and "O" (uppercase letter O), which can be easily confused with the digits "1" and "0".
        //  10. Avoid using reserved keywords as variable names, method names, or class names.
        //  11. Use descriptive names that clearly indicate the purpose of the variable, method, or class.
        // 12. Follow the naming conventions consistently throughout your codebase to improve readability and maintainability.
        // 13. Use camelCase for variable and method names, and PascalCase for class names.
        // 14. Avoid using abbreviations or acronyms in variable names, method names, and class names, unless they are widely recognized and commonly used in the programming community.
        // 15. Use singular nouns for class names and plural nouns for collection classes (e.g., List, Set, Map).
        // 16. Avoid using underscores in variable names, method names, and class names, except for constants where underscores are used to separate words.
        // 17. Avoid using the same name for a variable, method, and class to prevent confusion and improve code readability            
        // answer code ends here

        /*
             TABLE 1.1
        Java primitive types
        Keyword     Type                            Example
        -----------------------------------------------------
        boolean     true or false                   true
        byte        8-bit integral value            123
        short       16-bit integral value           123
        int         32-bit integral value           123
        long        64-bit integral value           123
        float       32-bit floating-point value     123.45f
        double      64-bit floating-point value     123.456
        char        16-bit Unicode value            'a'
        -----------------------------------------------------
     */
       
    //What is true  of finalize() method in Java?
    // 1. It is called by the garbage collector before an object is destroyed.
    // 2. It can be overridden to perform cleanup operations before an object is garbage collected
    // 3. It is not guaranteed to be called, and its execution is not predictable.
    // 4. It is deprecated in Java 9 and later versions, and its use
    //    is generally discouraged in favor of other resource management techniques, such as try-with-resources and explicit cleanup methods.
    // answer code ends here

    // String str1;
    // System.out.println(str1); // will not compile because str1 is not initialized - local variable must be initialized before use

    //int c = Integer.valueOf(0); // works because Integer.valueOf(0) returns an Integer object which is unboxed to an int primitive type

    String s1 =  "Java";
    String s2 =  "Java";
    StringBuilder sb1 = new StringBuilder();
    sb1.append("Ja").append("va");
    System.out.println(s1 == s2); // true because string literals are interned in Java, so s1 and s2 refer to the same memory location
    System.out.println(s1.equals(s2)); // true because s1 and s2 have the same content
    System.out.println(sb1.toString()==s1); // false because sb1.toString() creates a new String object that is not interned, so it does not refer to the same memory location as s1
    System.out.println(sb1.toString().equals(s1)); // false because sb1.toString
    System.out.println("====================================================================");
    int score = 1;
    try {
        // int score = 1;
        System.out.print(score++);
    } catch (Throwable t) { System.out.print(score++);} 
    finally { System.out.print(score++);}

    System.out.print(score++);
    
    System.out.println("\n====================================================================");
    LocalDate localDate = LocalDate.now();
    System.out.println(localDate);
    LocalTime localTime = LocalTime.now();
    System.out.println(localTime);


    }

    

}
