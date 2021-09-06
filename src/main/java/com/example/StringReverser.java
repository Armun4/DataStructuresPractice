package com.example;

import java.util.Stack;

public class StringReverser {

    public String reverse(String input){

        if (input == null)throw new IllegalArgumentException();
        Stack<Character> stack = new Stack<Character>();

        for(Character c : input.toCharArray())
            stack.push(c);
        StringBuffer reversed = new StringBuffer();
        while(!stack.isEmpty())
            reversed.append(stack.pop());

        return reversed.toString();
    }
}
