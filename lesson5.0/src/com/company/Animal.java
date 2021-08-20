package com.company;

public class Animal {
     private int age;
     public String color;

    public Animal( String color) {
        this.color = color;
    }

    public Animal( String color, int age) {
        this.color = color;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
