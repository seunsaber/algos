package com.seunfapps.algos.examples;

public class BinaryTree {


    /*Given an array of integers nums which is sorted in ascending order,
    and an integer target, write a function to search target in nums.
    If target exists, then return its index. Otherwise, return -1.

    You must write an algorithm with O(log n) runtime complexity.

    Input: nums = [-1,0,3,5,9,12], target = 9
    Output: 4
    Explanation: 9 exists in nums and its index is 4
    */

    public int search(int[] nums, int target) {
        return search(nums, target, Math.abs(nums.length / 2), false);
    }

    //my impl
    private int search(int [] nums, int target, int middleIndex, boolean found){

        if(found)
            return middleIndex;
        if(middleIndex > nums.length - 1)
            return -1;

        if(target < nums[middleIndex]){
            middleIndex = Math.abs(middleIndex / 2);
            return search(nums, target, middleIndex, false);
        } else if(target > nums[middleIndex]){
            middleIndex = middleIndex + Math.abs((nums.length - middleIndex) / 2);
            return search(nums, target, middleIndex, false);
        }else {
            //target found.
            return search(nums, target, middleIndex, true);
        }
    }

    public int search2(int [] nums, int target){
        int left = 0;
        int right = nums.length - 1;

        int middle = (left + right) / 2;
        return search2(nums, target, left, middle, right);
    }

    private int search2(int [] nums, int target, int left, int middle, int right){

        if(left > right)
            return -1;

        if(target < nums[middle])
            right = middle - 1;
        else if(target > nums[middle])
            left = middle + 1;
        else
            return middle;

        middle = (left + right) / 2;
        return search2(nums, target, left, middle, right);

    }

}
