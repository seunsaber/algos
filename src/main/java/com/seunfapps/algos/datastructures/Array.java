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

    public int max(){
        int max = 0;
        for(int i = 0; i < count; i++){
            if(items[i] > max)
                max = items[i];
        }
        return max;
    }

    public Array intersect(Array array2){
        Array result = new Array(array2.getCount());

        for(int i = 0; i < count; i++){
            if(array2.indexOf(items[i]) != -1)
                result.insert(items[i]);
        }

        return result;
    }

    public void print(){
        System.out.print("[");
        for(int i = 0; i < count; i++)
            System.out.print(items[i]+ " ");
        System.out.print("]");
    }
}
