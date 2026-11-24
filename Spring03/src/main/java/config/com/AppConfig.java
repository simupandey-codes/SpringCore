package config.com;
import details.*;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Course course(){
       Course c = new Course();
       c.setCourse("Spring Core");
       c.setDuration(6);
       return c;
    }

    @Bean
    public  Student student(Course course){
       Student s = new Student();
       s.setName("Simu");
       s.setID(101);
       s.setCourse(course);
       return s;
    }


}
