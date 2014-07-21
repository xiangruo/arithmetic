package com.link;

public class firstLastList {

    private Link first;

    private Link last;

    public firstLastList() {
        first = null;
        last = null;

    }

    public boolean isEmpty() {

        return first == null;
    }

    public void insertFirst(int id, long dData) {

        Link newLink = new Link(id, dData);
        if (isEmpty()) {
            last = newLink;
        }
        newLink.next = first;
        first = newLink;

    }

    public void insertLast(int id, long dData) {

        Link newLink = new Link(id, dData);
        if (isEmpty()) {
            first = newLink;
        } else {
            last.next = newLink;
        }
        last = newLink;
    }
    public Link deleteFirst(){
        Link current = first;
       if(first.next==null){
           last = null;
       }
       first = first.next;
       return current;
    }
    public void disPlay() {

        System.out.println("List (first-->last)");
        Link current = first;
        while (current != null) {

            current.display();
            current = current.next;
        }

    }
    
    
}
