package com.seunfapps.algos.datastructures;

public class Array {
    private int [] items;
    private int count; //keeps track of index that actually have values set.
    public int getCount() {
        return count;
    }

    public Array(int length){
        items = new int [length];
    }
    public void insert(int value){
        items[count] = value;
        count++;
    }

    public void removeAt(int index){
        if(index < 0 || index >= count)
            throw new IllegalArgumentException();

        for (int i = index; i < count; i++){
            items[i] = items[i+1];
        }
        count--;
    }

    public int indexOf(int item){
        for(int i = 0; i < count; i++){
            if(items[i] == item)
                return i;
        }
        return -1;
    }
    public void print(){
        System.out.print("[");
        for(int i = 0; i < count; i++)
            System.out.print(items[i]+ " ");
        System.out.print("]");
    }
}
