package com.company;

public class Figures {
    public static void main1 (String[] args) {
        int a = 8;
        for (int b = 0; b < a; b++) {
                for (int c = 0; c < a; c++) {
                    System.out.print("*");
                }
                System.out.println();
            }
    }
    public static void main2 (String[] args) {
        int q = 5;
        int array[];
        array = new int[q];
        for (int n = 0; n < q; n++) {
            if (n == 0 || n == array.length - 1) {
                System.out.println("********");
            } else {
                System.out.println("*      *");
            }
        }
    }

    public static void main3 (String[] args) {
        int l = 7;
        for (int n = 0; n < l; n++) {
            for (int l2 = -1; l2 < n; l2++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main (String [] args) {
        String o = "*";
        String p = " ";
        int h = 5;
        for (int i = 1, u = 1; i <= h; i++, u = u+2) {
            System.out.println(p.repeat(h - i) + o.repeat(u) + p.repeat(h - i));
        }
    }

}