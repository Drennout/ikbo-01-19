package com.company;

public class Book {
    private int pages;
    private String name;

    Book(int pages, String name){
        this.name = name;
        this.pages = pages;
    }

    public String getName(){
        return name;
    }

    public int getPages(){
        return pages;
    }
}
