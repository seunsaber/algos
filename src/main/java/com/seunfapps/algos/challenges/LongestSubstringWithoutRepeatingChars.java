package com.seunfapps.algos.challenges;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingChars {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int left = 0;
        int right = 0;
        Set<Character> characters = new HashSet<>();

        while(right < s.length()){
            char r = s.charAt(right);
            char l = s.charAt(left);
            if(characters.contains(s.charAt(right))){
                characters.remove(s.charAt(left));
                left++;
            }else{
                characters.add(s.charAt(right));
                maxLength = Math.max(maxLength, right - left + 1);
                right++;
            }
        }
        return maxLength;
    }
}
