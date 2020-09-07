package com.company;

public class TesterBook {
    public static void main(String[] args) {
        Book book = new Book(200, "Book");
        System.out.println("Pages is " +  book.getPages() + "\nName is " + book.getName());
    }
}
