package com.seunfapps.tests.challenge;

import com.seunfapps.algos.challenges.ReverseWords;
import com.seunfapps.algos.challenges.ReverseWords2;
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

    @Test
    public void runTest2(){
        ReverseWords2 app = new ReverseWords2();


        char [] input = new char []{'t','h','e',' ','s','k','y',' ','i','s',' ','b','l','u','e'};

        char [] result = app.reverseWords(input);

        char [] actual = new char [] {'b','l','u','e',' ','i','s',' ','s','k','y',' ','t','h','e'};

        Assertions.assertArrayEquals(actual, result);
    }
}
