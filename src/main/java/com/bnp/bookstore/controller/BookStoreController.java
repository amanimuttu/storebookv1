package com.bnp.bookstore.controller;

import com.bnp.bookstore.model.Book;
import com.bnp.bookstore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bookstore/books")
public class BookStoreController {

    @Autowired
    private BookService bookService;

    @GetMapping("/list")
    ResponseEntity<List<Book>> listBooks(){
        List<Book> books = bookService.listAllBooks();
        return ResponseEntity.ok().body(books);
    }

    @PostMapping("/add")
    ResponseEntity<Book> addBook(@RequestBody List<Book> books){
        bookService.addBooks(books);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    //add book, check for isbn, then increment stock, else new book
}
