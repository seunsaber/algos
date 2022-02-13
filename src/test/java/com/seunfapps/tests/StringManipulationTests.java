package com.seunfapps.tests;

import com.seunfapps.algos.examples.MinStack;
import com.seunfapps.algos.examples.StringManipulation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class StringManipulationTests {

    private StringManipulation stringManipulation;

    @BeforeEach
    public void init(){
        stringManipulation = new StringManipulation();
    }

    @Test
    public void shouldReturnMinimumInStack(){
        String [] words = new String[] {"the", "bats", "tabs", "in", "cat", "act"};
        String [] sentences = new String [] {"cat the bats", "in the act", "act tabs in"};
        int [] expected = new int [] {4,2,4};

        //String [] words = new String[] {"listen", "silent", "it", "is"};
        //String [] sentences = new String [] {"listen it is silent"};
        //int [] expected = new int [] {4};

        int [] result = stringManipulation.getNumberOfSentences(words, sentences);

        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    public void shouldCountVowels(){
        String str =  "Hello world";
        int result = stringManipulation.countVowels(str);

        Assertions.assertEquals(3, result);
    }

    @Test
    public void shouldReverse(){
        String str =  "water";
        String result = stringManipulation.reverse(str);

        Assertions.assertEquals("retaw", result);
    }

    @Test
    public void shouldReverseWord(){
        String str =  "The world is a strange place";
        String result = stringManipulation.reverseWords1(str);

        Assertions.assertEquals("place strange a is world The", result);

        result = stringManipulation.reverseWords2(str);
        Assertions.assertEquals("place strange a is world The", result);
    }


}
