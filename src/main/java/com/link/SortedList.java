package com.link;

import com.linkstack.Link;


public class SortedList {
    
    
    
    private Link first;
    
    public SortedList(){
        first = null;
    }
    
    public boolean isEmpty(){
        
        return first == null;
    }
    
    public void insert(long key){
        
        Link newLink =new Link(key);
        
        Link previous = null;
        Link current = first;
        while(current!=null && key>=current.dData){
            
            previous=current;
            current =current.next;
        }
        if(previous ==null){
            
            first = newLink;
        }else{
            previous.next= newLink;
        }
        newLink.next = current;
    }
    public Link remove(){
        Link temp =first;
        first= first.next;
        
        return temp;
    }
    
    public SortedList(Link[] linkArr){
        first = null;
        for (int i = 0; i < linkArr.length; i++) {
            
            insert(linkArr[i]);
            
        }
        
    }

    private void insert(Link link) {
        Link previous = null;
        Link current = first;
        while(current!=null && link.dData>=current.dData){
            previous = current;
            current = current.next;
        }
        if(previous == null){
            first = link;
            
        }else{
            
            previous.next = link;
        }
        link.next= current;
        
        
    }
    
}
