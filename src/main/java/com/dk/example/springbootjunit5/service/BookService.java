package com.dk.example.springbootjunit5.service;

import com.dk.example.springbootjunit5.model.Book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookService {

    private List<Book> bookList=new ArrayList<>();

    public void addBook(Book book){
        bookList.add(book);
    }

    public  List<Book> getBookList(){
        return Collections.unmodifiableList(bookList);
    }
}
