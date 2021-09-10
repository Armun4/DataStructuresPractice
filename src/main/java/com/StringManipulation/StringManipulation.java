package com.StringManipulation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class StringManipulation {

    public int countVowels(String input) {
        HashSet<String> vowels = new HashSet<>(Arrays.asList("a", "e", "i", "o", "u"));
        int count = 0;
        for(char c : input.toCharArray()) {
            if (vowels.contains(Character.toString(c)))
                count++;
        }
     return count;
    }

}
