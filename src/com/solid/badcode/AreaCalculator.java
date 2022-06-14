package com.solid.badcode;

import java.util.List;

public class AreaCalculator {
    //violated Open closed principle by adding if the condition for Rectangle
    public int sum(List<Object> shapes){
        int sum = 0;
        for(int i=0; i< shapes.size();i++){
            Object shape = shapes.get(i);
            if(shape instanceof Square){
                sum += Math.pow(((Square) shape).getLength(),2);
            }
            if(shape instanceof Circle) {
                sum += Math.PI * Math.pow(((Circle) shape).getRadius(), 2);
            }
            if(shape instanceof Rectangle) {
                sum += ((Rectangle) shape).getLength() * ((Rectangle) shape).getWidth();
            }
//            if(shape instanceof Sphere) {
//                sum += 4 * Math.PI * Math.pow(((Sphere) shape).getRadius(),2);
//            }
        }
        return sum;
    }

    //vioalting single responsibility principle
    public int printSum(int sum){
        return sum;
    }
}
