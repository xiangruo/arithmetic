package com.linkstack;

import com.linkstack.Link;

public class LinkList {
    
    
    private Link first;
    
    public LinkList(){
        first = null;
    }
    
    public void insertFirst(long dData){
        Link newLink = new Link(dData);
        newLink.next = first;
        first = newLink;
    }
    public boolean isEmpty(){
        
        return first == null;
    }
    
    public Link deleteFirst(){
        Link temp =first;
        first = first.next;
        return temp;
        
    }
    
    public void displayLink(){
        System.out.println("List (first-->last)");
        Link current = first;
        while(current!=null){
            current.display();
            current=current.next;
        }
        System.out.println("");
    }
}
