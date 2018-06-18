package com.repositories;

import org.springframework.data.repository.CrudRepository;

import com.domain.Product;

public interface ProductRepository extends CrudRepository<Product, Integer>{
}
