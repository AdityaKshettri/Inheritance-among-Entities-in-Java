package com.aditya.project.service;

import com.aditya.project.entity.BookEntity;
import com.aditya.project.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository bookRepository;

    public void save(String name, String author) {
        BookEntity bookEntity = new BookEntity();
        bookEntity.setName(name);
        bookEntity.setAuthor(author);
        bookRepository.save(bookEntity);
    }
}
