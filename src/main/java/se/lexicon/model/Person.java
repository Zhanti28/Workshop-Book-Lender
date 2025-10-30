package se.lexicon.model;

public class Person {
    // todo: needs completion
    private int id;
    private String firstName;
    private String lastName;




    public Person(int id, String firstName, String lastName) {
        setId(id);
        setFirstName(firstName);
        setLastName(lastName);
    }

    //Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //first name
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    //last name
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}