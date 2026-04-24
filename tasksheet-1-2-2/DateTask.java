import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTask {
   // instance variables
 byte day;
 byte month;
 short year;
// Constructors:

// The no-args constructor
public DateTask() {
    this(1, 1, 1);
}
// Constructor that takes 3 arguments
public DateTask(int m, int d, int y) {
    setDate(m, d, y);
}
// Methods
public String toString() {
    
    LocalDate date = LocalDate.of(year, month, day);
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    String formattedDate = date.format(formatter); 
    //return month + "-" + day + "-" + year;
    return formattedDate;
}
public void setDate(int m, int d, int y) {
    if (valid(d, m, y)) {
        day = (byte) d;
        year = (short) y;
        month = (byte) m;
    }
    else{
        day = (byte) 0;
        year = (short) 0;
        month = (byte) 0;
    }
}
public static void leapYears() {
    for (int i = 1980; i <= 2023; i = i + 4) {
        if (((i % 4 == 0) && (i % 100 != 0)) || (i % 400 == 0))
            System.out.println("The year " + i + " is a leap year");
    }
}
public int getDay() {
    return (int) day;
}
public void setDay(int day) {
    if (valid(day, month, year)) {
        this.day =  (byte) day;
    }
    
}
public int getMonth() {
    return this.month;
}
public void setMonth(int month) {
    if (valid(day, month, year)) {
        this.month = (byte) month;
    }
    else{
        this.month = (byte) 0;
    }
}
public int getYear() {
    return this.year;
}
public void setYear(int year) {
    if (valid(day, month, year)) {
        this.year = (short) year;
    }
    else{
        this.year = (short) 0;
    }
}
private boolean valid(int day, int month, int year) {
    if (day > 31 || day < 1 || month > 12 || month < 1 || year < 1)  {
        System.out.println("Attempting to create a non-valid date " +month + "/" + day + "/" + year);
        return false;
    }
    switch (month) {
        case 4:
        case 6:
        case 9:
        case 11:
            return (day <= 30);
        case 2:
            return day <= 28 || (day == 29 && year % 4 == 0);
    }
    return true;
}
}

/**
 * 
 * 
 * 
 * Steps/Procedure: 
Open your Java IDE and create a java package, name it tasksheet-1-2-1 or follow the Trainer's instructions for online IDE's.
Copy the source code from the program DateTask.java  and MyDate.java 
Paste the source code in your own online IDE. 
In DateTask.java make the instance variables day, month, year to private.
Add "this(1, 1, 1);" statement  to the no-args constructor DateTask().
Set toString() method to display "12/12/2012" date format.
The getDay() method set to return day.
The setDay() method set to return 0 if condition is false.
The getMonth() method set to return month.
The setMonth() method set to return 0 if condition is false.
The getYear() method set to return year.
The setYear() method set to return 0 if condition is false.
In MyDate.java set the date for date1 to January 1st of 1978 and date2 to September 21st of 1984.
Display the DateTask leapYears after printing date2.
Submit the link of your source code.

 */