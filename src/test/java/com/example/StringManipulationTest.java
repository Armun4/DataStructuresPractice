package com.example;

import com.StringManipulation.StringManipulation;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringManipulationTest {

    @Test public void testThatCanRetrieveNumberOfVowels(){
        StringManipulation manipulator = new StringManipulation();
        int result = manipulator.countVowels("hello");
        assertEquals(2, result);

    }
}
