package com.rackspace.example.stack;

import java.util.Stack;

public class RackStack {
    private Stack stack = new Stack();
    
    public void push(Object o) {
        stack.push(o);
    }

    public int size() {
        return stack.size();
    }

    public Object pop() {
        return stack.pop();
    }
}
