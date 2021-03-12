package com.aditya.project.repository;

import com.aditya.project.entity.ProductEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends ProductBaseRepository<ProductEntity> {
}
