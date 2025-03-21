package com.example.smkhguru.services;

import com.example.smkhguru.domain.Book;

public interface BookService {
    
    Iterable<Book> findAll();
}
