package com.gbatista.experts.shoppingcart.repository;

import com.gbatista.experts.shoppingcart.model.Cart;
import org.springframework.data.repository.CrudRepository;

public interface CartRepository extends CrudRepository<Cart, Integer> {
}
