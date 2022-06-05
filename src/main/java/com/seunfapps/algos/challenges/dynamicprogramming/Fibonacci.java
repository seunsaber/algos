package com.seunfapps.algos.challenges.dynamicprogramming;

import org.springframework.util.StopWatch;

public class Fibonacci {

    public static long fib (int number){
        //fib(n) = fib(n-1) + fib(n - 2)
        long [] aux = new long [number];
        aux[0] = 1;
        aux[1] = 1;

        for(int i = 2; i < number; i++){
            aux[i] = aux[i - 1] + aux[i - 2];
        }

        return aux[number - 1];
    }

    public static void main (String [] args){
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        int number = 50;

        long fib = fib(number);

        System.out.println(String.format("Fib: %s is %s, Time taken (dynamic programming) : %s ", number, fib, stopWatch.getTotalTimeSeconds()));

    }
}
