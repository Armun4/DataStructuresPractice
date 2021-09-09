package com.example;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TreeTest {

    @Test public void testThatTreeContainsValue(){
        Tree tree = new Tree();
        tree.insert(10);
        tree.insert(40);
        tree.insert(20);
        tree.insert(30);
        tree.insert(60);
        Boolean result = tree.find(30);
        assertTrue(result);
    }
    @Test public void testThatTreeDoesNotContainsValue(){
        Tree tree = new Tree();
        tree.insert(10);
        tree.insert(40);
        tree.insert(20);
        tree.insert(30);
        tree.insert(60);
        Boolean result = tree.find(31);
        assertFalse(result);
    }
}
