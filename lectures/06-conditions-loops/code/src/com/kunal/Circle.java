package com.kunal;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        System.out.println("Please Enter Radius of circle");
        var s = new Scanner(System.in);
        var radius = s.nextInt();
        var areaOfCircle = 3.14 * radius * radius;
        System.out.println("Area of circle ="+ areaOfCircle);

    }
}
