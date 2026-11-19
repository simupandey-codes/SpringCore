package spring.config;
import business.Order;
import business.Payment;
import business.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Product product(){
        return new Product("laptop", 60000);
    }

    @Bean
    public Payment payment(){
        return new Payment("UPI");
    }
    @Bean
    public Order order(Product product, Payment payment) {
        return new Order(product, payment);
    }
}
