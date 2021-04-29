package com.example.springcacheapp.service;

import com.example.springcacheapp.domain.Book;

import java.util.List;

public interface BookRepositoryService {

    Book getByIsbn(String isbn);

    List<Book> getAllBooks();

    List<String> getAllIsbns();
}
