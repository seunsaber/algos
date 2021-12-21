package com.seunfapps.algos.challenges;

public class ValidPalindrome {
    /* A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

    Given a string s, return true if it is a palindrome, or false otherwise.*/

    //Approach1
    public boolean isPalindrome(String s){
        s = s.replaceAll("[^a-zA-Z0-9]", "");

        s = s.toLowerCase();

        StringBuilder reversed = new StringBuilder();

        char [] textArr = s.toCharArray();
        for(int i = textArr.length - 1; i >=0; i--)
            reversed.append(textArr[i]);

        return s.equals(reversed.toString());
    }

    //Approach 2 StringBuilder
    public boolean isPalindrome2(String s){
       StringBuilder stringBuilder = new StringBuilder();

        for (Character c : s.toCharArray()) {
            if(Character.isLetterOrDigit(c))
                stringBuilder.append(Character.toLowerCase(c));
        }

        String filtered = stringBuilder.toString();
        String reversed = stringBuilder.reverse().toString();

        return filtered.equals(reversed);
    }

    //Approach 3 : Two Index.
    public boolean isPalindrome3(String s){
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();

        int left = 0;
        int right = s.length() - 1;

        char [] sArr = s.toCharArray();
        while(left <= right){
            if(sArr[left] != sArr[right])
                return false;
            left++;
            right--;
        }
        return true;
    }
}
