package com.seunfapps.algos.examples;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashTableExample {


    public Character getNonRepeating(String input){
        //a green apple
        //return the first non -repeating character
        Map<Character, Integer> hashMap = new HashMap<Character, Integer>();
        char [] array = input.toCharArray();

        for(char c : array){
            int count = hashMap.containsKey(c) ? hashMap.get(c) : 0;
            hashMap.put(c, count + 1);
        }

        for(char c : array){
            if(hashMap.get(c) == 1)
                return c;
        }

        return Character.MIN_VALUE;
    }

    public Character getRepeating(String input){
        //a green apple
        Set<Character> set = new HashSet<>();
        char [] array = input.toCharArray();

        for(char c : array){
            if(set.contains(c))
                return c;
            set.add(c);
        }

        return Character.MIN_VALUE;
    }

    public int findMostRepeated(int [] array){
        Map<Integer, Integer> map = new HashMap<>();

        for(int i : array){
            int count = map.containsKey(i) ? map.get(i) : 0;
            map.put(i, ++count);
        }

        int maxItem = Integer.MIN_VALUE;
        int maxValue = Integer.MIN_VALUE;
        for(int i : array){
            if(map.get(i) > maxValue)
                maxItem = i;
                maxValue = map.get(i);
        }

        return maxItem;
    }

    public int findMostRepeated2(int [] array){
        Map<Integer, Integer> map = new HashMap<>();

        int maxItem = Integer.MIN_VALUE;
        int maxValue = Integer.MIN_VALUE;
        for(int i : array){
            int count = map.containsKey(i) ? map.get(i) : 0;
            map.put(i, ++count);

            if(count > maxValue){
                maxItem = i;
                maxValue = count;
            }
        }

        return maxItem;
    }

    public int findNumberOfUniquePairsWithDifferenceK(int [] array, int k){

        int count = 0;
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++){
                if(array[i] - array[j] == k){
                    //found pair.
                    count = count + 1;
                }
            }
        } //O(n^2)
        return count;
    }

    public int findNumberOfUniquePairsWithDifferenceKOptimized(int [] array, int k){

        Set<Integer> set = new HashSet<>();
        for(int i : array)
            set.add(i);

        int count = 0;
        for(int i : array){
            if(set.contains(i + k))
                count++;
            if(set.contains(i - k))
                count++;
            set.remove(i);
        }
        return count;
    }
}
