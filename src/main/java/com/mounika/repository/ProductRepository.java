package com.mounika.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mounika.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{


}
