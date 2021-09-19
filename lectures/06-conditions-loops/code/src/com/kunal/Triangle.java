package com.kunal;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three points for a triangle:");

        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        double s = ((x1 + y1) + (x2 + y2) + (x3 + y3)) / 2;
        double area = Math.sqrt(s * (s - (x1 - y1)) * (s - (x2 - y2)) * (s - (x3 - y3)));

        System.out.println("The area of the triangle is " + area);
    }
}
