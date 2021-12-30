package com.seunfapps.algos.challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWords2 {
    /*Given a character array s, reverse the order of the words.

    A word is defined as a sequence of non-space characters. The words in s will be separated by a single space.

    Your code must solve the problem in-place, i.e. without allocating extra space.

    Input: s = ["t","h","e"," ","s","k","y"," ","i","s"," ","b","l","u","e"]
    Output: ["b","l","u","e"," ","i","s"," ","s","k","y"," ","t","h","e"]

    */


    public char [] reverseWords(char [] s) {
        //reverse entire array
        int left = 0;
        int right = s.length - 1;

        reverseString(left, right, s);

        left = right = 0;
        for(int i = 0; i < s.length - 1; i++){
            if(Character.isSpaceChar(s[i + 1])){
                //reverse
                reverseString(left, right, s);
                left = right  = i + 2;
                i = i + 1;
            }else if(i == s.length - 2){
                right = s.length - 1;
                reverseString(left, right, s);
                i = i + 1;
            }
            else
                right = right + 1;

        }

        return s;
    }

    private void reverseString(int left, int right, char [] s){
        while (left <= right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }

}
