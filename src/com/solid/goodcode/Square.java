package com.solid.goodcode;

public class Square implements TwoDimentionalShape {
    private final int length;

    public Square(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    public double area() {
        return Math.pow(getLength(),2);
    }
}
