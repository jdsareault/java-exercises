package org.launchcode.java.Stuidos;

import java.util.Scanner;
import java.lang.Math;

/**
 * Created by jd on 3/2/17.
 * Takes a radius as input and outputs the area.
 */
public class Area {
    public static void main(String[] args) {
        double area;
        double radius;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("");
        radius = in.nextDouble();

        area = Math.PI * radius * radius;

        System.out.println("The area is " + area);
    }
}
