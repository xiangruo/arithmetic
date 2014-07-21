package com.link;


import com.Iterator.ListIterator;
import com.linkstack.Link;
public class LinkList {
    
    private Link first;
    
    public void linkList(){
        
        first = null;
    }
    public boolean isEmpty(){
        
        return  first == null;
    }
    
    public void insertFirst(long dd){
        Link newLink = new Link(dd);
        newLink.next=first;
        first = newLink;
    }
    
    public Link deleteFirst(){
        Link tempLink=first;
        first=first.next;
        return tempLink;
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
    
    public static void main(String[] args) {
        LinkList list = new LinkList();
        
        while(!list.isEmpty()){
            
            Link link=list.deleteFirst();
            link.display();
        }
        
    }
    public Link getFirst() {
        return first;
    }
    public void setFirst(Link f) {
        first = f;
    }
    
    public ListIterator getIterator(){
        return new ListIterator(this);
    }

}
