package com.example.smkhguru.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.smkhguru.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
