package com.company;
import java.util.Random;

public class Array1 {
    public static void main (String [] args) {
        int[] Array;
        Array = new int[10];
        for(int n = 0; n<10; n++) {
            Array[n] = 5 + (int) (Math.random() * 10);
            System.out.println ((n+1) + " число цикла = " + Array[n]);
        }
    }
}
