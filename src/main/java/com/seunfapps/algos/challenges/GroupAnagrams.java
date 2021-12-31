package com.seunfapps.algos.challenges;

import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {

        /*
        * Given an array of strings strs, group the anagrams together. You can return the answer in any order.

        An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.



        Example 1:

        Input: strs = ["eat","tea","tan","ate","nat","bat"]
        Output: [["bat"],["nat","tan"],["ate","eat","tea"]]*/

        Map<String, List<String>> map = new HashMap<>();

        for(String str : strs){
            char [] strChars = str.toCharArray();
            Arrays.sort(strChars);

            String key = String.valueOf(strChars);
            List<String> strings;

            if(!map.containsKey(key))
                strings = new ArrayList<>();
            else
                strings = map.get(key);

            strings.add(str);
            map.put(key, strings);

        }

        return new ArrayList<>(map.values());
    }
}
