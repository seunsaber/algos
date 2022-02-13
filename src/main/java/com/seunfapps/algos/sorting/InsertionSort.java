package com.seunfapps.algos.sorting;

public class InsertionSort {
    //think of this as cards served to you in a card game.
    //as you get the card, to insert it into its correct position
    //by shifting cards that are greater to the right
    public int [] sort(int [] items){
        //starting from 1 because we can move 0 to the right if need be.
        for(int i = 1; i < items.length; i++){
            int current = items[i];

            int j = i - 1;

            while(j >= 0 && items[j] > current){
                //if previous item is larger than current, shift right
                items[j + 1] = items[j];
                items[j] = current;
                j--;
            }
        }

        return items;
    }
}
