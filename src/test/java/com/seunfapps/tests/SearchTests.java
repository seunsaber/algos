package com.seunfapps.tests;

import com.seunfapps.algos.search.BinarySearch;
import com.seunfapps.algos.search.LinearSearch;
import com.seunfapps.algos.sorting.BubbleSort;
import com.seunfapps.algos.sorting.InsertionSort;
import com.seunfapps.algos.sorting.SelectionSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.Arrays;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class SearchTests {

    private int [] items;
    private int [] sortedItems;
    @BeforeEach
    public void init(){
        items = new int[] {5, 1, 4, 2, 3, 1, 0, 8, 9, 7};
        sortedItems = new int[] {1, 4, 6, 9, 10, 18, 34, 51, 66, 68, 71};
    }

    @Test
    public void linearSearch(){
        LinearSearch linearSearch = new LinearSearch();
        int result = linearSearch.search(items, 2);
        Assertions.assertEquals(3, result);
    }

    @Test
    public void binarySearch(){
        BinarySearch binarySearch = new BinarySearch();
        int result = binarySearch.recursiveBinarySearch(sortedItems, 10);
        Assertions.assertEquals(4, result);

        BinarySearch binarySearch2 = new BinarySearch();
        int result2 = binarySearch2.search(sortedItems, 10);
        Assertions.assertEquals(4, result2);
    }

}
