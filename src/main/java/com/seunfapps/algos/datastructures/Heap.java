package com.seunfapps.algos.datastructures;

import jdk.jshell.spi.ExecutionControl;

public class Heap {
    private int [] items;
    private int size;
    public Heap(int size) {
        this.items = new int[size];
    }

    public void insert(int value){

        /* A heap is a type of binary tree that all the children of the root node
        * are less than the root node i.e Min Heap.
        * The opposite where the root node is the max, i.e Max Heap.
        *
        * The heap is filled left to right, level by level.
        *
        * Heap can be stored in an array.
        *
        * leftChildIndex = (2 * parentIndex) + 1
        * rightChildIndex = (2 * parentIndex) + 2
        *
        *
        * parentIndex = (childIndex - 1) / 2
        * */

        if(size == items.length)
            throw new IllegalStateException();

        //since heaps are sequential, we'll always insert at the end.
        items[size++] = value;

        bubbleUp();

    }

    public void remove(){

    }

    private void swap(int first, int second){
        int temp = items[first];
        items[first] = items[second];
        items[second] = temp;
    }

    private int getParent(int index){
        return (index - 1) / 2;
    }

    private void bubbleUp(){
        //if newItem is > parent (the new item's parent) we should bubble it up.
        int index = size - 1; //zero-based index, normal stuff.
        int parentIndex = (index - 1) / 2;
        //while newItem > parent, keep bubbling up.
        //index > 0 because getParent does index - 1
        while (index > 0 && items[index] > items[getParent(index)]){
            swap(index, getParent(index));
            index = getParent(index); //change index after swap
        }

    }
}
