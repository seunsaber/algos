package com.seunfapps.algos.datastructures;

import java.util.*;
import java.util.Stack;

public class Graph {

    private Map<String, Node> nodes = new HashMap<>();
    private Map<Node, List<Node>> adjacencyList = new HashMap<>();

    public void addNode(String label){
        Node node = new Node(label);
        nodes.putIfAbsent(label, node);
        adjacencyList.putIfAbsent(node, new ArrayList<>());
    }
    public void removeNode(String label){
        Node target = nodes.get(label);

        if(target == null)
            return;

        //remove edges to the node first
        for(Node node : adjacencyList.keySet()){
            adjacencyList.get(node).remove(target);
        }

        //remove node from hashtable
        adjacencyList.remove(target);
        nodes.remove(target);
    }

    public void addEdge(String from, String to){
        Node source = nodes.get(from);
        Node destination = nodes.get(to);

        if(source == null || destination == null)
            return;

        adjacencyList.get(source).add(destination);


    }

    public void removeEdge(String from, String to){
        Node source = nodes.get(from);
        Node destination = nodes.get(to);

        if(source == null || destination == null)
            return;

        adjacencyList.get(source).remove(destination);
    }


    public void dfsTraversalRecursion(String label){
        Node root = nodes.get(label);
        if(root == null)
            return;

        List<Node> visitedNodes = new ArrayList<>();
        dfsTraverseRecursion(root, visitedNodes);

    }

    private void dfsTraverseRecursion(Node root, List<Node> visitedNodes){
        if(visitedNodes.contains(root))
            return;

        //pre order dfs.
        visitedNodes.add(root);
        System.out.print(root.label);

        for(Node neighbor : adjacencyList.get(root)){
            dfsTraverseRecursion(neighbor, visitedNodes);
        }
    }

    public void dfsTraversalIteration(String label){
        Node root = nodes.get(label);
        if(root == null)
            return;

        java.util.Stack<Node> stack = new java.util.Stack<Node>();

        stack.push(root);

        Set<Node> visited = new HashSet<>();

        while (!stack.isEmpty()){

            Node current = stack.pop();

            if(visited.contains(current))
                continue;

            System.out.print(current.label);
            visited.add(current);

            for(Node neighbor: adjacencyList.get(current)){
                if(!visited.contains(neighbor))
                    stack.push(neighbor); //not sure this impl is correct, first item in list processed last, because stack
            }
        }

    }

    public void bfsTraversal(String label){
        Node root = nodes.get(label);

        if(root == null)
            return;

        Set<Node> visited = new HashSet<>();

        java.util.Queue<Node> queue = new ArrayDeque<>();

        queue.add(root);

        while (!queue.isEmpty()){
            Node current = queue.remove();

            if(visited.contains(current))
                continue;

            System.out.print(current.label);
            visited.add(current);

            for(Node neighbor : adjacencyList.get(current)){
                if(!visited.contains(neighbor))
                    queue.add(neighbor);
            }

        }
    }

    public void topologicalSorting(String label){
        /* a topological sort is a graph traversal in which each node v is visited only after all its dependencies are visited*/
        Node root = nodes.get(label);
        if(root == null)
            return;

        Set<Node> visited = new HashSet<>();
        Stack<Node> order = new Stack<>();

        order = topologicalSorting(root, visited, order);

        while (!order.isEmpty()){
            Node current = order.pop();
            System.out.print(current.label);
        }

    }

    private Stack<Node> topologicalSorting(Node root, Set visited, Stack<Node> order){
        if(visited.contains(root))
            return order;
        visited.add(root);
        for(Node neighbor : adjacencyList.get(root)){
            topologicalSorting(neighbor, visited, order);
        }
        order.push(root);
        return order;
    }

    public boolean hasCycle(String label){

        Node root = nodes.get(label);
        if(root == null)
            return false;

        Set<Node> visiting = new HashSet<>();
        Set<Node> visited = new HashSet<>();

        return hasCycle(root, visiting, visited);

    }

    private boolean hasCycle(Node root, Set<Node> visiting, Set<Node> visited){
        if(visiting.contains(root)){
            //cycle detected
            return true;
        }

        if(visited.contains(root))
            return false;

        visiting.add(root);
        for(Node neighbor : adjacencyList.get(root)){
            System.out.println("Node : "+root.label+" to "+neighbor.label);
            if(hasCycle(neighbor, visiting, visited))
                return true;
        }

        visiting.remove(root);
        visited.add(root);
        return false;
    }

    public void print(){
        StringBuilder sb = new StringBuilder();
        for (Node node : adjacencyList.keySet()){
            sb.append(node.label).append(" is connected to [");
            for(Node target : adjacencyList.get(node)){
                sb.append(target.label);
                sb.append(" ");
            }
            sb.append("]\n");

        }

        System.out.println(sb.toString());
    }

    private class Node{
        String label;

        public Node(String label){
            this.label = label;
        }
    }
}
