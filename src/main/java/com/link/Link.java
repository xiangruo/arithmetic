package com.link;

public class Link {
    
    
    public int iData;
    public double dData;
    public Link next;
    
    public Link(int id,double dData){
        
        this.iData=id;
        this.dData = dData;
        
    }
    public void display(){
        
        System.out.println("{"+iData+","+dData+"}");
    }

}
