package com.seunfapps.algos.sorting;

public class BubbleSort {
    public int [] sort(int [] items){
        for(int i = 0; i < items.length; i++){
            for(int j = 1; j < items.length; j++ ){
                if(items[j] < items[j - 1]){
                    int temp = items[j];
                    items[j] = items[j - 1];
                    items[j - 1] = temp;
                }
            }
        }
        return items;
    }
}
