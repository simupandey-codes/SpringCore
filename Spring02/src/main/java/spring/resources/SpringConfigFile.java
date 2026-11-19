package spring.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring.com.Student;

@Configuration
public class SpringConfigFile {
    @Bean
    public Student student1(){
        Student std = new Student();
            std.setName("Simu");
            std.setID("101");
            std.setAddress("Bangalore");

            return std;


    }
    @Bean
    public Student student2(){
        Student std = new Student();
        std.setName("Sam");
        std.setID("102");
        std.setAddress("Bangalore");

        return std;


    }
}
