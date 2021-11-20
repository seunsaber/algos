package com.seunfapps.tests;

import com.seunfapps.algos.datastructures.Stack;
import com.seunfapps.algos.examples.TwoStacks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TwoStacksTests {

    @Test
    public void shouldReturnTopOfStack1(){
        TwoStacks twoStacks = new TwoStacks(5,10);
        twoStacks.push1(85);
        twoStacks.push2(79);
        twoStacks.push2(63);
        twoStacks.push2(55);
        twoStacks.push1(49);
        twoStacks.push1(32);
        twoStacks.push1(19);
        twoStacks.push2(90);
        twoStacks.push2(82);
        twoStacks.push2(3);

        int result = twoStacks.pop1();
        Assertions.assertEquals(result, 19);
    }

    @Test
    public void shouldReturnTopOfStack2(){
        TwoStacks twoStacks = new TwoStacks(10,20);
        twoStacks.push1(85);
        twoStacks.push2(79);
        twoStacks.push2(63);
        twoStacks.push2(55);
        twoStacks.push1(49);
        twoStacks.push1(32);
        twoStacks.push1(19);
        twoStacks.push2(90);
        twoStacks.push2(82);
        twoStacks.push2(3);
        twoStacks.push1(23);
        twoStacks.push1(75);

        int result = twoStacks.pop2();
        Assertions.assertEquals(result, 3);
    }
    @Test
    public void shouldReturnPeek(){
        Stack stack = new Stack(10);
        stack.push(85);
        stack.push(79);
        stack.push(63);
        stack.push(12);
        stack.push(91);
        stack.push(22);

        int result = stack.peek();
        Assertions.assertEquals(result, 22);
    }








}
