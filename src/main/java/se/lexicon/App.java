package se.lexicon;
import se.lexicon.model.Book;
import se.lexicon.model.Person;
import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        // todo: needs completion


        Scanner input = new Scanner(System.in);

        //Create a book instance
        //Display book information
        Book.addBook(new Book("The Hobbit", "J.R.R. Tolkien"));
        Book.addBook(new Book("1984", "George Orwell"));
        Book.addBook(new Book("Dune", "Frank Herbert"));
        Book.addBook(new Book("Harry Potter", "J.K. Rowling"));
        Book.addBook(new Book("The Catcher in the Rye", "J.D. Salinger"));

        // Create a person instance
        // Display person information
        Person person1 = new Person("Alice", "Johnson");
        Person person2 = new Person("Bob", "Smith");

        //Choose user
        System.out.println("Choose a user:");
        System.out.println("1. " + person1.getFirstName());
        System.out.println("2. " + person2.getFirstName());
        System.out.print("Enter number: ");
        int choice = input.nextInt();
        input.nextLine();

        Person currentUser = (choice == 2) ? person2 : person1;

        boolean running = true;

        while (running) {
            System.out.println("--- MENU ---");
            System.out.println("1. Show all books");
            System.out.println("2. Borrow a book");
            System.out.println("3. Return a book");
            System.out.println("4. Show my info");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int option = input.nextInt();
            input.nextLine();

            switch (option) {
                case 1:
                    Book.showAllBooks();
                    break;

                case 2:
                    System.out.print("Enter the title of the book to borrow: ");
                    String titleToBorrow = input.nextLine();
                    Book bookToBorrow = Book.findBookByTitle(titleToBorrow);

                    if (bookToBorrow != null) {
                        currentUser.loanBook(bookToBorrow);
                    } else {
                        System.out.println("Book not found!");
                    }
                    break;

                case 3:
                    System.out.print("Enter the title of the book to return: ");
                    String titleToReturn = input.nextLine();
                    Book bookToReturn = Book.findBookByTitle(titleToReturn);

                    if (bookToReturn != null) {
                        currentUser.returnBook(bookToReturn);
                    } else {
                        System.out.println("Book not found!");
                    }
                    break;

                case 4:
                    System.out.println(currentUser.getPersonInformation());
                    break;

                case 5:
                    running = false;
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }

        input.close();


    }

}
