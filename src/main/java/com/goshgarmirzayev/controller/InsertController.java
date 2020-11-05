package com.goshgarmirzayev.controller;

import com.goshgarmirzayev.model.Book;
import com.goshgarmirzayev.response.ResponseDTO;
import com.goshgarmirzayev.response.ResponseEnum;
import com.goshgarmirzayev.service.BookService;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Delete;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;

import javax.validation.constraints.NotNull;

@Controller
public class InsertController {
    private final BookService bookService;

    public InsertController(BookService bookService) {
        this.bookService = bookService;
    }

    @Post(value = "/books/add")
    public ResponseDTO save(@NotNull Book book) throws Exception {
        try {
            bookService.save(book);
        } catch (Exception e) {
            return ResponseEnum.FAILED.getResponseDTO();
        }
        return ResponseEnum.SUCCESS.getResponseDTO();
    }

    @Get(value = "/books/delete/{id}")
    public ResponseDTO deleteBook(@NotNull Integer id) {
        try {
            if (bookService.findById(id) != null) {
                try {
                    bookService.deleteById(id);
                } catch (Exception e) {
                    return ResponseEnum.FAILED.getResponseDTO();
                }
            } else {
                return ResponseEnum.FAILED.getResponseDTO();
            }
        } catch (Exception e) {
            return ResponseEnum.FAILED.getResponseDTO();
        }

        return ResponseEnum.SUCCESS.getResponseDTO();
    }
}
