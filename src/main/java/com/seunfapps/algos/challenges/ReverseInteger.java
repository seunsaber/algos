package com.seunfapps.algos.challenges;

public class ReverseInteger {

    public int reverseInt(int x){
        int reversed = 0;
        int rem;
        int prev;
        while (x != 0){
            rem = x % 10;
            reversed = reversed * 10 + rem;

            if(reversed - rem / 10 != reversed)
                return 0;
        }
        return reversed;
    }
}
