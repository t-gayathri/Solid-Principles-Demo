package com.solid.goodcode;

import java.util.List;

public class AreaCalculator implements IAreaCalculator {
    @Override
    public int sum(List<TwoDimentionalShape> twoDimentionalShapes){
        int sum = 0;
        for(int i = 0; i< twoDimentionalShapes.size(); i++){
            sum += twoDimentionalShapes.get(i).area();
        }
        return sum;
    }
}
