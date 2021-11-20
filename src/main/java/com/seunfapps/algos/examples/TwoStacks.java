package com.seunfapps.algos.examples;

public class TwoStacks {
    //ONE ARRAY, TWO STACKS
    private int [] items;
    private int count1;
    private int count2;
    private int offset;

    public TwoStacks(int stack1, int stack2){
        items = new int[stack1 + stack2];
        count1 = 0;
        count2 = 0;
        offset = stack1;
    }

    public void push1(int item){
        if(count1 == items.length)
            throw new StackOverflowError();

        items[count1] = item;
        count1++;
    }
    public void push2(int item){
        if(count2 == items.length)
            throw new StackOverflowError();

        items[offset + count2] = item;
        count2++;
    }

    public int pop1(){
        if(isEmpty1())
            throw new IllegalStateException();

        int item = items[count1 - 1];
        count1--;
        return item;

    }
    public int pop2(){
        if(isEmpty2())
            throw new IllegalStateException();

        int item = items[offset + (count2 - 1)];
        count2--;
        return item;

    }

    public boolean isEmpty1(){
        return count1 == 0;
    }
    public boolean isEmpty2(){
        return count2 == 0;
    }
}
