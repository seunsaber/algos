package com.seunfapps.tests;

import com.seunfapps.algos.datastructures.AVLTree;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class AVLTreeTests {

    @Test
    public void shouldInsertAVLTree(){
        AVLTree tree = new AVLTree();
        tree.insert(7);
        tree.insert(4);
        tree.insert(9);
        tree.insert(1);
        tree.insert(8);
        tree.insert(10);

        System.out.println("done");

    }

}
