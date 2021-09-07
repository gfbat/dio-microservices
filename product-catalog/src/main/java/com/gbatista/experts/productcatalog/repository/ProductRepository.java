package com.gbatista.experts.productcatalog.repository;

import com.gbatista.experts.productcatalog.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {
}
