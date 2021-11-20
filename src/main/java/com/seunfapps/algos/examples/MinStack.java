package com.seunfapps.algos.examples;

import com.seunfapps.algos.datastructures.Stack;

public class MinStack{
    private Stack stack;
    private Stack minStack;
    private int min;

    public MinStack(int size){
        stack = new Stack(size);
        minStack = new Stack(size);
    }

    public void push(int item){
        if(stack.isEmpty()){
            stack.push(item);
            minStack.push(item);
        }
        else if(item < minStack.peek()){
            minStack.push(item);
        }
        stack.push(item);
    }

    public void pop(){
        int value = stack.peek();
        if(value == minStack.peek())
            minStack.pop();
        stack.pop();
    }

    public int min(){
        return minStack.peek();
    }
}
