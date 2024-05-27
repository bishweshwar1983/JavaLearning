package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private BookRepository bookRepository;

    public BookController(){

    }

    @Autowired
    public void setBookRepository(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    // Create a new book
    @PostMapping
    public Book createBook(@RequestBody Book book) {
        return bookRepository.save(book);
    }

    // Modified Get all books with pagination and sorting
    //GET /books?page=<pageNumber>&size=<pageSize>&sort=<fieldName>,<direction>
    @GetMapping
    public List<Book> getAllBooks( @PageableDefault(size = 3, page = 0) Pageable pageable) {
//        System.out.println(pageable.getClass());
        return bookRepository.findAll(pageable).getContent();
    }

    // New endpoints for search by title and author
    @GetMapping("/search/title/{title}")
    public List<Book> getBooksByTitle(@PathVariable String title) {
        return bookRepository.findByTitleContainingIgnoreCase(title);
    }

    @GetMapping("/search/author/{author}")
    public List<Book> getBooksByAuthor(@PathVariable String author) {
        return bookRepository.findByAuthorContainingIgnoreCase(author);
    }

    // Get a book by ID with exception handling
    @GetMapping("/{id}")
    public Book getBookById(@PathVariable Long id) {
        return bookRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Book not found with id: " + id));
    }

    // Update a book with exception handling
    @PutMapping("/{id}")
    public Book updateBook(@PathVariable Long id, @RequestBody Book bookDetails) {
        Book book = bookRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Book not found with id: " + id));
        book.setTitle(bookDetails.getTitle());
        book.setAuthor(bookDetails.getAuthor());
        return bookRepository.save(book);
    }

    // Delete a book with exception handling
    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id) {
        if (!bookRepository.existsById(id)) {
            throw new ResourceNotFoundException("Book not found with id: " + id);
        }
        bookRepository.deleteById(id);
    }
}
