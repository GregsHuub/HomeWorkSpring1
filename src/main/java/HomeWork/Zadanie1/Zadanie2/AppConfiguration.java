package HomeWork.Zadanie1.Zadanie2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {

    @Bean
    public SimpleCustomerLogger simpleCustomerLogger(){
        return new SimpleCustomerLogger();
    }
}
