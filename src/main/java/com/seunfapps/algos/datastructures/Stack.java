package com.seunfapps.algos.datastructures;

public class Stack {
    private int [] items;
    private int count;

    public Stack(int size){
        items = new int[size];
        count = 0;
    }
    public void push(int item){
        if(count == items.length)
            throw new StackOverflowError();

        items[count] = item;
        count++;
    }

    public int pop(){
        if(isEmpty())
            throw new IllegalStateException();

        int item = items[count - 1];
        count--;
        return item;

    }
    public int peek(){
        if(isEmpty())
            throw new IllegalStateException();
        return items[count - 1];
    }

    public boolean isEmpty(){
        return count == 0;
    }
}
