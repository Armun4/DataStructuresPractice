package com.example;

import java.util.Arrays;

import java.util.List;
import java.util.Stack;

public class StringEvaluator {

    private final List rightBrackets = Arrays.asList(')', ']', '}', '>');
    private final List LeftBrackets = Arrays.asList('(', '[', '{', '<');

    public Boolean isBalanced(String input) {
        Stack<Character> Evaluator = new Stack();
        for( char c : input.toCharArray()){
            if (isLeftBracket(c)) Evaluator.push(c);

            if (isRightBracket(c)){
                if (Evaluator.isEmpty()) return false;

               char top = Evaluator.pop();
               if(!bracketsMatch(top, c)) return false;
            }
        }
        return Evaluator.isEmpty();
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



