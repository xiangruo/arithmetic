package com.Stackx;

public class Stackx {
    
    
    private int maxSize;
    private long[] stackArray;
    private int top;
    
    public Stackx(int s){
        this.maxSize=s;
        stackArray = new long[maxSize];
        top=-1;
        
    }
    
    public void push(long value){
        stackArray[++top]=value;
        
    }
    public long pop(){
        return stackArray[top--];
    }
    public long peek(){
        return stackArray[top];
    }
    
    public boolean isEmpty(){
        return top==-1;
    }
    public boolean isFull(){
        return top==maxSize-1;
    }
    
    public static void main(String[] args) {
        Stackx x = new Stackx(10);
        x.push(20);
        x.push(30);
        x.push(40);
        x.push(50);
        while (!x.isEmpty()) {
            System.out.print(x.pop()+" ");
        }
        
    }
    
}
