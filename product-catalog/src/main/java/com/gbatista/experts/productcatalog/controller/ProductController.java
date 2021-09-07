package com.gbatista.experts.productcatalog.controller;

import com.gbatista.experts.productcatalog.model.Product;
import com.gbatista.experts.productcatalog.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/product")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @PostMapping
    public Product create(@RequestBody Product product){
        return productRepository.save(product);
    }

    @GetMapping("/{id}")
    public Optional<Product> findById(@PathVariable Integer id){
        return productRepository.findById(id);
    }
}
