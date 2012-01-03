package com.rackspace.example.stack.step_definitions;

import com.rackspace.example.stack.RackStack;
import org.springframework.stereotype.Component;

@Component
public class NinjaContext {
    private RackStack myStack;
    private Object pushed;
    private Object popped;
    private String myString;

    public Object getPushed() {
        return pushed;
    }

    public void setPushed(Object pushed) {
        this.pushed = pushed;
    }

    public Object getPopped() {
        return popped;
    }

    public void setPopped(Object popped) {
        this.popped = popped;
    }

    public RackStack getMyStack() {
        return myStack;
    }

    public void setMyStack(RackStack myStack) {
        this.myStack = myStack;
    }

    public void setMyString(String s) {
        myString = s;
    }

    public String getMyString() {
        return myString;
    }
}
