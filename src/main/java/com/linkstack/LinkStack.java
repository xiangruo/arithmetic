package com.linkstack;

public class LinkStack {
    
    private LinkList linkList;
    
    public LinkStack(){
        linkList = new LinkList();
    }
    public void push(long dData){
        linkList.insertFirst(dData);
    }
    
    public void pop(){
        linkList.deleteFirst();
        
    }
    
    
    public boolean isEmpty(){
        
        return linkList.isEmpty();
    }
    
    public void displayLink(){
        linkList.displayLink();
        
    }
    
    public static void main(String[] args) {
        LinkStack stack = new LinkStack();
        stack.push(22);
        stack.push(44);
        stack.push(66);
        stack.displayLink();
        stack.pop();
        stack.displayLink();
        
        
    }
}
