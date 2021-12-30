package com.seunfapps.tests.challenge;

import com.seunfapps.algos.challenges.ReverseWords;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ReverseWordsTests {

    @Test
    public void runTest(){
        ReverseWords app = new ReverseWords();


        String input = "   hello world   ";

        //String result = app.reverseWords(input);
        String result = app.reverseWords2(input);

        Assertions.assertEquals("world hello", result);
    }
}
