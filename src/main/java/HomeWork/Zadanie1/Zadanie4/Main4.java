package HomeWork.Zadanie1.Zadanie4;

import HomeWork.Zadanie1.Customer;
import HomeWork.Zadanie1.Zadanie3.MemoryCustomerRepository;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main4 {
    public static void main(String[] args) {


        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfigurationZad4.class);

        MemoryCustomerRepository memoryCustomerRepository = context.getBean("memoryCustomerRepository",MemoryCustomerRepository.class);

        Customer customerToFile = new Customer(1, "TestoweImie", "TestoweNazwisko");
        Customer customerToFile2 = new Customer(15, "TestoweImieAAAAA", "TestoweNazwiskoBBBBB");

        memoryCustomerRepository.addClient(customerToFile);
        memoryCustomerRepository.addClient(customerToFile2);

        FileCustomerLogger fileCustomerLogger = context.getBean(FileCustomerLogger.class);
        fileCustomerLogger.getFilename();



    }
}
