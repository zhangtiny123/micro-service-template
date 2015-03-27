package com.example.template.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.logging.FileHandler;
import java.util.logging.Logger;

@Service
public class BookService
{
    private Logger logger;

    @Autowired
    public BookService(Logger logger, FileHandler fileHandler)
    {
        this.logger = logger;
        logger.addHandler(fileHandler);
    }

    public void remove(String isbn)
    {
        logger.info("remove the book, ISBN is: " + isbn);
    }

    public void rent(String isbn)
    {
        logger.info("rent a book, ISBN is: " + isbn);
    }
}
