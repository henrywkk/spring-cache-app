package com.example.caching.service;

import com.example.caching.domain.Book;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SimpleBookReporsitoryService extends BaseCacheService<String, Book> implements BookRepositoryService {

    public static final String NAME = "Books";

    @Override
    public String getDefaultCacheName() {
        return NAME;
    }

    @Override
    @Cacheable(value = NAME, key = "#isbn")
    public Book getByIsbn(String isbn) {
        simulateSlowService();
        return Book.builder().isbn(isbn).title("Some Book").build();
    }

    @Override
    public List<Book> getAllBooks() {
        return getAllValues();
    }

    @Override
    public List<String> getAllIsbns() {
        return getAllKeys();
    }

    // Don't do this at home
    private void simulateSlowService() {
        try {
            long time = 1000L;
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
    }
}
