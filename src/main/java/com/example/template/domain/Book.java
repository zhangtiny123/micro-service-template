package com.example.template.domain;

public class Book
{
    private String name;
    private String ISBN;
    private String author;
    private float price;

    public Book(String name, String ISBN, String author)
    {
        this.name = name;
        this.ISBN = ISBN;
        this.author = author;
    }

    public String getName()
    {
        return name;
    }

}
