package com.array;

public class LowArray {
    
    private  long[] a;
    
    public LowArray(int size){
        
        a = new long[size];
    }
    
    public void setElem(int index,long value){
        a[index]=value;
    }
    public long getElm(int index){
        return a[index];
        
    }
}
