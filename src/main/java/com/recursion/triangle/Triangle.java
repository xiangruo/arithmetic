package com.recursion.triangle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Triangle {
    
    static int theNumber;
    
    public static void main(String[] args) {
        System.out.println("Enter a Number:");
        try {
            theNumber = getInt();
            int theAnSwer = triangle(theNumber);
            System.out.println("Triangle:"+theAnSwer);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        
        
    }

    
    
    public static int triangle(int n){
        if(n==1){
            return 1;
        }else{
            return (n+triangle(n-1));
        }
    }
    
    public static String getString()throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }
    
    public static int getInt()throws IOException{
        String s = getString();
        return Integer.parseInt(s);
    }
}
