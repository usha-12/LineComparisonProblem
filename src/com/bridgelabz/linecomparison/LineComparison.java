package com.bridgelabz.linecomparison;

import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        int x1 = 0;
        int x2 = 0;
        int y1 = 0;
        int y2 = 0;
        double length = 0.0;
        System.out.println("Welcome to the Line Comparison Computation Program");
        //model a line based on a point consisting of (x, y) co-ordinates using the Cartesian system, and calculate its length
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("Using the Cartesian Coordinate System, enter the endpoints of the line");
        System.out.println("Endpoint 1 (x1, y1)");
        System.out.println("Enter the abscissa (x-coordinate) : ");
        x1 = sc.nextInt();
        System.out.println("Enter the ordinate (y-coordinate) : ");
        y1 = sc.nextInt();
        System.out.println("Endpoint 2 (x2, y2)");
        System.out.println("Enter the abscissa (x-coordinate) : ");
        x2 = sc.nextInt();
        System.out.println("Enter the ordinate (y-coordinate) : ");
        y2 = sc.nextInt();

        length = Math.sqrt((Math.pow((x2-x1), 2)+Math.pow((y2-y1), 2)));
        System.out.println("Length of the Line is : " + length);

    }
}
/*As a fan of geometry, I want to
model a line based on a point
consisting of (x, y) co

-ordinates
using the Cartesian system,
So that I can calculate its
length. - A Length as 2 Points (x1, y1) and (x2, y2) - Length of a Line = sqrt( (x2 - x1) ^ 2 + (y2

- y1) ^ 2)*/