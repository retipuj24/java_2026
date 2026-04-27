import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private String author;
    private int yearPublished;
    private double price;
    public Book(String title, String author, int yearPublished, double price) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;
    }
    @Override
    public String toString() {
        String str = "Title: " + "\"" +this.title + "\"" +
                    "\nAuthor: "  + "\"" + this.author + "\"" +
                    "\nYear Published: " + this.yearPublished +
                    "\nPrice: $" + this.price;      
        return str; 
    }
    
    public static void main(String[] args) {
        Book book1 = new Book("Java Programming", "John Smith", 2021, 39.99);
        Book book2 = new Book("Python Basics", "Jane Doe", 2020, 29.99);
        Book book3 = new Book("C++ Essentials", "Michael Johnson", 2019, 49.99);
        
        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
     
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i).getClass().getName() + " " + (i + 1) + ":");
            System.out.println(books.get(i).toString());
            System.out.println();
        }
    }

// Book 1:
// Title: "Java Programming"
// Author: "John Smith"
// Year Published: 2021
// Price: $39.99

// Book 2:
// Title: "Python Basics"
// Author: "Jane Doe"
// Year Published: 2020
// Price: $29.99

// Book 3:
// Title: "C++ Essentials"
// Author: "Michael Johnson"
// Year Published: 2019
// Price: $49.99
}
