package HomeWork.Zadanie1.Zadanie3;

import HomeWork.Zadanie1.Customer;

public interface CustomerRepository {
    public void addClient(Customer customer);
    public void deleteClient(Customer customer);
    public void importListOfClients();

}
