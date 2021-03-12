package com.aditya.project.repository;

import com.aditya.project.entity.BookEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends ProductBaseRepository<BookEntity> {
}
