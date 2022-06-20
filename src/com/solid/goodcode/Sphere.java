package com.solid.goodcode;

public class Sphere implements ThreeDimentionalShapes{
    private final int radius;

    public Sphere(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public double area() {
        return 4 * Math.PI * Math.pow(getRadius(),2);
    }

    @Override
    public double volume() {
        return 4/3 * Math.PI * Math.pow(getRadius(),3);
    }
}
