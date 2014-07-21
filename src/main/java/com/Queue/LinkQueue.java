package com.Queue;

public class LinkQueue {
    
    
    private FirstLastList firstLastList;
    public LinkQueue(){
        
        firstLastList = new FirstLastList();
    }
    
    
    public boolean isEmpty(){
        return firstLastList.isEmpty();
    }
    public void insert(long dData){
        
        firstLastList.insertLast(dData);
        
    }
    
    public long remove(){
        return firstLastList.deleteFirst();
        
    }
    
    public void dispalyQueue(){
        firstLastList.displayLink();
    }
}
