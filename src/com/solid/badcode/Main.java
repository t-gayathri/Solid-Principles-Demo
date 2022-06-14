package com.solid.badcode;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //violating dependency inversion principle since the object is dependent on concretions rather than abstractions
        AreaCalculator areaCalculator = new AreaCalculator();
        Circle circle = new Circle(4);
        Square square = new Square(4);
        Rectangle rectangle = new Rectangle(8,4);
        Sphere sphere = new Sphere(4);
        List<Object> shapes = List.of(circle,square,rectangle,sphere);
        int sum = areaCalculator.sum(shapes);
        System.out.println(areaCalculator.printSum(sum));
        VolumeCalculator volumeCalculator = new VolumeCalculator();
        Sphere spherevol = new Sphere(6);
        List<Object> shapesvol = List.of(sphere);
        int vol = volumeCalculator.volume(shapesvol);
        System.out.println(vol);

    }
}
