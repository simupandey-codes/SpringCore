package spring.com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.resources.SpringConfigFile;

public class App {
    public static void main(String[] args){
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
        Student std1 = (Student) context.getBean("student1");
        System.out.println(std1);

        Student std2 = (Student) context.getBean("student2");
        System.out.println(std2);
    }
}
