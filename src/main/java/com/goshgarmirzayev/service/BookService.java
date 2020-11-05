package com.goshgarmirzayev.service;

import com.goshgarmirzayev.data.BookRepository;
import com.goshgarmirzayev.model.Book;

import javax.inject.Singleton;
import java.util.List;
@Singleton
public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> findAll() {
        return (List<Book>) bookRepository.findAll();
    }

    public void deleteById(Integer id) {
        bookRepository.deleteById(id);
    }

    public Book save(Book book) {
        return bookRepository.save(book);
    }

    public Book findById(Integer id) {
        return bookRepository.findById(id).get();
    }
}
