package com.seunfapps.algos.search;

public class BinarySearch {
    public int search(int [] items, int target){
        int left = 0;
        int right = items.length - 1;

        while (left <= right){
            int middle = (left + right) / 2;
            if(items[middle] < target){
                left = middle + 1;
            }else if(items[middle] > target){
                right = middle - 1;
            }else{
                return middle;
            }
        }
        return -1;
    }

    public int recursiveBinarySearch(int [] items, int target){
        return recursiveBinarySearch(items, target, 0, items.length - 1);
    }

    private int recursiveBinarySearch(int [] items, int target, int left, int right){

        if(right < left)
            return -1;

        int middle = (left + right) / 2;

        if(items[middle] == target)
            return middle;

        if(target < items[middle]){
            return recursiveBinarySearch(items, target, left, middle - 1);
        }else {
            return recursiveBinarySearch(items, target, middle + 1, right);
        }
    }
}
