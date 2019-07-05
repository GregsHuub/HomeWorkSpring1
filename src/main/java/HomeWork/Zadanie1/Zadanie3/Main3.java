package HomeWork.Zadanie1.Zadanie3;

import HomeWork.Zadanie1.Customer;
import HomeWork.Zadanie1.Zadanie2.AppConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main3 {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfigurationZad3.class);

        MemoryCustomerRepository memoryCustomerRepository = context.getBean(MemoryCustomerRepository.class);

        Customer customer = new Customer(1,"Grzegorz","Ozim");
        Customer customer2 = new Customer(2,"Jacek","Bąk");

        memoryCustomerRepository.addClient(customer);
        memoryCustomerRepository.addClient(customer2);
        memoryCustomerRepository.importListOfClients();
        memoryCustomerRepository.deleteClient(customer);

      memoryCustomerRepository.importListOfClients();
    }
}
