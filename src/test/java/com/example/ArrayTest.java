package com.example;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ArrayTest {

    @Test public void testArrayLength(){
        Array numbers = new Array(3);

        assertEquals(3,numbers.getLength());

    }

    @Test public void testArrayInsertItems(){
        Array numbers = new Array(2);
        numbers.insert(10);
        numbers.insert(10);
        numbers.insert(10);
        numbers.insert(10);
        assertEquals( 4, numbers.getLength());

    }
    
}
