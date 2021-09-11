package com.example;

import com.StringManipulation.StringManipulation;
import org.junit.Test;

import static com.StringManipulation.StringManipulation.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class StringManipulationTest {

    @Test
    public void testThatCanRetrieveNumberOfVowels() {

        int result = countVowels("hello");
        assertEquals(2, result);

    }
    @Test
    public void testStringReverser() {
        String result = stringReverser("hello");
        assertEquals("olleh", result);
    }

    @Test public void testIsPalindrome(){

        boolean result = isPalindrome("madam");
        assertTrue(result);

    }

    @Test public void testMostRepeatedCharacters() {
        char result = mostRepeatedCharacter("pppppppppppppppppppppppppppaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaappppppppppppppppppppppprrrrrrrrrrrrrrrrr");
        assertEquals('p',result );
    }




}