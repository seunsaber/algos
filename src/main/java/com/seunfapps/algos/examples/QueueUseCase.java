package com.seunfapps.algos.examples;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class QueueUseCase {
    public void reverse(Queue<Integer> queue){
        Stack<Integer> stack = new Stack<>();

        while (!queue.isEmpty())
            stack.push(queue.remove());
        while (!stack.empty())
            queue.add(stack.pop());
    }

    public void reverseFirstK(Queue<Integer> queue, int k){
        Stack<Integer> stack = new Stack<Integer>();

        while (k > 0){
            stack.push(queue.remove());
            k--;
        }

        while (!stack.empty())
            queue.add(stack.pop());

        for (int i = 0; i < queue.size() - k; i++) //remove from front, add to back.
            queue.add(queue.remove());

    }
}
