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
    @Test
    public void Rectangle_with_length_and_breadth_0_should_have_perimeter_0 (){
        Rectangle rectangle = new Rectangle(0.0,0.0);
        double perimeter = rectangle.getPerimeter();
        assertEquals( 0.0, perimeter, 0.0);
    }
    @Test
    public void Rectangle_with_length_and_breadth_1_should_have_perimeter_4 (){
        Rectangle rectangle = new Rectangle(1.0,1.0);
        double perimeter = rectangle.getPerimeter();
        assertEquals( 4.0, perimeter, 0.0);
    }
    @Test
    public void Rectangle_with_length_3_and_breadth_2_should_have_perimeter_10 (){
        Rectangle rectangle = new Rectangle(3.0,2.0);
        double perimeter = rectangle.getPerimeter();
        assertEquals( 10.0, perimeter, 0.0);
    }

    @Test
    public void test_a_new_rectangle_should_have_length_zero() {
        Rectangle rect = new Rectangle(0.0,0.0);
        assertEquals(0.0,rect.getLength(),0.0);
    }
}