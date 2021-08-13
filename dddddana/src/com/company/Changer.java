package com.company;

import com.company.Book;
import com.company.Student;

public class Changer {
 void changeBook(Student st1, Student st2) {
   Book book = st1.book;
     st1.book = st2.book;
     st2.book = book;
 }
}

