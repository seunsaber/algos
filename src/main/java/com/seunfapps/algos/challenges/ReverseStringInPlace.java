package com.seunfapps.algos.challenges;

public class ReverseStringInPlace {
    public void reverseStringInPlace(char [] s){
        /*Write a function that reverses a string. The input string is given as an array of characters s.

        You must do this by modifying the input array in-place with O(1) extra memory.*/

        int start = 0;
        int end = s.length - 1;

        while(start <= end){
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start = start + 1;
            end = end - 1;
        }
    }
}
