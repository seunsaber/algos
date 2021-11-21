package com.seunfapps.tests;

import com.seunfapps.algos.datastructures.ArrayQueue;
import com.seunfapps.algos.examples.MinStack;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ArrayQueueTests {

    @Test
    public void shouldAddItemToQueue(){
        ArrayQueue queue = new ArrayQueue(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);

        Assertions.assertEquals(5, queue.count);
    }

    @Test
    public void shouldRemoveItemFromQueue(){
        ArrayQueue queue = new ArrayQueue(10);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        queue.dequeue();

        Assertions.assertEquals(2, queue.count);
    }

    @Test
    public void shouldRemoveItemFromFrontOfQueue(){
        ArrayQueue queue = new ArrayQueue(10);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        queue.dequeue();
        int top = queue.peek();
        Assertions.assertEquals(20, top);
    }

    @Test
    public void shouldAddItemToCircularQueue(){
        ArrayQueue queue = new ArrayQueue(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);
        queue.enqueue(70);

        Assertions.assertEquals(5, queue.count);
    }

    @Test
    public void shouldUpdateItemAtFromOfCircularQueue(){
        ArrayQueue queue = new ArrayQueue(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);
        queue.enqueue(70);

        int value = queue.dequeue();

        Assertions.assertEquals(60, value);
    }

}
