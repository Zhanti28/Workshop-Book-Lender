package se.lexicon;
import se.lexicon.model.Book;
import se.lexicon.model.Person;

public class App {
    public static void main(String[] args) {
        // todo: needs completion

        // Create a book instance
        // Display book information
        Book book1 = new Book("War and Peace", "Leo Tolstoi");
        Book.addBook(book1);
        Book book2 = new Book("1984", "George Orwell");
        Book book3 = new Book("Blind Date", "R.L. Stine");
        Book book4 = new Book("Heart of Darkness", "Joseph Conrad");
        Book book5 = new Book("The Hobbit", "J.K. Rowling");
        Book book6 = new Book("The Lord of the Rings", "J.K. Rowling");
        System.out.println(book1.getBookInformation());

        // Create a person instance
        // Display person information
        Person person1 = new Person(1, "John", "Doe");
        System.out.println(person1.getPersonalInformation());

        // Loan a book to the person

        // Display person information after borrowing a book
        // Display book information after borrowing a book

        // Return the borrowed book

        // Display person information after returning the book
        // Display book information after borrowing a book

    }

}
