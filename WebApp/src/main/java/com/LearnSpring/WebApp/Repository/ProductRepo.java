package com.LearnSpring.WebApp.Repository;

import com.LearnSpring.WebApp.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {



}
