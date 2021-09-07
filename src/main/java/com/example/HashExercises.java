package com.example;

import java.util.HashMap;
import java.util.HashSet;

public class HashExercises {

    public char firstNonDuplicated(String s){
        HashMap<Character, Integer> charCount = new HashMap();
       int i;
        for( i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(charCount.containsKey(c)){
                charCount.put(c, charCount.get(c)+1);
            }else {
                charCount.put(c, 1);
            }
        }
        for( i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(charCount.get(c)== 1)
                return c;

        }
    return '_';
    }

    public char firstDuplicated(String s){
     HashSet seen = new HashSet();

     for (int i = 0; i < s.length(); i++){
         if(seen.contains(s.charAt(i)))return s.charAt(i);

         seen.add(s.charAt(i));
     }
     return '_';
    }
}
