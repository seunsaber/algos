package com.seunfapps.algos.challenges;

public class SearchInSortedArray {
    public int search(int [] nums, int target){
        //find lowest index
        int left = 0;
        int right = nums.length - 1;
        int midIndex = 0;

        while (left < right){
            midIndex = left + (right - left) / 2;
            if(nums[midIndex] > nums[right]){
                left = midIndex + 1;
            } else {
                right = midIndex;
            }
        }

        int lowest = left;
        left = 0;
        right = nums.length - 1;

        if(target >= nums[lowest] && target < nums[right]){
            left = lowest;
        }else{
            right = lowest;
        }

        while (left < right){
            int midPoint = left + (right - left) / 2;
            if(nums[midPoint] == target)
                return midPoint;
            else if(nums[midPoint] < target)
                left = midPoint + 1;
            else
                right = midPoint - 1;
        }
        return -1;
    }
}
