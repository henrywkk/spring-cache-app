package com.example.caching.service;

import com.example.caching.domain.Book;

import java.util.List;

public interface BookRepositoryService {

    Book getByIsbn(String isbn);

    List<Book> getAllBooks();

    List<String> getAllIsbns();
}
