package com.seunfapps.tests;

import com.seunfapps.algos.challenges.LongestSubstringWithoutRepeatingChars;
import com.seunfapps.algos.challenges.SearchInSortedArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class SearchInSortedArrayTests {

    @Test
    public void shouldTest(){
        SearchInSortedArray app = new SearchInSortedArray();

        String test = "whatitdo";
        int [] nums = new int []{4, 5, 6, 7, 0, 1, 2};
        int result = app.search(nums, 5);

        Assertions.assertEquals(2, result);
    }

}
