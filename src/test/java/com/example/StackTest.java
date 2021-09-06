package com.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {

    @Test public void testThatCanReverseAString(){
        StringReverser reverser = new StringReverser();
        String str = "abcd";
        String reversedStr = reverser.reverse(str);
        assertEquals("dcba", reversedStr);
    }
    @Test public void testThatStringIsBalanced() {
        StringEvaluator BalancedEvaluator = new StringEvaluator();
        Boolean isBalanced = BalancedEvaluator.isBalanced("(holapanita)");

        assertTrue(isBalanced);
    }
    @Test public void testThatStringIsNotBalanced() {
        StringEvaluator BalancedEvaluator = new StringEvaluator();
        Boolean isBalanced = BalancedEvaluator.isBalanced("((<holapanita>");

        assertFalse(isBalanced);
    }
}
