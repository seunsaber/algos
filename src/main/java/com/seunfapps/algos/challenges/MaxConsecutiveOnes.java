package com.seunfapps.algos.challenges;

public class MaxConsecutiveOnes {

    public int findMaxConsecutiveOnes(int [] nums){
        int result = 0;
        int max = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                max++;
            } else{
                result = Math.max(result, max);
                max = 0;
            }
        }
        return Math.max(result, max);
    }
}
