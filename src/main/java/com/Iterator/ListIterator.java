package com.Iterator;

import com.link.LinkList;
import com.linkstack.Link;

public class ListIterator {
    
    private Link current;
    private Link previous;
    private LinkList ourList;
    
    
    public ListIterator(LinkList ourList){
        this.ourList=ourList;
        
        
    }
    
    public boolean atEnd(){
        return (current.next==null);
        
    }
    public void reset(){
        current= ourList.getFirst();
        previous = null;
    }
    
    public void nextLinK(){
        previous = current;
        current = current.next;
    }
    
    
    
    public Link getCurrent(){
        return current;
    }
    
    public void insertAfter(long dd){
        
        Link temp = new Link(dd);
        if(ourList.isEmpty()){
            ourList.setFirst(temp);
            current = temp;
        }else{
            temp.next = current.next;
            current.next= temp;
            nextLinK();
            
        }
    }
    
 public void insertBefore(long dd){
        
        Link temp = new Link(dd);
        if(previous==null){
            temp.next=ourList.getFirst();
            ourList.setFirst(temp);
            reset();
            
        }else{
            temp.next=previous.next;
            previous.next = temp;
            current=temp;
            
        }
    }
 
 public long deleteCurrent(){
     long value = current.dData;
     if(previous==null){
         ourList.setFirst(current.next);
         reset();
     }else{
         previous.next = current.next;
         if(atEnd()){
             reset();
         }else{
             current=current.next;
         }
         
     }
    return value;
     
 }
}
