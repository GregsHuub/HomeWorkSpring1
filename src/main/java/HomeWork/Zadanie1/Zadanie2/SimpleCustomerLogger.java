package HomeWork.Zadanie1.Zadanie2;

import org.springframework.stereotype.Component;

import java.util.Date;
//@Component
public class SimpleCustomerLogger implements CustomerLogger {
    @Override
    public void log() {
        System.out.println(new Date() + " Customer operation");
    }

}
