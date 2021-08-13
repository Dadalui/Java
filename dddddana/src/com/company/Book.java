package com.company;

public class Book {
     String bookName;
     int pages;

     public Book() {
     }

     public Book(String bookName, int pages) {
          this.bookName = bookName;
          this.pages = pages;
     }
     void displayInfo(){
          System.out.println(bookName + " " + pages);
     }
}
