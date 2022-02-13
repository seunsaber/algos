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
        if(str == null)
            return 0;

        Set<Character> vowels = new HashSet<Character>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        int count = 0;
        for(Character ch : str.toLowerCase().toCharArray()){
            if(vowels.contains(ch)){
                count++;
            }
        }
        return count;
    }

    public String reverse(String str){
        if(str == null)
            return "";

        StringBuilder builder = new StringBuilder();
        for(int i = str.length() - 1; i >= 0; i--){
            builder.append(str.charAt(i));
        }

        return builder.toString();
    }

    public String reverseWords1(String sentence){
        if(sentence == null)
            return "";

        String [] words = sentence.trim().split(" ");
        StringBuilder builder = new StringBuilder();

        for(int i = words.length - 1; i >= 0; i--){
            builder.append(words[i] +" ");
        }

        return builder.toString().trim();
    }

    public String reverseWords2(String sentence){
        if(sentence == null)
            return "";

        String [] words = sentence.trim().split(" ");
        Collections.reverse(Arrays.asList(words));
        return String.join(" ", words);
    }

    public boolean rotate(String str1, String str2){
        //Rotate chars, I.E move last character to front of string
        //ABCD -> DABC -> CDAB -> BCDA -> ABCD
        //to know if two strings are rotations of each other

        if(str1 ==  null || str2 == null){
            return false;
        }

        String concat = str1 + str1;
        return concat.contains(str2);

    }

    public String removeDuplicates(String input){
        Set<Character> inputSet = new HashSet<Character>();
        StringBuilder output = new StringBuilder();

        for(Character c : input.toCharArray()){
            if(!inputSet.contains(c)){
                inputSet.add(c);
                output.append(c);
            }
        }

        return output.toString();
    }

    public char getMostFrequentCharMap(String word){
        if(word == null || word.isEmpty())
            throw new IllegalArgumentException();

        Map<Character, Integer> frequencies = new HashMap<>();

        for(Character c : word.toCharArray()){
            int count = frequencies.containsKey(c) ? frequencies.get(c) : 0;
            frequencies.put(c, count + 1);
        }

        int max = 0;
        Character result = ' ';
        for(Map.Entry<Character, Integer> entry : frequencies.entrySet()){
            if(entry.getValue() > max){
                max = entry.getValue();
                result = entry.getKey();
            }
        }

        return result;
    }

    public char getMostFrequentCharASCIIArray(String word){
        if(word == null || word.isEmpty())
            throw new IllegalArgumentException();

        //ascii has 256 possible
        final int ASCII_SIZE = 256;
        int [] frequecies = new int [ASCII_SIZE];

        for(Character c : word.toCharArray()){
            frequecies[c]++;
        }

        int max = 0;
        char result = ' ';
        for(int i = 0; i < frequecies.length; i++){
            if(frequecies[i] > max){
                max = frequecies[i];
                result = (char) i;
            }
        }

        return result;
    }

    public boolean areAnagrams1(String first, String second){
        if(first == null || second == null || first.length() != second.length())
            return false;

        char [] array1 = first.toCharArray(); //O(n)
        char [] array2 = second.toCharArray();

        Arrays.sort(array1); //Arrays.sort uses QuickSort : O(n logn)
        Arrays.sort(array2);//Arrays.sort uses QuickSort : O(n logn)

        return Arrays.equals(array1, array2); //O(n)

        //so overall time complaxity is O(n logn)
    }

    public boolean areAnagrams2(String first, String second){
        //histogramming using array
        final int ALPHABETS = 26;
        int [] frequencies = new int [ALPHABETS];

        char [] firstArray = first.toLowerCase().toCharArray();
        for(int i = 0; i < firstArray.length; i++){
            frequencies[firstArray[i] - 'a']++;
        }

        char [] secondArray = second.toLowerCase().toCharArray();
        for(int i = 0; i < secondArray.length; i++){
            if(frequencies[secondArray[i] - 'a'] == 0)
                return false;
            frequencies[secondArray[i] - 'a']--;
        }

        return true;

        //O(n) this is faster than the other one.

    }

    public boolean areAnagrams3(String first, String second){
        //histogramming using map.
        Map<Character, Integer> map = new HashMap<>();

        char [] firstArray = first.toLowerCase().toCharArray();
        for(int i = 0; i < firstArray.length; i++){
            int count = map.containsKey(firstArray[i]) ? map.get(firstArray[i]) : 0;
            map.put(firstArray[i], count + 1 );
        }

        char [] secondArray = second.toLowerCase().toCharArray();
        for(int i = 0; i < secondArray.length; i++){
           if(!map.containsKey(secondArray[i]))
               return false;
           int count = map.get(secondArray[i]);
           if(count == 0)
               return false;
           map.put(secondArray[i], count - 1);
        }

        return true;

        //this is also O(n)

    }
}
