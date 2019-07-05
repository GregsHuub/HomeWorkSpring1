package HomeWork.Zadanie1.Zadanie3;

import HomeWork.Zadanie1.Zadanie2.CustomerLogger;
import HomeWork.Zadanie1.Zadanie2.SimpleCustomerLogger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("HomeWork.Zadanie1")
public class AppConfigurationZad3 {
//
//    @Bean
//    public MemoryCustomerRepository memoryCustomerRepository(CustomerLogger simpleCustomerLogger){
//        return new MemoryCustomerRepository(simpleCustomerLogger);
//    } // zakomentowane z powodu innego konstruktora w MemoryCustomerReposity

}
