package com.example.smkhguru.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.smkhguru.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

}
