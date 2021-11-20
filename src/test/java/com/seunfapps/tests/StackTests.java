package com.seunfapps.tests;

import com.seunfapps.algos.datastructures.Stack;
import com.seunfapps.algos.examples.StackUseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class StackTests {

    @Test
    public void shouldReturnTopOfStack(){
        Stack stack = new Stack(10);
        stack.push(85);
        stack.push(79);
        stack.push(63);
        int result = stack.pop();
        Assertions.assertEquals(result, 63);
    }

    @Test
    public void shouldReturnTopOfStack2(){
        Stack stack = new Stack(10);
        stack.push(85);
        stack.push(79);
        stack.push(63);
        stack.push(12);
        stack.push(91);
        stack.push(22);
        stack.pop();
        stack.pop();
        int result = stack.pop();
        Assertions.assertEquals(result, 12);
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
