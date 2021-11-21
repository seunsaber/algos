package com.seunfapps.algos.datastructures;

public class StackQueue {
    private Stack stackA;
    private Stack stackB;
    public int count;
    public StackQueue(int size){
        stackA = new Stack(size);
        stackB = new Stack(size);
        count = 0;
    }

    public void enqueue(int item){
       stackA.push(item);
       count++;
    }

    public int dequeue(){
        while (!stackA.isEmpty())
            stackB.push(stackA.pop());

        int value = stackB.pop();

        while (!stackB.isEmpty())
            stackA.push(stackB.pop());

        count--;
        return value;
    }

    public int peek(){
        while (!stackA.isEmpty())
            stackB.push(stackA.pop());

        int value = stackB.peek();

        while (!stackB.isEmpty())
            stackA.push(stackB.pop());

        return value;
    }

    public boolean isEmpty(){
        return count == 0;
    }

}
