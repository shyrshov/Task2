package com.company;

public class Factorial {
    public static void main (String[] args) {
        int n = 7;
        int factorial = 1;
            for ( int a = 1; a <= n; a++) {
                factorial = factorial * a;
            }
            System.out.println(n + "! = " + factorial);
    }
}
