package com.seunfapps.algos.challenges;

public class AngryFrogs {
    /*
    * Given an integer N, return the smallest non-negative number whose individual digits sum upto N.

     There are N block from 0 to N-1. A couple of frogs were sitting together on one block,
     * They had a quarrel and need to jump away from one another. The frogs can only jump to another block
     *  if the height of the other block is greater than equal to the current one.
     * You need to find the longest possible distance that they can possible create between each other,
     * if they also choose to sit on an optimal starting block initially.*/

    public static void main (String [] args){
        //int [] array = new int [] {2, 5, 8, 6};
        int [] array = new int [] {4, 2, 3, 3, 5, 2};
        System.out.println(findLongestDistanceApart(array));
    }

    public static int findLongestDistanceApart(int [] blocks){

        int [] possibleMovesRight = new int [blocks.length];
        possibleMovesRight[blocks.length - 1] = 0;
        int [] possibleMovesLeft = new int [blocks.length];
        possibleMovesLeft[0] = 0;

        for(int i = 0; i < blocks.length - 1; i++){
            int jumps = 0;
            int current = i;
            int next = i + 1;
            while (next <= blocks.length - 1 && blocks[current] <= blocks[next]){
                jumps++;
                current++;
                next++;
            }

            possibleMovesRight[i] = jumps;
        }

        for(int i = blocks.length - 1; i > 0; i--){
            int jumps = 0;
            int current = i;
            int next = i - 1;
            while (next >= 0 && blocks[current] <= blocks[next]){
                jumps++;
                current--;
                next--;
            }

            possibleMovesLeft[i] = jumps;
        }

        int [] sums = new int[blocks.length];
        for(int i = 0; i < blocks.length; i++){
            sums[i] = possibleMovesRight[i] + possibleMovesLeft[i];
        }

        int max = Integer.MIN_VALUE;
        for(int sum: sums){
            max = Math.max(sum, max);
        }

        return max + 1;
    }
}
