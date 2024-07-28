package com.LearnSpring.WebApp.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Product {

    @Id
    private int prodId;
    private String prodName;
    private int price;

}

