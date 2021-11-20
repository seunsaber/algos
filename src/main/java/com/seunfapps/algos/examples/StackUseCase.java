package com.seunfapps.algos.examples;

public class StackUseCase {

    public String reverse(String input){
        if(input == null)
            throw new IllegalArgumentException();

        java.util.Stack<Character> stack = new java.util.Stack<>();

        for(char c : input.toCharArray())
            stack.push(c);

        StringBuffer stringBuffer = new StringBuffer();
        while (!stack.empty())
            stringBuffer.append(stack.pop());

        return stringBuffer.toString();
    }

    public boolean isBalanced(String input){
        //(1 + 2) good
        //(((1) + (2))) fine
        /// (1 + 5 > bad,
        if(input == null)
            throw new IllegalArgumentException();

        java.util.Stack<Character> stack = new java.util.Stack<>();

        for(char c : input.toCharArray() ){
            if(isLeftBracket(c))
                stack.push(c);

            if(isRightBracket(c)){
                if (stack.empty())
                    return false;
               char top =  stack.pop();
               return bracketsMatch(top, c);
            }
        }

        return stack.empty();
    }

    private boolean isLeftBracket(char c){
        return  (c == '(' || c == '<' || c == '[' || c == '{');
    }

    private boolean isRightBracket(char c){
        return (c == ')' || c == '>' || c == ']' || c == ']');
    }

    private boolean bracketsMatch(char left, char right){
        return !((left == '(' && right != ')') ||
                (left == '<' && right != '>') ||
                (left == '{' && right != '}') ||
                (left == '[' && right != ']'));
    }
}
