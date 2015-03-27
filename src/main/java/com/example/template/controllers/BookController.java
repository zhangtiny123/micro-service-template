package com.example.template.controllers;

import com.example.template.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController
{
    @Autowired
    private BookService bookService;

    @RequestMapping(value = "/{ISBN}/remove-book", method = RequestMethod.GET)
    public ResponseEntity<String> remove(@PathVariable("ISBN") String ISBN)
    {
        bookService.remove(ISBN);
        return new ResponseEntity<>("remove book called", HttpStatus.OK);
    }

    @RequestMapping(value = "/{ISBN}/rent-book", method = RequestMethod.GET)
    public ResponseEntity<String> rent(@PathVariable("ISBN") String ISBN)
    {
        bookService.rent(ISBN);
        return new ResponseEntity<>("rent book called", HttpStatus.OK);
    }
}
