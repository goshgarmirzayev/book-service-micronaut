package com.goshgarmirzayev.controller;

import com.goshgarmirzayev.model.Book;
import com.goshgarmirzayev.service.BookService;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import javax.validation.constraints.NotNull;
import java.util.List;

@Controller
public class SharedController {
    private final BookService bookService;

    public SharedController(BookService bookService) {
        this.bookService = bookService;
    }

    @Get(value = "/books")
    public List<Book> getAllBooks() {
        return bookService.findAll();
    }

    @Get(value = "/books/{id}")
    public Book getById(@NotNull Integer id) {
        return bookService.findById(id);
    }
}
