package com.seunfapps.tests;

import com.seunfapps.algos.datastructures.Graph;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class GraphTests {

    @Test
    public void shouldTest(){
        Graph graph = new Graph();
        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("C");
        graph.addNode("D");

        graph.addEdge("A", "B");
        graph.addEdge("A", "D");
        graph.addEdge("B", "C");
        graph.addEdge("C", "A");
        graph.addEdge("C", "D");
        graph.addEdge("D", "B");

        graph.removeNode("B");

        graph.print();

    }

    @Test
    public void shouldTestTraversal(){
        Graph graph = new Graph();
        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("C");
        graph.addNode("D");
        graph.addNode("E");

        graph.addEdge("A", "B");
        graph.addEdge("A", "E");
        graph.addEdge("B", "E");
        graph.addEdge("C", "A");
        graph.addEdge("C", "B");
        graph.addEdge("C", "D");
        graph.addEdge("D", "E");

        graph.dfsTraversalRecursion("C");
        System.out.println();
        graph.dfsTraversalIteration("C");
        System.out.println();
        graph.bfsTraversal("C");

        //graph.print();

    }

    @Test
    public void shouldTopicalSorting(){
        Graph graph = new Graph();
        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("P");
        graph.addNode("X");

        graph.addEdge("X", "A");
        graph.addEdge("X", "B");
        graph.addEdge("A", "P");
        graph.addEdge("B", "P");

        graph.topologicalSorting("X");
    }

    @Test
    public void shouldDetectCycle(){
        Graph graph = new Graph();
        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("C");
        graph.addNode("D");
        graph.addNode("P");
        graph.addNode("Q");
        graph.addNode("S");
        graph.addNode("T");
        graph.addNode("X");
        graph.addNode("Y");
        graph.addNode("Z");

        graph.addEdge("X", "Y");
        graph.addEdge("Y", "T");
        graph.addEdge("Y", "Z");
        graph.addEdge("P", "A");
        graph.addEdge("P", "B");
        graph.addEdge("P", "Q");
        graph.addEdge("Q", "Y");
        graph.addEdge("Z", "Q");
        graph.addEdge("Z", "S");
        graph.addEdge("A", "S");
        graph.addEdge("S", "C");
        graph.addEdge("S", "D");
        graph.addEdge("D", "C");

        boolean hasCyclee = graph.hasCycle("P");

        Assertions.assertTrue(hasCyclee);
    }

}
