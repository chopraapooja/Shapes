package com.bootCamp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by poojar on 3/9/2015.
 */
public class SquareTest {
    @Test
    public void test_a_new_square_should_have_side_zero (){
        Square dabba = new Square(0.0);
        assertEquals(0.0,dabba.getSide(),0.0);
    }

    @Test
    public void test_square_with_length_2_should_give_area_2 (){
        Square dabba = new Square(2.0);
        assertEquals(4.0,dabba.getArea(),0.0);
    }

}
