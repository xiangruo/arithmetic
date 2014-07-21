package com.link;

import  com.linkstack.Link;
public class listInsertionSort {
    
    public static void main(String[] args) {
        
        int size = 10;
        Link[] linkArr = new Link[size];
        
        for (int i = 0; i < linkArr.length; i++) {
           int n = (int)(Math.random()*99);
           Link newLink =new com.linkstack.Link(n);
           linkArr[i]=newLink;
        }
        for (int i = 0; i < size; i++) {
            System.out.print(linkArr[i].dData+" ");
        }
        System.out.println();
        
        
        SortedList sortList = new SortedList(linkArr);
        for (int i = 0; i < size; i++) {
            linkArr[i]=sortList.remove();
        }
        
        
        
        for (int i = 0; i < size; i++) {
            System.out.print(linkArr[i].dData+" ");
        }
        System.out.println();
    }

}
