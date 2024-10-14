package com.omidmohebbise.demoapp;

import com.omidmohebbise.demoapp.person.Product;
import com.omidmohebbise.demoapp.person.ProductJpaRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoAppApplication.class, args);
    }

    @Bean
    public CommandLineRunner loadData(ProductJpaRepository repository) {
        return (args) -> {
            // Save a few products using the all-argument constructor provided by Lombok
            repository.save(new Product(null, "Product 1", 9.99));
            repository.save(new Product(null, "Product 2", 19.99));
        };
    }
}
