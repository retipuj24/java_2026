
public class MyDate {
    public static void main(String[] args) {
        DateTask date1 = new DateTask();
        DateTask date2 = new DateTask();
        
        // In MyDate.java set the date for date1 to January 1st of 1978 and 
        // date2 to September 21st of 1984. 
        // Display the DateTask leapYears after printing date2.
        date1.setDate(1, 1, 1978);     
        date2.setDate(9, 21, 1984);
        System.out.println(date1.toString());
        System.out.println(date2.toString());

        // testing invalid
        //  DateTask date3 = new DateTask();
        // date3.setDate(2, 30, 1944);    
        // System.out.println(date3.toString());
        
        // display leapyears

        DateTask.leapYears();
    }
}