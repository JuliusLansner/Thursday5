package Task3;

public class Customer {
    private String firstName;
    private String lastName;
   private  String username;
    private int id;

    public Customer(String firstName, String username){
    this.firstName = firstName;
    this.username = username;

    }

    @Override
    public String toString() {
        return "Customer name: "+firstName+ "\n"+"Customer username: "+username;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUsername() {
        return username;
    }

    public int getId() {
        return id;
    }

}
