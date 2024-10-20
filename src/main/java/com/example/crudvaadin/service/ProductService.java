package com.example.crudvaadin.service;

import java.util.Collection;

import org.springframework.stereotype.Service;
import com.example.crudvaadin.model.ProductModel;
import com.example.crudvaadin.repository.ProductRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductService{

    private final ProductRepository repository;

    public Collection<ProductModel> findAll() {
        return repository.findAll();
    }

    public ProductModel add(ProductModel product) {
        return repository.save(product);
    }

    public ProductModel update(ProductModel product) {
        return repository.save(product);
    }

    public void delete(ProductModel product) {
        repository.delete(product);
    }
    
}
