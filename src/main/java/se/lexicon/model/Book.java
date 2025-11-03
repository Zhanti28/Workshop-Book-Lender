package se.lexicon.model;
import java.util.ArrayList;

public class Book {
    // todo: needs completion
    private String id;
    private String title;
    private String author;
    private boolean available;
    private Person borrower;

    // Fixed array for 5 books
    public static Book[] books = new Book[5];
    private static int bookCount = 0;

    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.available = true;
        this.id = title.substring(0, 2).toUpperCase() + Math.round(Math.random() * 1000);
    }

    //Getters
    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return available;
    }

    public Person getBorrower() {
        return borrower;
    }

    //Setters
    public void setBorrower(Person borrower) {
        this.borrower = borrower;
        this.available = (borrower == null);
    }

    //Add a book to the array
    public static void addBook(Book book) {
        if (bookCount < books.length) {
            books[bookCount] = book;
            bookCount++;
            System.out.println("Book \"" + book.getTitle() + "\" added to the library.");
        } else {
            System.out.println("Library is full! Can't add more books.");
        }
    }

    //Show all books
    public static void showAllBooks() {
        System.out.println("\n--- All Books ---");
        boolean empty = true;
        for (Book b : books) {
            if (b != null) {
                empty = false;
                String status = b.isAvailable() ? "Available" : "Borrowed by " + b.getBorrower().getFirstName();
                System.out.println("- " + b.getTitle() + " by " + b.getAuthor() + " (" + status + ")");
            }
        }
        if (empty) {
            System.out.println("No books have been added yet.");
        }
    }

    //Find a book by title
    public static Book findBookByTitle(String title) {
        for (Book b : books) {
            if (b != null && b.getTitle().equalsIgnoreCase(title)) {
                return b;
            }
        }
        return null;
    }

    //Book info
    public String getBookInformation() {
        String info = "Book ID: " + id + "\nTitle: " + title + "\nAuthor: " + author + "\nAvailable: " + available;
        if (!available && borrower != null) {
            info += "\nBorrowed by: " + borrower.getFirstName() + " " + borrower.getLastName();
        }
        return info;

    }
}