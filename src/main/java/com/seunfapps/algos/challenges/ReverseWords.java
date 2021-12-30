package com.seunfapps.algos.challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWords {
    /*
    * Given an input string s, reverse the order of the words.

    A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.

    Return a string of the words in reverse order concatenated by a single space.

    Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.*/
    public String reverseWords(String s) {
        String [] sArray = s.split(" ");
        List<String> list = new ArrayList<>();
        for(String word : sArray){
            if(!word.equals(""))
                list.add(word);
        }

        String [] output = list.toArray(new String[list.size()]);

        int left = 0;
        int right = output.length - 1;

        while (left <= right){
            String temp = output[left];
            output[left] = output[right];
            output[right] = temp;

            left = left + 1;
            right =  right - 1;
        }

        return String.join(" ", output);
    }

    public String reverseWords2(String s){
        //remove leading spaces
        s = s.trim();
        List<String> wordList = Arrays.asList(s.split(" "));
        Collections.reverse(wordList);
        return String.join(" ", wordList);
    }
}
