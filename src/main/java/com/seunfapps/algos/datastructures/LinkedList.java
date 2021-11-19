package com.seunfapps.algos.datastructures;

public class LinkedList {
    private Node first;
    private Node last;
    private int size;

    public Node getFirst() {
        return first;
    }

    public void setFirst(Node first) {
        this.first = first;
    }

    public Node getLast() {
        return last;
    }

    public void setLast(Node last) {
        this.last = last;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void addFirst(String value){
        Node node = new Node(value);
        if(first == null)//empty list
            first = last = node;
        else{
            node.next = first;
            first = node;
        }
        size++;
    }
    public void addLast(String value){
        Node node = new Node(value);
        if(first == null)//empty list
            first = last = node;
        else{
            last.next = node;
            last = node;
        }
        size++;
    }
    public void deleteFirst(){
        //[]
        //if(isEmpty) throw new NoSuchElementException

        //[5]
        if(first == last){
            first = null;
            last = null;
            size--;
            return;
        }
        //5->6->7
        Node temp = first.next;
        first.next = null;
        first = temp;

        size--;
    }
    public void deleteLast(){

        //[]
        //if(isEmpty) throw new NoSuchElementException

        //[5]
        if(first == last){
            first = null;
            last = null;
            size--;
            return;
        }

        Node current = first;
        Node previous = null;
        while (current.next != null){
            previous = current;
            current = current.next;
        }

        previous.next = null;
        last = previous;

        size--;
    }
    public boolean contains (String value){
        Node current = first;
        while (current != null){
            if(current.value == value)
                return true;
            current = current.next;
        }
        return false;
    }

    public int indexOf(String value){
        int index = 0;
        Node current = first;

        while (current != null){
            if(current.value == value)
                return index;
            current = current.next;
            index++;
        }
        return -1;
    }

    public String [] toArray(){
        String [] array = new String [size];
        int index = 0;
        Node current = first;
        while (current != null){
            array[index] = current.value;
            current = current.next;
            index++;
        }
        return array;
    }

    public void reverse(){
        Node current = first.next;
        Node prev = first;

        while (current != null){
           Node next = current.next;

           current.next = prev;

           prev = current;
           current = next;
        }

        last = first;
        first = prev;
    }

    public String getKthFromTheEndUsingSize(int k){
        int positionFromTheFront = (size - k) + 1;
        int counter = 1;
        Node current = first;
        Node kth = first;
        while (counter <= positionFromTheFront){
            if(counter == positionFromTheFront)
                kth = current;
            current = current.next;
            counter++;
        }
        return kth.value;
    }

    public String getKthFromTheEndUsingCounter(int k){
        Node current = first;
        Node kth = first;
        int counter = 1;
        while (current != null){
            current = current.next;
            if(counter > k)
                kth = kth.next;
            counter++;
        }
        return kth.value;
    }

    public String findMiddle(){
        //assume we don't know the size
        //we make use of 2 pointers, a fast pointer and a slow pointer;

        Node slow = first;
        Node fast = first;

        /* Odd number of nodes
        * Number of nodes | middle node
        *               1 | 1
        *               3 | 2
        *               5 | 3
        *               7 | 4
        *               9 | 5
        * */

        /* Even number of nodes
         * Number of nodes | middle node
         *               2 | 1,1
         *               4 | 2,3
         *               6 | 3,4
         *               8 | 4,5
         *              10 | 5,6
         * */

        //see pattern.
        //take one step of slow, two steps of fast.

        while (fast != last && fast.next != last){
            slow = slow.next;
            fast = fast.next.next;
        }

        if(fast == last)//odd 1 -> 3 -> 5
            return slow.value;

        return slow.value +","+slow.next.value;
    }

    public boolean hasLoop(){
        //1 -> 2 -> 3 -> 4 -> 5
        //          ^- <- - <-|
        //loop: 5 points back to 3.

        Node slow = first;
        Node fast = first;

        if(fast != last && fast.next != last){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast)
                return true;
        }
        return false;
    }
    public class Node{
        private String value;
        private int index;
        private Node next;

        public Node(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public int getIndex() {
            return index;
        }

        public void setIndex(int index) {
            this.index = index;
        }
    }
}

