package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
public class BookController {

    public BookController

    @Autowired
    private BookRepository bookRepository;

    @GetMapping
    public String getAllBooks(){
        return "getAllBooks";
    }



//    @PostMapping
//    public Book creatBook(@RequestBody Book book){
//        return bookRepository.save(book);
//    }
}
