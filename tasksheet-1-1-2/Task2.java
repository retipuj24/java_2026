public class Task2 {
    /***
     * Create all of the primitives (except long and double) with different values. 
     * Concatenate them into a string and  print it to the screen so it will print: H3110 w0r1d 2.0 true 
       

        byte zero = 0;
        String output = "W" + zero + "w";
        System.out.println(output);

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
    public static void main(String[] args) {
        // Create all of the primitives (except long and double) with different values.
        // Concatenate them into a string and  print it to the screen so it will print: H3110 w0r1d 2.0 true  

        boolean boolX = true;
        byte byteX = 3;
        short shortX= 1;
        int intX =1;
        byte zero = 0;
        // long longX =0L; except long
        // double doubleX = 0d; except double
        char char00 = 'H';
        char char01 = 'w';
        char char02 = 'r';
        char char03 = '1';
        char char04 = 'd';
        char charSpace = ' ';
        float floatX = 2.0f;
        
        //copied original string from problem question
        String expectedString = "H3110 w0r1d 2.0 true";
        // concatenated string using primitive data type
        String concatString = ("" + char00 + byteX + shortX + intX +zero +charSpace + char01 + zero + char02 + char03 + char04 + charSpace + floatX + charSpace + boolX).toString();
        System.out.println(concatString);
        // answer code ends here

        
        //verify if String are same
        boolean isStringSame  = false;
        isStringSame = concatString.equals(expectedString);
        
        System.out.println("\n\n----------------------------------------------------------");       
        System.out.println("Is String output same with \"" + expectedString+"\"?: " +isStringSame);
        System.out.println("----------------------------------------------------------");
       
        // print char by char comparison
        // print the header   
        System.out.println("CODE:" + "\t" + "\t"+ "\t"+"CODE:" + "\t\t\t");
            
        for (int i = 0; i < expectedString.length(); i++) {
            System.out.print("chr("+ (int)(expectedString.charAt(i)) +  ")"+ " : "+"\t" + expectedString.charAt(i));
            System.out.println("\t"+ "chr("+ (int)(concatString.charAt(i)) +  ")"+ " : "+"\t" + concatString.charAt(i));            
        }
    }

}
