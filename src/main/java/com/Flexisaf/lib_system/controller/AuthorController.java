package com.Flexisaf.lib_system.controller;

import com.Flexisaf.lib_system.models.Author;
import com.Flexisaf.lib_system.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/authors")
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping
    public List<Author> getAuthor(){
        return authorService.getAuthor();
    }
    @PostMapping
    public Author createAuthor(@RequestBody Author author){
        return authorService.createAuthor(author);
    }
}
