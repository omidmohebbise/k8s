package com.omidmohebbise.demoapp.person;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data                   // Lombok annotation to generate getters, setters, toString, equals, and hashCode
@NoArgsConstructor       // Lombok annotation to generate a no-argument constructor
@AllArgsConstructor      // Lombok annotation to generate an all-argument constructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Double price;
}
