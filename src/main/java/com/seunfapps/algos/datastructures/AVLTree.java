package com.seunfapps.algos.datastructures;

public class AVLTree {

    private AVLNode root;

    public void insert (int value){
       root = insert(root, value);

    }

    private AVLNode insert(AVLNode root, int value){
        if(root == null)
            return new AVLNode(value);

        if(value < root.value)
            root.leftChild = insert(root.leftChild, value);
        else if(value > root.value)
            root.rightChild = insert(root.rightChild, value);

        setHeight(root);


        root = balance(root);

        return root;
    }

    private int height(AVLNode node){
        return node == null ? -1 : node.height;
    }

    private boolean isLeftHeavy(AVLNode node){
        return balanceFactor(node) > 1;
    }

    private boolean isRightHeavy(AVLNode node){
        return balanceFactor(node) < -1;
    }

    private int balanceFactor(AVLNode node){
        //A tree is balanced if height(left) - height(right) <= 1
        //A tree is not balanced if  height(left) - height(right) > 1
        return height(node.leftChild) - height(node.rightChild);
    }

    private AVLNode balance(AVLNode root){
        if(isLeftHeavy(root)){
            if(balanceFactor(root.leftChild) < 0){
                //          20
                //      10      30
                //  5
                //      7
                //LR
                //left rotate
                //this scenario, you need to left rotate first, then right rotate.
                root.leftChild = rotateLeft(root.leftChild);
            }
            //right rotate
            //this is the normal stuff you do if node is left heavy.
            return rotateRight(root);
        }else if(isRightHeavy(root)){
            if(balanceFactor(root.leftChild) < 0){
                //          20
                //      10      30
                //          15
                //      12
                //RL
                //right rotate
                //this scenario, you need to right rotate first, then left rotate.
                root.rightChild = rotateRight(root.rightChild);
            }
            //left rotate
            //this is the normal stuff you do if node is right heavy.
            return rotateLeft(root);
        }

        //if you are here, the tree is balanced
        return root;
    }

    private AVLNode rotateLeft(AVLNode root){
        AVLNode newRoot = root.rightChild;
        root.rightChild = newRoot.leftChild;
        newRoot.leftChild = root;

        //update new height
        setHeight(root);
        setHeight(newRoot);

        return root;

    }

    private AVLNode rotateRight(AVLNode root){
        AVLNode newRoot = root.leftChild;
        root.leftChild = newRoot.rightChild;
        newRoot.rightChild = root;

        //update new height
        setHeight(root);
        setHeight(newRoot);

        return root;

    }

    private void setHeight(AVLNode node){
        node.height = Math.max(height(node.leftChild), height(node.rightChild)) + 1;
    }
    private class AVLNode{
        private int value;
        private int height;
        private AVLNode leftChild;
        private AVLNode rightChild;

        public AVLNode(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public AVLNode getLeftChild() {
            return leftChild;
        }

        public void setLeftChild(AVLNode leftChild) {
            this.leftChild = leftChild;
        }

        public AVLNode getRightChild() {
            return rightChild;
        }

        public void setRightChild(AVLNode rightChild) {
            this.rightChild = rightChild;
        }

        public String toString(){
            return "Value="+value;
        }
    }
}


