package business;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.config.AppConfig;

public class Main {
    public static void main(String[] args){
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
       Order order=  context.getBean(Order.class);
       order.displayOrder();
    }
}
