package com.seunfapps.algos.challenges;

import java.util.HashMap;

public class TwoSum {
    /*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

    You may assume that each input would have exactly one solution, and you may not use the same element twice.

     You can return the answer in any order.*/

    public int [] twoSum (int [] numbers, int target){
        HashMap<Integer, Integer> values = new HashMap<>();

        int [] result = new int [2];

        for(int i = 0; i < numbers.length; i++){
            int x = target - numbers[i];
            if (values.containsKey(x)){
                int index = values.get(x);
                if(index == i)
                    continue;
                result[0] = i;
                result[1] = index;
                return result;
            }
            values.put(numbers[i], i);

        }

        return result;
    }
}
