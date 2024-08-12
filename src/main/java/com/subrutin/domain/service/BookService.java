package com.subrutin.domain.service;

import com.subrutin.domain.Author;
import com.subrutin.domain.Book;

public class BookService {
    private Book book;

    public BookService(Book book) {
        Author author = new Author();
        book = new Book(author);
    }
}
