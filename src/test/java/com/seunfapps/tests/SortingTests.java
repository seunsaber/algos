package com.seunfapps.tests;

import com.seunfapps.algos.examples.StringManipulation;
import com.seunfapps.algos.sorting.BubbleSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class SortingTests {

    @Test
    public void bubbleSort(){
        int [] items = new int[] {4,1,3,5,3,2,8,9,6};

        BubbleSort bubbleSort = new BubbleSort();

        int [] result = bubbleSort.sort(items);

        Arrays.sort(items);

        Assertions.assertArrayEquals(items, result);
    }
}
