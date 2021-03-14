package com.dk.example.springbootjunit5.assertions;

import com.dk.example.springbootjunit5.model.Book;
import com.dk.example.springbootjunit5.service.BookService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AssertTrueDemo {

    @Test
    public void assertTrueEmptyListWithNoMessage() {
        BookService bookService = new BookService();

        assertTrue(bookService.getBookList().isEmpty());
    }

    @Test
    public void assertTrueNotEmptyListWithNoMessage() {
        BookService bookService = new BookService();

        Book headFirstJavaBook = new Book("1", "Head First java", "Wrox");
        bookService.addBook(headFirstJavaBook);

        assertTrue(!bookService.getBookList().isEmpty());
    }


//    @Test
//    public void assertTrueNotEmptyListWithMessage() {
//        BookService bookService = new BookService();
//
//        assertTrue(!bookService.getBookList().isEmpty(),"BookList is not empty!");
//    }


//    @Test
//    public void assertTrueNotEmptyListWithMessageSupplier() {
//        BookService bookService = new BookService();
//
//        assertTrue(!bookService.getBookList().isEmpty(), () -> "BookList is not empty!");
//    }


    @Test
    public void assertTrueNotEmptyListWitBooleanSupplier() {
        BookService bookService = new BookService();

        Book headFirstJavaBook = new Book("1", "Head First java", "Wrox");
        bookService.addBook(headFirstJavaBook);

        assertTrue(()->!bookService.getBookList().isEmpty());
    }


}
