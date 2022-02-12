package com.seunfapps.tests;

import com.seunfapps.algos.datastructures.Heap;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class HeapTests {

    @Test
    public void shouldInsertIntoHeap(){
        Heap heap = new Heap(10);
//        heap.insert(7);
//        heap.insert(4);
//        heap.insert(9);
//        heap.insert(1);
//        heap.insert(8);
//        heap.insert(10);

        heap.insert(10);
        heap.insert(5);
        heap.insert(17);
        heap.insert(4);
        heap.insert(22);

        System.out.println("done");

    }

}
