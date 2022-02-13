package com.seunfapps.algos.search;

public class LinearSearch {
    public int search(int [] items, int target){
        for(int i = 0; i < items.length; i++){
            if(items[i] == target){
                return i;
            }
        }
        return -1;
    }
}
