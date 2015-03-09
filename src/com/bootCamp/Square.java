package com.bootCamp;

/**
 * Created by poojar on 3/9/2015.
 */
public class Square extends Rectangle{

    public Square(double side) {
        super(side, side);
    }


    public double getSide() {
        return super.getLength();
    }
}
