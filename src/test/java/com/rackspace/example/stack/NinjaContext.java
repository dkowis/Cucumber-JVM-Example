package com.rackspace.example.stack;

import org.picocontainer.DefaultPicoContainer;
import org.picocontainer.annotations.Cache;


public class NinjaContext {
    
    private RackStack rackStack;
    private Object pushed;
    private Object popped;

    public RackStack getRackStack() {
        return rackStack;
    }

    public void setRackStack(RackStack rackStack) {
        this.rackStack = rackStack;
    }

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
}
