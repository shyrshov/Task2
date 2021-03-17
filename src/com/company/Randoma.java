package com.company;
import java.util.Random;

public class Randoma {
    public static void main (String[] args) {
        Random r = new Random();
        int n = 6;
        int[] Array;
        Array = new int[n];
        boolean sort = false;
        int t;
        for (int a = 0; a < n; a++) {
            Array[a] = r.nextInt(10);
            System.out.println (a + " element of array = " + Array[a]);

        }
        while (!sort) {
            sort = true;
            for (int b = 0; b < n - 1; b++) {
                if (Array[b] < Array[b+1]) {
                    sort = false;
                    t = Array[b];
                    Array[b] = Array[b+1];
                    Array[b+1] = t;

                }
            }
        }
        for (int c = 0; c < n; c++) {
            System.out.println (c + " sorted element of array = " + Array[c]);
        }
    }
}
