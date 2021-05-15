package com.seunfapps.algos.datastructures;

public class Array {
    private int [] items;
    private int count; //keeps track of index that actually have values set.

    public Array(int length){
        items = new int [length];
    }
    public void insert(int value){
        items[count] = value;
        count++;
    }

    public void print(){
        for(int i = 0; i < count; i++)
            System.out.println(items[i]);
    }
}
