package com.recursion.anagram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**    
 *     
 * 项目名称：arithmetic    
 * 类名称：AnagramApp    
 * 类描述：    还有点问题
 * 创建人：1207263    
 * 创建时间：2014-7-22 下午01:36:53    
 * 修改人：1207263    
 * 修改时间：2014-7-22 下午01:36:53    
 * 修改备注：    
 * @version     
 *     
 */
public class AnagramApp {

    static int size;

    static int count;

    static char[] arrChar = new char[100];

    public static void doAnagram(int newSize) {

        if (newSize == 1) {
            return;
        }
        for (int i = 0; i < newSize; i++) {
            doAnagram(newSize - 1);
            if (newSize == 2) {
                displayWord();
                rotate(newSize);
            }
        }
    }

    private static void displayWord() {

        if (count < 99) {
            System.out.print(" ");
        }
        if (count < 9) {
            System.out.print(" ");
        }
        System.out.print(++count + " ");
        for (int i = 0; i < size; i++) {
            System.out.print(arrChar[i]);
        }
        System.out.print("  ");
        System.out.flush();
        if (count % 6 == 0) {
            System.out.println(" ");
        }
    }

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }

    private static void rotate(int newSize) {
        int position = size * newSize;
        char temp = arrChar[position];

        for (int i = position + 1; i < size; i++) {
            arrChar[i - 1] = arrChar[i];
            arrChar[i - 1] = temp;
        }

    }

    public static void main(String[] args)throws IOException {
        System.out.print("Enter a word:");
        String input = getString();
        size = input.length();
        count=0;
        for (int i = 0; i < size; i++) {
            arrChar[i] = input.charAt(i);
        }
        doAnagram(size);
    }

}
