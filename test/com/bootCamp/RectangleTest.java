package com.bootCamp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by poojar on 3/6/2015.
 */
public class RectangleTest {
    @Test
    public void Rectangle_with_length_and_breadth_0_should_have_area_0 (){
        Rectangle rectangle = new Rectangle(0.0,0.0);
        double area = rectangle.getArea();
        assertEquals( 0.0, area, 0.0);
    }
    @Test
    public void Rectangle_with_length_and_breadth_1_should_have_area_1 (){
        Rectangle rectangle = new Rectangle(1.0, 1.0);
        double area = rectangle.getArea();
        assertEquals( 1.0, area, 0.0);
    }
}
