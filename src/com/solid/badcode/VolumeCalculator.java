package com.solid.badcode;

import java.util.List;

public class VolumeCalculator {
    public int volume(List<Object> shapesvol){
        int vol = 0;
        if(shapesvol instanceof Sphere){
            vol += (int) (4/3 * Math.PI * Math.pow(((Sphere) shapesvol).getRadius(),3));
        }
        return vol;
    }
}
