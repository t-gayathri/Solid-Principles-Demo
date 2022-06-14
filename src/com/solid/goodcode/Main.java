package com.solid.goodcode;

import java.util.List;

public class Main{
    public static void main(String[] args) {
        IAreaCalculator areaCalculator = new AreaCalculator();
        Circle circle = new Circle(4);
        Square square = new Square(4);
        Rectangle rectangle = new Rectangle(10,5);
        PrintingAreaSum printingAreaSum = new PrintingAreaSum(areaCalculator);
        List<TwoDimentionalShape> twoDimentionalShapes = List.of(circle,square, rectangle);
        int sum = areaCalculator.sum(twoDimentionalShapes);
        System.out.println(printingAreaSum.printSum(twoDimentionalShapes));
    }
}
