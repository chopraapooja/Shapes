package com.bootCamp;

/**
 * Created by poojar on 3/6/2015.
 */
public class Rectangle {

    private double length;
    private double breadth;

    public Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    public double getArea() {

        return length*breadth;
    }
}
