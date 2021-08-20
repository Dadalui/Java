package com.company;

public class Mammals extends Animal {
    int paws;
    int teeth;

    public Mammals(String color, int paws, int teeth) {
        super(color);
        this.paws = paws;
        this.teeth = teeth;

    }

    public int getPaws() {
        return paws;
    }

    public void setPaws(int paws) {
        this.paws = paws;
    }

    public int getTeeth() {
        return teeth;
    }

    public void setTeeth(int teeth) {
        this.teeth = teeth;
    }

    public final void displayMoreStrangeInfo(){
        System.out.println( " my color  " + color);
    }

    void displayInfo(){
        System.out.println(  " I have paws: " + paws + " and teeth: " + teeth );
    }
}
