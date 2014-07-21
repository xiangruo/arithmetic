package com.Queue;

import com.linkstack.Link;

public class FirstLastList {

    private Link first;

    private Link last;

    public FirstLastList() {

        first = null;
        last = null;

    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertLast(long dData) {

        Link temp = new Link(dData);
        if (isEmpty()) {
            first = temp;
        } else {
            last.next = temp;
        }
        last = temp;
    }
    
    public long deleteFirst(){
        
        long temp = first.dData;
        if(first.next==null){
            last = null;
        }
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
