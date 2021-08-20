package com.company;

public class Dog extends Mammals {
    String breed;

    public Dog(String color, String  breed, int paws, int teeth) {
        super(color,paws, teeth);

        this.breed = breed;
        System.out.println( "hello");
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void voof(){
        System.out.println( " Voof " + " My color: " + color + "     I have " + paws + " paws "  + " " + " My breed:"  + breed + " " + "Voof ");
    }

    @Override

    void displayInfo(){
        super.displayInfo();
        System.out.println("   " + paws + " " +"cool paws");
    }
}
