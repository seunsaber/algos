package com.seunfapps.tests;

import com.seunfapps.algos.datastructures.Stack;
import com.seunfapps.algos.examples.MinStack;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class MinStackTests {

    @Test
    public void shouldReturnMinimumInStack(){
        MinStack stack = new MinStack(100);
        stack.push(85);
        stack.push(79);
        stack.push(63);
        stack.push(81);
        stack.push(9);
        stack.pop();
        stack.push(23);
        stack.push(91);
        stack.pop();
        stack.push(12);
        stack.push(72);
        stack.pop();
        int minA = stack.min();
        stack.push(35);
        stack.push(16);
        stack.push(66);
        stack.push(15);
        int minB = stack.min();
        stack.push(72);
        stack.push(91);
        stack.push(8);
        stack.push(22);
        stack.push(45);
        int minC = stack.min();
        stack.push(101);
        stack.push(52);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        int minD  = stack.min();
        Assertions.assertEquals(12, minA);
        Assertions.assertEquals(12, minB);
        Assertions.assertEquals(8, minC);
        Assertions.assertEquals(23, minD);
    }
}
