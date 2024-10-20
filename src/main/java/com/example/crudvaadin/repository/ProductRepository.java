package com.example.crudvaadin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.crudvaadin.model.ProductModel;

@Repository
public interface ProductRepository extends JpaRepository<ProductModel, Long> {
}
