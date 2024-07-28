package com.LearnSpring.WebApp.Service;

import com.LearnSpring.WebApp.Model.Product;
import com.LearnSpring.WebApp.Repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

//    List<Product> products = new ArrayList<>(Arrays.asList(new Product(101, "Iphone", 50000),
//            new Product(102, "Camera", 7000)));

    public List<Product> getProducts() {

        return repo.findAll();

    }

    public Product getProductById(int prodId) {
//        return products.stream().filter(p -> p.getProdId() == prodId)
//                .findFirst().orElse(new Product(100, "No Item", 0));
        return repo.findById(prodId).orElse(new Product());
    }

    public void addProduct(Product prod) {
        repo.save(prod);
    }

    public void updateProduct(Product prod) {
        repo.save(prod);
    }

    public void deleteProduct(int prodId) {
        repo.deleteById(prodId);
    }

}
