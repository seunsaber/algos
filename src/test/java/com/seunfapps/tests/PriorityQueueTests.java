package com.seunfapps.tests;

import com.seunfapps.algos.datastructures.PriorityQueue;
import com.seunfapps.algos.datastructures.StackQueue;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.Arrays;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class PriorityQueueTests {

    @Test
    public void shouldAddItemToQueue(){
        PriorityQueue queue = new PriorityQueue(10);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        Assertions.assertEquals(5, queue.count);
    }

    @Test
    public void shouldPlaceItemInSortedPosition(){
        PriorityQueue queue = new PriorityQueue(20);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(5);
        queue.enqueue(40);
        queue.enqueue(35);
        queue.enqueue(50);
        queue.enqueue(60);
        queue.enqueue(45);
        queue.enqueue(15);

        int top1 = queue.dequeue();
        int top2 = queue.dequeue();
        int top3 = queue.dequeue();

        Assertions.assertEquals(5, top1);
        Assertions.assertEquals(10, top2);
        Assertions.assertEquals(15, top3);

        System.out.println(queue);
    }

    @Test
    public void shouldRemoveItemFromQueue(){
        PriorityQueue queue = new PriorityQueue(10);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        queue.dequeue();

        Assertions.assertEquals(2, queue.count);
    }

    @Test
    public void shouldRemoveItemFromFrontOfQueue(){
        PriorityQueue queue = new PriorityQueue(10);

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
