package com.solid.badcode;

public class Square implements Shapes{
    private final int length;

    public Square(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    public double area() {
        return 0;
    }

    //violating Liscov substitution principle
    @Override
    public double volume() {
        throw new IllegalStateException("cannot calculate area");
    }
}
