package com.example;

import java.util.Arrays;

import java.util.List;
import java.util.Stack;

public class StringEvaluator {

    private final List rightBrackets = Arrays.asList(')', ']', '}', '>');
    private final List LeftBrackets = Arrays.asList('(', '[', '{', '<');

    public Boolean isBalanced(String input) {
        Stack<Character> stack = new Stack();
        for( char c : input.toCharArray()){
            if (isLeftBracket(c)) stack.push(c);

            if (isRightBracket(c)){
                if (stack.isEmpty()) return false;

               char top = stack.pop();
               if(!bracketsMatch(top, c)) return false;
            }
        }
        return stack.isEmpty();
    }

    private boolean isRightBracket(char c) {
        return rightBrackets.contains(c);
    }

    private boolean isLeftBracket(char c) {
        return LeftBrackets.contains(c);
    }

    private boolean bracketsMatch(char left, char right) {
       return LeftBrackets.indexOf(left)  == rightBrackets.indexOf(right);
    }
}



