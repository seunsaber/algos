package com.seunfapps.algos.datastructures;

import java.util.Arrays;

public class PriorityQueue {
    public int [] items;
    public int count;
    private int front;
    public PriorityQueue(int size){
        items = new int [size];
        count = 0;
        front = 0;
    }

    public void enqueue(int item){
        if(count == items.length)
            throw new IllegalStateException("Array Full");

        if(count == 0){
            items[front] = item;
            count++;
            return;
        }

        for(int i = count - 1; i >= 0; i--){
            if(item >= items[i]){
                items[i + 1] = item;
                count++;
                return;
            }else{
                items[i + 1] = items[i];
            }
        }

       items[front] = item;
        count++;
    }

    public int dequeue(){
        int value = items[front];
        items[front] = 0;
        front++;
        count--;
        return value;
    }

    public int peek(){
        return items[front];
    }

    public boolean isEmpty(){
        return count == 0;
    }

    @Override
    public String toString(){
        return Arrays.toString(items);
    }

}
