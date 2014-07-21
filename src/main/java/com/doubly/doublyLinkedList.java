package com.doubly;

public class doublyLinkedList {
    
    
    private Link first;
    private Link last;
    
    public doublyLinkedList(){
        
        first =null;
        last =null;
    }
    
    public boolean isEmpty(){
        
        return first ==null;
    }
    
    public void insertFirst(long dData){
        
        Link new_link = new Link(dData);
        
        if(isEmpty()){
            last = new_link;
        }else{
            first.previous=new_link;
        }
        new_link.next= first;
        first=new_link;
    }
    public void insertLast(long dData){
        Link new_link = new Link(dData);
        if(isEmpty()){
            first = new_link;
        }else{
            last.next= new_link;
            new_link.previous = last;
        }
        last = new_link;
    }
    
    public Link deleteFirst(){
        
        Link temp  = first;
        if(temp.next ==null){
            
            last=null;
        }else{
            first.next.previous=null;
        }
        first = first.next;
        return first;
    }
    public Link deleteLast(){
        Link temp  = last;
        if(temp.next ==null){
            first=null;
            
        }else{
            last.previous.next=null;
        }
        last = last.previous;
        return temp;
    }
    
    public boolean insertAfter(long dData){
        Link current = first;
        Link new_link = new Link(dData);
        
        while(current.dData!=dData){
            current = current.next;
            if(current == null){
               return false; 
            }
            
        }
       if(current==last){
           new_link.next =null;
           last = new_link;
       }else{
           
           new_link.next=current.next;
           current.previous.next = new_link;
       }
       new_link.previous=current;
       current.next=new_link;
       return true;
        
    }
    
    public Link deleteKey(long dData){
        
        Link current = first;
        while(current.dData!=dData){
            current = current.next;
            if(current == null){
               return null; 
            }
        }
        if(current == first){
            
            first = current.next;
        }else{
            
            current.previous.next=current.next;
        }
        if(current==last){
            
            last= last.previous;
        }else{
            
            current.next.previous= current.previous;
        }
        
        return current;
        
    }
}
