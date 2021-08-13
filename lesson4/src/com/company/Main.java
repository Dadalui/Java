package com.company;

public class Main {
    public static void main(String[] args) {

        Book n1 = new Book("n1", 190);
        Book n2 = new Book("n2", 29);

        Student pupa = new Student();
        pupa.name = "Pupa";
        pupa.age = 34;
        pupa.book = n1;
        pupa.displayInfo();

        Student lupa = new Student( 20, "Lupa", n2);
        lupa.displayInfo();

        Changer changer = new Changer();
        changer.changeBook(pupa, lupa);


        System.out.println("menyaem");


        pupa.displayInfo();
        lupa.displayInfo();


    }
}


