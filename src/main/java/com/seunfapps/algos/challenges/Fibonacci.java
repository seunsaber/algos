package com.seunfapps.algos.challenges;

public class Fibonacci {
    public int fib(int n){
        //1, 1, 2, 3, 5, 8, 13, 21
        if(n <= 2)
            return 1;
        return fib(n-1) + fib(n -2);
    }
}
