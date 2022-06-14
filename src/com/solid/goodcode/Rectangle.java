package com.solid.goodcode;

public class Rectangle implements TwoDimentionalShape {

    private final int length;

    private final int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    @Override
    public double area() {
        return (getLength() * getWidth());
    }
}
