package com.StringManipulation;

import com.example.ArrayQueue;

import java.util.*;

public class StringManipulation {

    public static int countVowels(String input) {
        HashSet<String> vowels = new HashSet<>(Arrays.asList("a", "e", "i", "o", "u"));
        int count = 0;
        for(char c : input.toCharArray()) {
            if (vowels.contains(Character.toString(c)))
                count++;
        }
     return count;
    }
    public static String stringReverser(String input) {
        if (input == null) return "";
     StringBuffer reversed = new StringBuffer();
     for (int i = input.length()-1; i >= 0 ; i--)
         reversed.append(input.charAt(i));
     return reversed.toString();
    }

    public boolean areAnagrams(String input, String input2) {
        if (input == null || input2 == null || input.length() != input2.length()) return false;
        char[] array1 = input.toCharArray();
        Arrays.sort(array1);
        char[] array2 = input2.toCharArray();
        Arrays.sort(array2);
        return Arrays.equals(array1, array2);
    }
    public static boolean isPalindrome(String word){
        int first = 0;
        int last = word.length()-1;

        while(first < last)
            if(word.charAt(first++) != word.charAt(last--))
                return false;

        return true;
    }

    public static char mostRepeatedCharacter(String input){
        if(input.length() == 0) throw new IllegalStateException();

        final int ALPHABET = 256;
        int[] frecuencies =  new int[ALPHABET];
        for(char c : input.toCharArray())
            frecuencies[c]++;
        int max = 0;
        char result = ' ';
        for (int i = 0; i < frecuencies.length; i++)
            if(frecuencies[i] > max ){
                max = frecuencies[i];
                        result = (char) i;}

         return result;

    }
}
