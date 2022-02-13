package com.seunfapps.algos.examples;


import java.util.*;

public class StringManipulation {
    Map<Character, Integer> hashCharTable = new HashMap<>();

    public int [] getNumberOfSentences(String [] words, String [] sentences){
        int [] numberOfSentences = new int [sentences.length];
        populateHashCodes(words);

        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < sentences.length; i++){
            int number = 0;
            String [] sentenceWords = sentences[i].split(" ");
            for(int j = 0; j < sentenceWords.length; j++){
                int hash = getHashForWord(sentenceWords[j]);

                for(int k = 0; k < words.length; k++){
                    if(sentenceWords[j].equals(words[k]))
                        continue;
                    int hashK = getHashForWord(words[k]);
                    if(hash == hashK)
                        number++;
                }
            }
            numberOfSentences[i] = number * 2;
        }

        return numberOfSentences;
    }
    private void populateHashCodes(String [] words){
        int counter = 0;
        for(String word : words){
            for(Character character: word.toCharArray()){
                if(!hashCharTable.containsKey(character)){
                    counter++;
                    hashCharTable.put(character, counter);
                }

            }
        }
    }

    private int getHashForWord(String word){
        int hash = 1;
        for(Character character : word.toCharArray()){
            hash = hash * hashCharTable.get(character);
        }
        return hash;
    }

    public int countVowels(String str){
        Set<Character> vowels = new HashSet<Character>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        int count = 0;
        for(Character ch : str.toLowerCase().toCharArray()){
            if(vowels.contains(ch)){
                count++;
            }
        }
        return count;
    }
}
