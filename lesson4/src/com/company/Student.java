package com.company;

public class Student {
    int age;
    String name;
    Book book;

    public Student() {

    }

    public Student(int age, String name, Book book) {
        this.age = age;
        this.name = name;
        this.book = book;
    }

     void displayInfo(){
       System.out.printf("Name: %s \tAge: %s\n Book: %s, \t%s\n", name, age, book.bookName, book.pages);
    }

}
