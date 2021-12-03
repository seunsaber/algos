package com.seunfapps.algos.datastructures;

public class BinarySearchTree {
    private Node root;
    private int size;

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void insert(int value){
        Node node = new Node(value);

        if(root == null){
            root = node;
            return;
        }

        Node current = root;

        while (true){
            if(value < current.value){
                if(current.left == null){
                    current.left = node;
                    break;
                }
                current = current.left;
            } else {
                if(current.right == null){
                    current.right = node;
                    break;
                }
                current = current.right;
            }
        }
    }

    public boolean find(int value){
       Node current = root;

       while(current != null){
           if(value < current.value)
               current = current.left;
            else if(value > current.value)
               current = current.right;
            else
               return true;
       }

       return false;
    }

    public int factorial(int number){
        int factorial = 1;
        while (number >= 1){
            factorial = factorial * number;
            number--;
        }
        return factorial;
    }

    public int factorialRecursion(int number){
        if(number == 0)
            return 1;
        return number * factorialRecursion(number - 1 );
    }

    public void inOrderTraversal(){
       inOrderTraversal(root);
    }

    private void inOrderTraversal(Node node){
        //traverse left
        //root first
        //traverse right

        if(node == null)
            return;

        inOrderTraversal(node.left);
        System.out.println(node.value);
        inOrderTraversal(node.right);

    }

    public void postOrderTraversal(){
        postOrderTraversal(root);
    }

    private void postOrderTraversal(Node node){
        //traverse left
        //traverse right
        //root first

        if(node == null)
            return;

        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
        System.out.println(node.value);

    }

    public void preOrderTraversal(){
        preOrderTraversal(root);
    }

    private void preOrderTraversal(Node node){
        //root first
        //traverse left
        //traverse right

        if(node == null)
            return;

        System.out.println(node.value);
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);

    }

    public int height(){
        return height(root);
    }

    private int height(Node node){
        if(node == null)
            return -1;

        if(node.left == null && node.right == null)
            return 0;

        return 1 + Math.max(height(node.left), height(node.right));
    }

    public int min(){
        return min(root);
    }

    //O(n) for binary tree
    private int min(Node node){
        if(node == null)
            return Integer.MAX_VALUE;
        if(node.left == null && node.right == null)
            return node.value;

        int left = min(node.left);
        int right = min(node.right);

        return Math.min(Math.min(left, right), node.value);
    }

    public int minBST(){
        return minBST(root);
    }

    //O(logn) for BST, the min must be the left most node.
    //so we are only traversing the left side, splitting out search in half.
    private int minBST(Node root){
        Node current = root;
        Node last = current;
        while(current != null){
            last = current;
            current = current.left;
        }
        return last.value;
    }



    public boolean isEqual(BinarySearchTree otherTree){
        return isEqual(root, otherTree.root);
    }

    private boolean isEqual(Node first, Node second){
        if(first == null && second == null)
            return true;
        if((first == null && second != null) || (first != null && second == null))
            return false;
        if(first.value == second.value){
            if(isEqual(first.left, second.left) && isEqual(first.right, second.right))
                return true;
        }
        return false;
    }

    public boolean isBST(){
        return isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean isBST(Node node, int min, int max){
        if(root == null)
            return true;
        if(node.value < min || node.value > max)
            return false;

        return isBST(node.left, min, node.value - 1 )
         && isBST(node.right, node.value + 1, max);
    }

    public void getNodesAtKDistance(int k){

    }

    private void getNodesAtKDistance(Node node, int k){
        Node current = node;
        while (k >= 1){
            current = current.left;
            k--;
        }
    }

    public class Node{
        private int value;
        private int index;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public int getIndex() {
            return index;
        }

        public void setIndex(int index) {
            this.index = index;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }

        @Override
        public String toString(){
            return "Node:"+value;
        }
    }
}

