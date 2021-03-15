package com.company;
import java.lang.Math;

public class Square {
    public static void main (String[] args) {
        double x = 7.33;
        double x2 = Math.pow(x, 2);
        System.out.println("Square of a rectangle with side " + x + " = " + x2);
        double y = 5.08;
        double y2 = Math.PI * (y * y);
        System.out.println("Square of circle with radius " + y + " = " + y2);
    }
}
