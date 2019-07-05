package HomeWork.Zadanie1.Zadanie3;

import HomeWork.Zadanie1.Customer;
import HomeWork.Zadanie1.Zadanie2.CustomerLogger;
import HomeWork.Zadanie1.Zadanie2.SimpleCustomerLogger;
import HomeWork.Zadanie1.Zadanie4.FileCustomerLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class MemoryCustomerRepository implements CustomerRepository {

//    public CustomerLogger customerLogger;
    public FileCustomerLogger fileCustomerLogger;
    public CustomerLogger customerLogger;

    List<Customer> customerList = new ArrayList<>();


    @Autowired
    public MemoryCustomerRepository(CustomerLogger customerLogger) {
        this.customerLogger = customerLogger;
    }

    @Override
    public void addClient(Customer customer) {
        customerList.add(customer);
//        customerLogger.log();
        System.out.println("Zapis dziala?");


    }

    @Override
    public void deleteClient(Customer customer) {
        customerList.remove(customer);
//        customerLogger.log();

    }

    @Override
    public void importListOfClients() {
        customerList.forEach(System.out::println);

//        customerLogger.log();
    }
    }
