package HomeWork.Zadanie1.Zadanie4;

import HomeWork.Zadanie1.Zadanie2.CustomerLogger;
import HomeWork.Zadanie1.Zadanie3.MemoryCustomerRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppConfigurationZad4 {


    public String filename = "text.txt";

    @Bean("filename")
    FileCustomerLogger fileCustomerLogger(){
        return new FileCustomerLogger(filename);
    }

}