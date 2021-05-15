package com.seunfapps.tests;

import com.seunfapps.algos.datastructures.Array;
import org.junit.jupiter.api.Test;

public class ArrayTests {
    @Test
    public void shouldInsertIntoArray(){
        Array array = new Array(5);
        array.insert(20);
        array.insert(30);
        array.print();
    }
}
