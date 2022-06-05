package com.seunfapps.algos.challenges;

import org.springframework.util.StopWatch;

public class Fibonacci {
    public int fib(int n){
        //1, 1, 2, 3, 5, 8, 13, 21
        if(n <= 2)
            return 1;
        return fib(n-1) + fib(n -2);
    }

    public static void main (String [] args){
        Fibonacci fibonacci = new Fibonacci();

        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        int number = 50;
        int fib = fibonacci.fib(number);
        stopWatch.stop();
        System.out.println(String.format("Fib: %s is %s, Time taken (recursion) : %s ", number, fib, stopWatch.getTotalTimeSeconds()));
    }
}
