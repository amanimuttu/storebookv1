package com.bnp.bookstore.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Book {

    @Id
    private String isbn;

    private String title;
    private String author;
    private Double price;

    private int stock;
}
