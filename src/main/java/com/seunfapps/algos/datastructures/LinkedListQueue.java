package com.seunfapps.algos.datastructures;

public class LinkedListQueue {
    private LinkedList list;

    public void enqueue(String item){
        list.addLast(item);
    }

    public String dequeue(){
        String top = list.peekFirst();
        list.deleteFirst();
        return top;
    }

    public String peek(){
        return list.peekFirst();
    }

}
