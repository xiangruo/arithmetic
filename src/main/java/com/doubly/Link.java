package com.doubly;

public class Link {
    
    
    public long dData;
    public Link next;
    public Link previous;
    
    
    public Link(long dData){
        this.dData = dData;
    }
    public void display() {

        System.out.print("{"  + dData + "}");
    }
    
    
}
