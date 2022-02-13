package com.seunfapps.tests;

import com.seunfapps.algos.examples.StringManipulation;
import com.seunfapps.algos.sorting.BubbleSort;
import com.seunfapps.algos.sorting.InsertionSort;
import com.seunfapps.algos.sorting.SelectionSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class SortingTests {

    private int [] items;
    @BeforeEach
    public void init(){
        items = new int[] {5, 1, 4, 2, 3, 1, 0, 8, 9, 7};
    }

    @Test
    public void bubbleSort(){
        BubbleSort bubbleSort = new BubbleSort();
        int [] result = bubbleSort.sort(items);
        Arrays.sort(items);
        Assertions.assertArrayEquals(items, result);
    }

    @Test
    public void selectionSort(){
        SelectionSort selectionSort = new SelectionSort();
        int [] result = selectionSort.sort(items);
        Arrays.sort(items);
        Assertions.assertArrayEquals(items, result);
    }

    @Test
    public void insertionSort(){
        InsertionSort insertionSort = new InsertionSort();
        int [] result = insertionSort.sort(items);
        Arrays.sort(items);
        Assertions.assertArrayEquals(items, result);
    }
}
