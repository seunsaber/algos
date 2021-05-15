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

    @Test
    public void shouldReturnMax(){
        Array array = new Array(10);
        array.insert(20);
        array.insert(30);
        array.insert(35);
        array.insert(15);
        array.insert(60);
        array.insert(58);
        array.insert(12);
        array.insert(6);
        array.insert(49);

        int max = array.max();

        Assertions.assertEquals(max,  60);

    }

    @Test
    public void shouldReturnCommonItemsInNewArray(){
        Array array1 = new Array(10);
        array1.insert(12);
        array1.insert(26);
        array1.insert(34);
        array1.insert(77);
        array1.insert(6);
        array1.insert(42);
        array1.insert(51);
        array1.insert(53);

        Array array2 = new Array(8);
        array2.insert(65);
        array2.insert(26);
        array2.insert(34);
        array2.insert(12);
        array2.insert(53);
        array2.insert(67);

        Array result = array1.intersect(array2);
        result.print();

        Assertions.assertEquals(result.getCount(), 4);
    }

    @Test
    public void shouldReverseArray(){
        Array array = new Array(5);
        array.insert(1);
        array.insert(2);
        array.insert(3);
        array.insert(4);

        array.print();

        Array reversed = array.reverse();
        reversed.print();

        Assertions.assertEquals(reversed.indexOf(4), 0);
    }

    @Test
    public void shouldInsertItemIntoArray(){
        Array array = new Array(10);

        array.insert(20);
        array.insert(30);
        array.insert(35);
        array.insert(15);
        array.print();
        int beforeCount = array.getCount();
        array.insertAt(3, 34);
        array.print();
        int afterCount = array.getCount();

        Assertions.assertEquals(afterCount, beforeCount + 1);

    }
}
