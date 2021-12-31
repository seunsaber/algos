package com.seunfapps.algos.challenges;

import java.util.Map;
import java.util.Stack;

public class ValidParenthesis {
    /*Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

    An input string is valid if:

    Open brackets must be closed by the same type of brackets.
    Open brackets must be closed in the correct order.


    Example 1:

    Input: s = "()"
    Output: true*/


    public boolean isValid(String s){
        char [] input = s.toCharArray();
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i < input.length; i++){
            if(map.containsKey(input[i])){
                stack.push(input[i]);
            }else{
                if(stack.empty())
                    return false;
                char top = stack.pop();
                if(map.get(top) != input[i])
                    return false;
            }
        }

        return stack.empty();

    }

   private Map<Character, Character> map = Map.of('(', ')', '{', '}', '[', ']');



}
