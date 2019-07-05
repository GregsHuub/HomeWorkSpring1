package HomeWork.Zadanie1;

public class Customer {


    public Customer() {
    }

    public Customer(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    private int id;
    private String firstName;
    private String lastName;

    @Override
    public String toString() {
        return String.format("Customer with id %s , firstName: %s ,LastName:  %s ,", id,firstName,lastName);

    }
}
