package com.solid.goodcode;

import java.util.List;

public class PrintingAreaSum {

    private final IAreaCalculator iAreaCalculator;

    public PrintingAreaSum(IAreaCalculator iAreaCalculator) {
        this.iAreaCalculator = iAreaCalculator;
    }

    public String printSum(List<TwoDimentionalShape> twoDimentionalShapes){
        return "Sum of Areas: "+iAreaCalculator.sum(twoDimentionalShapes);
    }
}
