package com.dk.example.springbootjunit5.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Book {

    private String bookId;
    private String title;
    private String publisher;
}
