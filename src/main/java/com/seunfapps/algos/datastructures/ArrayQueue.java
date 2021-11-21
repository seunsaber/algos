package com.seunfapps.algos.datastructures;

public class ArrayQueue{
    private int [] array;
    private int front;
    private int back;
    public int count;

    public ArrayQueue(int size){
        array = new int[size];
        front = 0;
        back = 0;
        count = 0;
    }

    public void enqueue(int item){
        /*
        * Circular array, where the next item for the last item is the first item
        * This would prevent an ArrayOutOfBound Exception
        * Eg [2,9,1,7],  arr[3] = 7, arr[4] would throw ArrayIndexOutOfBound normally,
        * but with Circular array, arr[4] = 2.
        * 0|2
        * 1|9
        * 2|1
        * 3|7
        * 4|2
        * 5|9
        * 6|1
        * 7|7
        * 8|2 etc
        * index % array.length
        * */

        array[back % array.length] = item;
        back++;

        if(count < array.length)
            count++;
    }

    public int dequeue(){
        int value = array[front];
        front++;
        count--;
        return value;
    }

    public int peek(){
        return array[front];
    }

    public boolean isEmpty(){
        return count == 0;
    }
}
