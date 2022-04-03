package com.seunfapps.tests;

import com.seunfapps.algos.challenges.LongestSubstringWithoutRepeatingChars;
import com.seunfapps.algos.datastructures.Graph;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class LongestSubstringWithoutRepeatingCharsTests {

    @Test
    public void shouldTest(){
        LongestSubstringWithoutRepeatingChars app = new LongestSubstringWithoutRepeatingChars();

        String test = "whatitdo";

        int result = app.lengthOfLongestSubstring(test);

        Assertions.assertEquals(5, result);
    }

}
