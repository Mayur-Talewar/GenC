package com.example.demo.controller;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    // POST /books - create a new book
    @PostMapping
    public Book createBook(@RequestBody Book book) {
        return bookRepository.save(book);
    }

    // GET /books - get all books
    @GetMapping
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    // GET /books/{id} - get a book by ID
    @GetMapping("/{id}") 
    public Book getBookById(@PathVariable Long id) {
        return bookRepository.findById(id).orElse(null);
    }   

    @DeleteMapping("/{id}")
public void deleteBookById(@PathVariable Long id) {
    bookRepository.deleteById(id);
}
}