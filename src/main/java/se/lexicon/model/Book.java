package se.lexicon.model;
import java.util.ArrayList;

public class Book {
    // todo: needs completion
    private String id;
    private String title;
    private String author;
    boolean available = true;
    private Person borrower;


    //array
    public static Book[] books = new Book[5];
     int bookCount = 0;





    //Constructor
    public Book(String title, String author) {
            setTitle(title);
            setAuthor(author);
            this.available = true;
    }




    //add book to the array
    public  void addBook(Book book) {
        if (bookCount < books.length) {
            books[bookCount] = book;
            bookCount++;
            System.out.println("Book \"" + book.getTitle() + "\" added to the library.");
        } else {
            System.out.println("Library is full! Can't add more books.");
        }
    }


    //Setters and Getters
    //Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    //Title
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    //Author
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setBorrower(Person borrower) {
        this.borrower = borrower;
        this.available = (borrower == null);
    }

    public String getBookInformation() {
        String info = "Book ID: " + id + "Title: " + title + "Author: " + author + " is Available";
        if (!available && borrower != null) {
            info += "\nBorrowed by: " + borrower.getFirstName() + " " + borrower.getLastName();
        }
        return info;
    }

}