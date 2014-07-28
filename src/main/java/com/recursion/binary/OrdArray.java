package com.recursion.binary;

public class OrdArray {
    
    private long[] a;
    private int nElems;
    
    public OrdArray(int max){
        a= new long[max];
        nElems = 0;
    }
    
    public int size(){
        return nElems;
    }
    
    public int find(long searchKey){
        return recFind(searchKey,0,nElems-1);
    }

    private int recFind(long searchKey, int lowerBound, int upperBound) {
        int curIn;
        curIn= (lowerBound+upperBound)/2;
        if(a[curIn]==searchKey){
            return curIn;
        }else if(lowerBound>upperBound){
            return nElems;
        }else{
            if(a[curIn]<searchKey){
                return recFind(searchKey, curIn+1, upperBound);
            }else{
                return recFind(searchKey, lowerBound, curIn-1);
            }
        }
    }
    public void insert(long value){
        if(nElems==0){
            a[nElems]=value;
        }else if(a[nElems-1]<value){
            a[nElems]=value;
        }else{
            for (int i = 0; i < nElems; i++) {
                if(a[i]>value){
                    for (int k =nElems;k>i;k--) {
                        a[k]=a[k-1];
                    }
                    a[i]=value;
                    break;
                }
            }
        }
        nElems++;
    }
    
    

    
    
    public void display(){
        
        for (int j = 0;j<nElems;j++) {
            System.out.print(a[j]+ " ");
        }
        System.out.println();
    }
}
