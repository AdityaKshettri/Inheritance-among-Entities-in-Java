package com.aditya.project.initializer;

import com.aditya.project.service.BookService;
import com.aditya.project.service.PenService;
import com.aditya.project.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AppInitializer implements CommandLineRunner {

    private final ProductService productService;

    private final BookService bookService;

    private final PenService penService;

    @Override
    public void run(String... args) {
        bookService.save("Harry Potter", "J.K. Rowling");
        penService.save("Reynolds", "Blue");
        System.out.println(productService.findAll());
    }
}
