package com.example.springcacheapp.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Book {
    private String isbn;
    private String title;

    @Override
    public String toString() {
        return "Book{" + "isbn='" + isbn + '\'' + ", title='" + title + '\'' + '}';
    }
}
