package se.lexicon.model;
import java.util.ArrayList;

public class Person {
    private static int sequencer = 0;
    private int id;
    private String firstName;
    private String lastName;
    private ArrayList<Book> borrowedBooks;

    //Create a person
    public Person(String firstName, String lastName) {
        this.id = getNextId();
        this.firstName = firstName;
        this.lastName = lastName;
        this.borrowedBooks = new ArrayList<>();
    }

    private static int getNextId() {
        return ++sequencer;
    }

    // Borrow a book
    public void loanBook(Book book) {
        if (book.isAvailable()) {
            borrowedBooks.add(book);
            book.setBorrower(this);
            System.out.println(firstName + " borrowed \"" + book.getTitle() + "\"");
        } else {
            System.out.println("Sorry, \"" + book.getTitle() + "\" is already borrowed.");
        }
    }

    // Return a book
    public void returnBook(Book book) {
        if (borrowedBooks.remove(book)) {
            book.setBorrower(null);
            System.out.println(firstName + " returned \"" + book.getTitle() + "\"");
        } else {
            System.out.println("You don't have this book to return.");
        }
    }

    // Info about the person
    public String getPersonInformation() {
        String info = "Person ID: " + id + "\nName: " + firstName + " " + lastName + "\nBorrowed books:";
        if (borrowedBooks.isEmpty()) {
            info += " None";
        } else {
            for (Book book : borrowedBooks) {
                info += "\n - " + book.getTitle();
            }
        }
        return info;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
