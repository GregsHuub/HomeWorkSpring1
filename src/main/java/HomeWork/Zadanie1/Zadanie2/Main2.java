package HomeWork.Zadanie1.Zadanie2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);

        SimpleCustomerLogger simpleCustomerLogger = (SimpleCustomerLogger) context.getBean(CustomerLogger.class);

        simpleCustomerLogger.log();
    }
}
