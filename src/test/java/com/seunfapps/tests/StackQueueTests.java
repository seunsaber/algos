package com.seunfapps.tests;

import com.seunfapps.algos.datastructures.ArrayQueue;
import com.seunfapps.algos.datastructures.StackQueue;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class StackQueueTests {

    @Test
    public void shouldAddItemToQueue(){
        StackQueue queue = new StackQueue(10);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        Assertions.assertEquals(5, queue.count);
    }

    @Test
    public void shouldRemoveItemFromQueue(){
        StackQueue queue = new StackQueue(10);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        queue.dequeue();

        Assertions.assertEquals(2, queue.count);
    }

    @Test
    public void shouldRemoveItemFromFrontOfQueue(){
        StackQueue queue = new StackQueue(10);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        queue.dequeue();
        queue.dequeue();
        int top = queue.dequeue();

        Assertions.assertEquals(30, top);
    }

}
