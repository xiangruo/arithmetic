package com.Queue;

public class Queue {
    
    private int maxSize;
    private long[] queArray;
    private int front;
    private int nItems;
    private int rear;
    
    public Queue(int s){
        maxSize=s;
        queArray = new long[maxSize];
        front=0;
        rear=-1;
        nItems=0;
    }
    public void insert(long value){
        
        if(rear==maxSize-1){
            rear =-1;
        }
        queArray[++rear]=value;
        nItems++;
    }
    
    public long remve(){
        
        long temp = queArray[front++];
        if(front==maxSize){
            front=0;
        }
        nItems--;
        return temp;
    }
    
    
    public long peekFront(){
        return queArray[front];
        
    }
    public boolean isEmpty(){
        return nItems==0;
    }
    
    public boolean isFull(){
        return nItems==maxSize;
        
    }
    public int size(){
        return nItems;
    }
    
    public static void main(String[] args) {
        Queue theQueue = new Queue(5);
        theQueue.insert(10);
        theQueue.insert(20);
        theQueue.insert(30);
        theQueue.insert(40);
        System.out.println(theQueue.peekFront());
        System.out.println(theQueue.remve());
        System.out.println(theQueue.peekFront());
        
    }
}
