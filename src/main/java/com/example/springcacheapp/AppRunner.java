package com.example.springcacheapp;

import com.example.springcacheapp.service.BookRepositoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class AppRunner implements CommandLineRunner {

    private final BookRepositoryService bookRepositoryService;

    public AppRunner(BookRepositoryService bookRepositoryService) {
        this.bookRepositoryService = bookRepositoryService;
    }

    @Override
    public void run(String... args) {
        log.info(".... Fetching books");
        log.info("isbn-1234 -->" + bookRepositoryService.getByIsbn("isbn-1234"));
        log.info("isbn-4567 -->" + bookRepositoryService.getByIsbn("isbn-4567"));
        log.info("isbn-1234 -->" + bookRepositoryService.getByIsbn("isbn-1234"));
        log.info("isbn-4567 -->" + bookRepositoryService.getByIsbn("isbn-4567"));
        log.info("isbn-1234 -->" + bookRepositoryService.getByIsbn("isbn-1234"));
        log.info("isbn-1234 -->" + bookRepositoryService.getByIsbn("isbn-1234"));
        log.info("--------All books in repository: --------");
        bookRepositoryService.getAllBooks().forEach(book -> log.info(String.valueOf(book)));
        log.info("--------All keys in repository: --------");
        bookRepositoryService.getAllIsbns().forEach(k -> log.info(String.valueOf(k)));
    }
}
