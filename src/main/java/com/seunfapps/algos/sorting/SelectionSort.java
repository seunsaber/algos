package com.seunfapps.algos.sorting;

public class SelectionSort {
    //find lowest and swap with index
    public int [] sort(int [] items){
        for(int i = 0; i < items.length; i++){
            int minIndex = i;
            for(int j = i; j < items.length; j++){
                if(items[j] < items[minIndex]){
                    minIndex = j;
                }
            }
            int temp;
            temp =  items[i];
            items[i] = items[minIndex];
            items[minIndex] = temp;
        }
        return items;
    }
}
