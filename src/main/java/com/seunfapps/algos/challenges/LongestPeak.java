package com.seunfapps.algos.challenges;

import java.util.ArrayList;
import java.util.List;

public class LongestPeak {
    public static void main (String [] args){
        int [] array = new int [] {1, 2, 3, 3, 4, 0, 10, 6, 5, -1, -3, 2, 3};
        int longest = longestPeak(array);
        System.out.println(longest);
    }
    public static int longestPeak(int[] array) {
        // Write your code here.
        if(array == null || array.length == 0)
            return 0;
        if(array.length == 1){
            return 1;
        }

        List<Integer> peaks = new ArrayList<>();

        for(int i = 1; i < array.length - 1; i++){
            if(array[i] > array[i - 1] && array[i] > array[i + 1]){
                peaks.add(i);
            }
        }

        int maxPeak = Integer.MIN_VALUE;
        //[1, 2, 3, 3, 4, 0, 10, 6, 5, -1, -3, 2, 3]
        for(Integer point : peaks){
            int p = point;
            int left = point - 1;
            int right = point + 1;
            int leftCount = 0;
            int rightCount = 0;
            while(left >= 0 && array[point] > array[left]){
                leftCount++;
                left--;
                point--;
            }

            point = p;
            right = point + 1;

            while(right < array.length && array[point] > array[right]){
                rightCount++;
                right++;
                point++;
            }
            int sum = leftCount + rightCount + 1;
            maxPeak = Math.max(maxPeak, sum);
        }

        return maxPeak;
    }
}
