package com.example.smkhguru.services;

import org.springframework.stereotype.Service;

import com.example.smkhguru.domain.Book;
import com.example.smkhguru.repositories.BookRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    @Override
    public Iterable<Book> findAll() {
        return bookRepository.findAll();
    }

}
