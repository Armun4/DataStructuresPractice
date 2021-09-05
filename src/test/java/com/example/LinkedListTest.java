package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LinkedListTest {

    @Test
    public void testThatCanRetrieveSize(){;

        List list = new List();
        list.addLast(10);
        list.addLast(10);
        list.addLast(10);
        list.removeFirst();
       assertEquals(2, list.size());


    }

}
