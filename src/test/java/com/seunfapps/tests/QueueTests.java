package com.seunfapps.tests;

import com.seunfapps.algos.examples.MinStack;
import com.seunfapps.algos.examples.QueueUseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.ArrayDeque;
import java.util.Queue;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class QueueTests {

    @Test
    public void shouldReverseQueue(){
        Queue<Integer> queue = new ArrayDeque<>();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        //FIFO
        //queue.remove() = 1. Since 1 is first in
        QueueUseCase test = new QueueUseCase();
        test.reverse(queue);
        //queue is now reversed, first in = 5

        Assertions.assertEquals(queue.remove(), 5);
    }
}
