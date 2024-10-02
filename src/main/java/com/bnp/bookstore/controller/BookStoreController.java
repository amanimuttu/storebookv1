package com.bnp.bookstore.controller;

import com.bnp.bookstore.model.Book;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/bookstore/books")
public class BookStoreController {

    //list book

    @GetMapping(value = "/list")
    ResponseEntity<Book> listBooks(){

        Book book = new Book();
        return ResponseEntity.ok(book);
    }

    @PostMapping(value = "/add")
    ResponseEntity<Book> addBook(){

        Book book = new Book();
        return ResponseEntity.ok(book);
    }

    //add book, check for isbn, then increment stock, else new book
}
