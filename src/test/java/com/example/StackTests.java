package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class StackTests {
    @Test public void testThatCanRetrieveFirstNonRepentingCharacter(){
        HashExercises hashTable = new HashExercises();
        char result = hashTable.firstNonDuplicated("aabbcxcdsd");
        assertEquals('x', result);
    }
    @Test public void testThatFunctionReturnsUnderScoreWhenThereAreNoRepeatingCharacter(){
        HashExercises hashTable = new HashExercises();
        char result = hashTable.firstNonDuplicated("aaabbbeeee");
        System.out.println(result);
        assertEquals('_', result);
    }

    @Test public void testThatFunctionReturnsFirstRepetingCharacter(){
        HashExercises hash = new HashExercises();
        char result = hash.firstDuplicated("xcaaa");
        assertEquals('a', result);
    }
}
