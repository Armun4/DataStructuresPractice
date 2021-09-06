package com.example;

import java.util.Stack;

public class QueueWithStacks {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void enqueue(int item){
        stack1.push(item);
    }
    public int dequeue(){
        moveStack1toStack2();
        return stack2.pop();
    }
    public int peek() {
        moveStack1toStack2();
        return stack2.peek();
    }

    private void moveStack1toStack2() {
        if (stack2.isEmpty())
            while (!stack1.isEmpty())
                stack2.push(stack1.pop());
    }

    ;
    public boolean isEmpty(){
        return stack1.isEmpty() && stack2.isEmpty();
    }
}
