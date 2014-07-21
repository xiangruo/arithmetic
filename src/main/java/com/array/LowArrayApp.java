package com.array;

public class LowArrayApp {

    public static void main(String[] args) {

        LowArray arr;
        arr = new LowArray(100);
        int nElem = 0;
        int i = 0;
        arr.setElem(0, 77);
        arr.setElem(1, 99);
        arr.setElem(2, 44);
        arr.setElem(3, 55);
        arr.setElem(4, 66);
        arr.setElem(5, 11);
        arr.setElem(6, 00);
        arr.setElem(7, 66);
        arr.setElem(8, 33);
        arr.setElem(9, 22);
        nElem = 10;

        for (i = 0; i < nElem; i++) {
            System.out.print(arr.getElm(i) + " ");
        }
        System.out.println("");
        int searchKey = 26;
        for (i = 0; i < nElem; i++) {
            if(arr.getElm(i)==searchKey)
                break;
        }
        if(i==nElem){
            System.out.println("Can't not find "+searchKey);
        }else{
            System.out.println("found"+searchKey);
        }
        for (i = 0; i < nElem; i++) {
            if(arr.getElm(i)==55)
                break;
        }
        for (int k = i; k < nElem; k++) {
            arr.setElem(k, arr.getElm(k+1));
           
        }
        nElem--;
        for (i = 0; i < nElem; i++) {
            System.out.print(arr.getElm(i) + " ");
        }
        System.out.println("");
    }
}
