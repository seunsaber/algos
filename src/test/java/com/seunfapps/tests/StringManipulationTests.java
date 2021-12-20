package com.seunfapps.tests;

import com.seunfapps.algos.examples.MinStack;
import com.seunfapps.algos.examples.StringManipulation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class StringManipulationTests {

    @Test
    public void shouldReturnMinimumInStack(){
        String [] words = new String[] {"the", "bats", "tabs", "in", "cat", "act"};
        String [] sentences = new String [] {"cat the bats", "in the act", "act tabs in"};
        int [] expected = new int [] {4,2,4};

        //String [] words = new String[] {"listen", "silent", "it", "is"};
        //String [] sentences = new String [] {"listen it is silent"};
        //int [] expected = new int [] {4};

        StringManipulation stringStuff = new StringManipulation();
        int [] result = stringStuff.getNumberOfSentences(words, sentences);

        Assertions.assertArrayEquals(expected, result);
    }
}
