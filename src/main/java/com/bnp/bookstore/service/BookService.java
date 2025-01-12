package com.bnp.bookstore.service;

import com.bnp.bookstore.model.Book;
import com.bnp.bookstore.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public void addBooks(List<Book> books){
        bookRepository.saveAll(books);
    }

    public List<Book> listAllBooks() {
        return bookRepository.findAll();
    }
}
