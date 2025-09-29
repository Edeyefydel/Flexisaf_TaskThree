package com.Flexisaf.lib_system.controller;

import com.Flexisaf.lib_system.models.Book;
import com.Flexisaf.lib_system.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Books")
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping
    public List<Book> getBookService(){
        return bookService.getBooks();
    }

    @PostMapping
    public Book addBook(@RequestBody Book book){
        return bookService.addBook(book);
    }

    @PutMapping
    public Book updateBook(@RequestBody Book book){
        return bookService.updateBook(book);
    }

    @DeleteMapping
    public String deleteBook(@PathVariable Long id){
        bookService.deleteBook(id);
        return "Book deleted";
    }
}
