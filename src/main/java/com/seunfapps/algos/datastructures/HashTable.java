package com.seunfapps.algos.datastructures;

import java.util.LinkedList;

public class HashTable {
    private LinkedList<Entry>[] entries;

    public HashTable(int size){
        entries = new LinkedList[size];
    }

    public void put(int key, String value){
        int index = hash(key);

        if(entries[index] == null )
            entries[index] = new LinkedList<>();

        LinkedList<Entry> bucket = entries[index];
        for(Entry e : bucket){
            //replace if key is existing;
            if(e.key == key){
                e.value = value;
                return;
            }
        }

        entries[index].addLast(new Entry(key, value));

    }

    public String get(int key){
        int index = hash(key);

        if(entries[index] == null)
            return null;

        LinkedList<Entry> bucket = entries[index];

        for(Entry e : bucket){
            if(e.key == key)
                return e.value;
        }

        return null;
    }

    public void remove(int key){
        int index = hash(key);

        if(entries[index] == null)
            throw new IllegalStateException();

        Entry entry;
        for(Entry e : entries[index]){
            if(e.key == key){
                entries[index].remove(e);
                return;
            }
        }

    }

    private int hash(int key){
        return key % entries.length; //result of this would definitely be 0 <= x < entries.length
    }

    private class Entry{
        private int key;
        private String value;

        public Entry(int key, String value){
            this.key = key;
            this.value = value;
        }

        public int getKey() {
            return key;
        }

        public void setKey(int key) {
            this.key = key;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }
}
