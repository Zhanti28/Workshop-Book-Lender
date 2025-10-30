package se.lexicon.model;

public class Book {
    // todo: needs completion
    private String id;
    private String title;
    private String author;
    boolean available = true;
    private String borrower;


    public String getBorrower() {
        return borrower;
    }

    public void setBorrower(String borrower) {
        this.borrower = borrower;
    }


    public Book(String title, String author) {
            setTitle(title);
            setAuthor(author);
    }

    public Book(String title, String author, String borrower) {
        setTitle(title);
        setAuthor(author);
        setBorrower(borrower);
    }

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

    public String getBookInformation(){
        return title + ", " + author;
    }

}