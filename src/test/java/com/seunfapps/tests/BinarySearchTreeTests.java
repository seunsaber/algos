package com.seunfapps.tests;

import com.seunfapps.algos.datastructures.BinarySearchTree;
import com.seunfapps.algos.examples.BinaryTree;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BinarySearchTreeTests {

    @Test
    public void shouldInsertBinaryTree(){
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(7);
        tree.insert(4);
        tree.insert(9);
        tree.insert(1);
        tree.insert(8);
        tree.insert(10);

        System.out.println("done");

    }

    @Test
    public void shouldReturnTrueIfFoundInBinaryTree(){
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(7);
        tree.insert(4);
        tree.insert(9);
        tree.insert(1);
        tree.insert(8);
        tree.insert(10);

        boolean isFound = tree.find(8);

        Assertions.assertEquals(true, isFound);
    }

    @Test
    public void shouldReturnFactorial(){
        BinarySearchTree tree = new BinarySearchTree();
        int result = tree.factorialRecursion(4);

        Assertions.assertEquals(24, result);
    }

    @Test
    public void shouldDoPreOrderTraversal(){
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(7);
        tree.insert(4);
        tree.insert(9);
        tree.insert(1);
        tree.insert(8);
        tree.insert(10);

        tree.preOrderTraversal();

    }

    @Test
    public void shouldDoInOrderTraversal(){
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(7);
        tree.insert(4);
        tree.insert(9);
        tree.insert(1);
        tree.insert(8);
        tree.insert(10);

        tree.inOrderTraversal();

    }

    @Test
    public void shouldDoPostOrderTraversal(){
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(7);
        tree.insert(4);
        tree.insert(9);
        tree.insert(1);
        tree.insert(8);
        tree.insert(10);

        tree.postOrderTraversal();

    }

    @Test
    public void shouldReturnHeightOfTree(){
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(7);
        tree.insert(4);
        tree.insert(9);
        tree.insert(1);
        tree.insert(8);
        tree.insert(10);

        int height = tree.height();

        Assertions.assertEquals(2, height);

    }

    @Test
    public void shouldReturnMinValueInTree(){
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(7);
        tree.insert(4);
        tree.insert(9);
        tree.insert(1);
        tree.insert(8);
        tree.insert(10);

        int min = tree.min();

        Assertions.assertEquals(1, min);

    }
    @Test
    public void shouldReturnMinValueInBSTree(){
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(7);
        tree.insert(4);
        tree.insert(9);
        tree.insert(1);
        tree.insert(8);
        tree.insert(10);

        int min = tree.minBST();

        Assertions.assertEquals(1, min);

    }

    @Test
    public void shouldReturnTrueIfTwoTreesAreEqual(){
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(7);
        tree.insert(4);
        tree.insert(9);
        tree.insert(1);
        tree.insert(8);
        tree.insert(10);

        BinarySearchTree tree2 = new BinarySearchTree();
        tree2.insert(7);
        tree2.insert(4);
        tree2.insert(9);
        tree2.insert(1);
        tree2.insert(8);
        tree2.insert(10);

        boolean isEqual = tree.isEqual(tree2);

        Assertions.assertEquals(true, isEqual);

    }

    @Test
    public void shouldReturnIndexOfItemInArray(){
        int [] nums = new int [] {-1,0,3,5,9,12};

        BinaryTree binaryTree = new BinaryTree();

        //int index = binaryTree.search(nums, 3);
        int index = binaryTree.search2(nums, 3);

        Assertions.assertEquals(2, index);
    }
}
