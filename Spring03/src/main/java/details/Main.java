package details;

import config.com.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args){
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Course  c = context.getBean(Course.class);
        Student s = context.getBean(Student.class);
        System.out.println(s);
        System.out.println(c);

    }
}
