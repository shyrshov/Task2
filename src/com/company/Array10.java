package com.company;

public class Array10 {
    public static void main (String[] args) {
        int n = 10;
        int[] Array;
        Array = new int[n];
        for (int i = 0; i < n; i++){
            Array[i] = i;
        }
        int s = 0;
        for (int a = 1; a < Array.length - 1; a++) {
                s = s + Array[a];
        }
        System.out.println ("Sum of all array elements = " + s);
    }
}
