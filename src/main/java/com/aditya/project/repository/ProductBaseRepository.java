package com.aditya.project.repository;

import com.aditya.project.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface ProductBaseRepository<T extends ProductEntity> extends JpaRepository<T, Integer> {
}
