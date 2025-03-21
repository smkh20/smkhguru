package com.example.smkhguru.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.smkhguru.domain.Author;
import com.example.smkhguru.domain.Book;
import com.example.smkhguru.domain.Publisher;
import com.example.smkhguru.repositories.AuthorRepository;
import com.example.smkhguru.repositories.BookRepository;
import com.example.smkhguru.repositories.PublisherRepository;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor

public class BootstrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    @Override
    public void run(String... args) {

        System.out.println("start runner");
        
        Author author1 = new Author();
        author1.setFname("sm");
        author1.setLname("kh");
        
        Book book1 = new Book();
        book1.setTitle("mylife");
        book1.setIsbn("123");

        Publisher publisher1 = new Publisher();
        publisher1.setPublisherName("rostam");
        publisher1.setCity("teh");

        Author savedAuthor = authorRepository.save(author1);
        Book savedBook = bookRepository.save(book1);
        Publisher savedPublisher = publisherRepository.save(publisher1);

        savedAuthor.getBooks().add(savedBook);
        savedBook.getAuthors().add(savedAuthor);
        savedBook.setPublisher(savedPublisher);

        authorRepository.save(savedAuthor);
        bookRepository.save(savedBook);

        System.out.println("end runner");
    }
}
