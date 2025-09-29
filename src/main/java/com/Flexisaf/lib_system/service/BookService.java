package com.Flexisaf.lib_system.service;

import com.Flexisaf.lib_system.models.Book;
import com.Flexisaf.lib_system.repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepo bookRepo;

    public List<Book> getBooks(){
        return bookRepo.findAll();
    }

    public Book addBook(@RequestBody Book book){
        return bookRepo.save(book);
    }

    public Book updateBook(@RequestBody Book book){
        return bookRepo.save(book);
    }

    public void deleteBook(@PathVariable Long id){
        bookRepo.deleteById(id);
    }
}
