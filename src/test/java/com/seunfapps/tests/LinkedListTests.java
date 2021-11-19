package com.seunfapps.tests;

import com.seunfapps.algos.datastructures.LinkedList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class LinkedListTests {

    @Test
    public void shouldReverse(){
        LinkedList list = new LinkedList();
        list.addLast("A");
        list.addLast("B");
        list.addLast("C");
        list.addLast("D");
        list.addLast("E");
        list.addLast("F");
        list.addLast("G");
        list.addLast("H");
        list.addLast("I");
        list.addLast("J");
        list.reverse();
        Assertions.assertEquals("J", list.getFirst().getValue());
    }

    @Test
    public void shouldGetKth(){
        LinkedList list = new LinkedList();
        list.addLast("A");
        list.addLast("B");
        list.addLast("C");
        list.addLast("D");
        list.addLast("E");
        list.addLast("F");
        list.addLast("G");
        list.addLast("H");
        list.addLast("I");
        list.addLast("J");
        String result = list.getKthFromTheEndUsingSize(5);
        Assertions.assertEquals("F", result);
    }

    @Test
    public void shouldGetKth2(){
        LinkedList list = new LinkedList();
        list.addLast("A");
        list.addLast("B");
        list.addLast("C");
        list.addLast("D");
        list.addLast("E");
        list.addLast("F");
        list.addLast("G");
        list.addLast("H");
        list.addLast("I");
        list.addLast("J");
        String result = list.getKthFromTheEndUsingCounter(10);
        Assertions.assertEquals("A", result);
    }

    @Test
    public void shouldReturnMiddleNode(){
        LinkedList list = new LinkedList();
        list.addLast("1");
        list.addLast("2");
        list.addLast("3");
        list.addLast("4");
        list.addLast("5");
        list.addLast("6");
        list.addLast("7");
        list.addLast("8");
        list.addLast("9");
        list.addLast("10");
        list.addLast("11");
        String result = list.findMiddle();
        Assertions.assertEquals("6", result);
    }

    @Test
    public void shouldReturnMiddleNodes(){
        LinkedList list = new LinkedList();
        list.addLast("1");
        list.addLast("2");
        list.addLast("3");
        list.addLast("4");
        list.addLast("5");
        list.addLast("6");
        list.addLast("7");
        list.addLast("8");
        list.addLast("9");
        list.addLast("10");
        list.addLast("11");
        list.addLast("12");
        String result = list.findMiddle();
        Assertions.assertEquals("6,7", result);
    }

}
