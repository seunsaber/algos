package com.seunfapps.tests;

import com.seunfapps.algos.datastructures.Array;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ArrayTests {

    @Test
    public void shouldInsertIntoArray(){
        Array array = new Array(5);
        array.insert(20);
        array.insert(30);
        array.print();
        Assertions.assertEquals(array.getCount(), 2);
    }

    @Test
    public void shouldThrowExceptionIfIndexIsLessThanZero(){
        Array array = new Array(5);
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
           array.removeAt(-1);
        });
    }

    @Test
    public void shouldThrowExceptionIfIndexIsGreaterThanCount(){
        Array array = new Array(5);
        array.insert(20);
        array.insert(30);
        array.insert(35);
        array.print();
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            array.removeAt(4);
        });
    }

    @Test
    public void shouldThrowExceptionIfIndexIsEqualToCount(){
        Array array = new Array(5);
        array.insert(20);
        array.insert(30);
        array.insert(35);
        array.print();
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            array.removeAt(3);
        });
    }

    @Test
    public void shouldRemoveItemFromArray(){
        Array array = new Array(5);
        array.insert(20);
        array.insert(30);
        array.insert(35);
        array.insert(15);
        array.print();
        int beforeCount = array.getCount();
        array.removeAt(1);
        array.print();
        int afterCount = array.getCount();

        Assertions.assertEquals(afterCount, beforeCount - 1);

    }

    @Test
    public void shouldReturnNegativeOneIfNumberNotFound(){
        Array array = new Array(5);
        array.insert(20);
        array.insert(30);
        array.insert(35);
        array.insert(15);

        int index = array.indexOf(69);
        Assertions.assertEquals(index,  - 1);

    }

    @Test
    public void shouldReturnIndexIfFound(){
        Array array = new Array(5);
        array.insert(20);
        array.insert(30);
        array.insert(35);
        array.insert(15);

        int index = array.indexOf(35);
        Assertions.assertEquals(index,  2);

    }
}
