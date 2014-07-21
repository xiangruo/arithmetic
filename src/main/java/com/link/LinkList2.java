package com.link;

public class LinkList2 {

    private Link first;

    public LinkList2() {

        first = null;
    }

    public void insertLink(int id, double dData) {

        Link newLink = new Link(id, dData);
        newLink.next = first;
        first = newLink;

    }

    public Link findLink(int key) {

        Link current = first;
        while (current.iData != key) {

            if (current.next == null) {

                return null;
            } else {
                current = current.next;
            }
        }
        return current;
    }

    public Link delete(int key) {
        Link current = first;
        Link previous = first;
        while (current.iData != key) {

            if (current.next == null) {

                return null;
            } else {
                previous = current;
                current = current.next;
            }
        }

        if (current == first) {
            first = first.next;
        } else {
            previous.next = current.next;
        }
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
    public static void main(String[] args) {
        LinkList2 theList = new LinkList2();
        theList.insertLink(22, 2.99);
        theList.insertLink(44, 4.99);
        theList.insertLink(66, 6.99);
        theList.insertLink(88, 8.99);
        
        
        theList.disPlay();
        Link theLink = theList.findLink(44);
        if(theLink!=null){
            System.out.println("the dData :"+theLink.dData);
        }else{
            System.out.println("can't find Link");
        }
        Link d = theList.delete(66);
        if(d!=null){
            System.out.println("delete link with key :"+d.iData);
        }else{
            System.out.println("can't delete Link");
            
        }
        theList.disPlay();
    }
}
