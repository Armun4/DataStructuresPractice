package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StackTest {

    @Test public void testThatCanReverseAString(){
        StringReverser reverser = new StringReverser();
        String str = "abcd";
        String reversedStr = reverser.reverse(str);
        assertEquals("dcba", reversedStr);
    }
}
