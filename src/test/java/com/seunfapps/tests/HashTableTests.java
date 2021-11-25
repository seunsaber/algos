package com.seunfapps.tests;

import com.seunfapps.algos.datastructures.HashTable;
import com.seunfapps.algos.examples.HashTableExample;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class HashTableTests {

    @Test
    public void shouldReturnFirstNonRepetitiveCharacter(){

        HashTableExample hash = new HashTableExample();

        char result = hash.getNonRepeating("a green apple");

        Assertions.assertEquals('g', result );
    }

    @Test
    public void shouldInsert(){
        HashTable hashTable = new HashTable(5);
        hashTable.put(6, "Seun"); //this should insert at index 1; because 6 % 5 == 1
        hashTable.put(8, "Fapps"); //index 3
        hashTable.put(11, "Emma"); //inedx 1, should insert second item at list [1]

        Assertions.assertEquals("Fapps", hashTable.get(8) );
    }

    @Test
    public void shouldReturnMostRepeated(){
        int [] array = new int [] {1, 2, 2, 2, 2, 3, 3, 3, 4, 4};

        HashTableExample hashTableExample = new HashTableExample();

        int result = hashTableExample.findMostRepeated2(array);

        Assertions.assertEquals(2, result);
    }

    @Test
    public void shouldReturnNumberOfPairsWithDifferenceK(){
        int [] array = new int [] {1, 7, 5, 9, 2, 12, 3};

        HashTableExample hashTableExample = new HashTableExample();

        int result = hashTableExample.findNumberOfUniquePairsWithDifferenceK(array, 2);

        Assertions.assertEquals(4, result);
    }

}
