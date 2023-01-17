package com.bridgelabz.linecomparison;

import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        int line1x1 = 0;
        int line1x2 = 0;
        int line1y1 = 0;
        int line1y2 = 0;
        int line2x1 = 0;
        int line2x2 = 0;
        int line2y1 = 0;
        int line2y2 = 0;
        double lengthLine1 = 0.0;
        double lengthLine2 = 0.0;
        //Start with Displaying Welcome to Line Comparison Computation Program on Master Branch
        System.out.println("Welcome to the Line Comparison Computation Program ");
        //model a line based on a point consisting of (x, y) co-ordinates using the Cartesian system, and calculate its length
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Using the Cartesian Coordinate System, enter the endpoints of the Line 1");
        System.out.println("Endpoint 1 (x1, y1)");
        System.out.println("Enter the abscissa (x-coordinate) : ");
        line1x1 = sc.nextInt();
        System.out.println("Enter the ordinate (y-coordinate) : ");
        line1y1 = sc.nextInt();
        System.out.println("Endpoint 2 (x2, y2)");
        System.out.println("Enter the abscissa (x-coordinate) : ");
        line1x2 = sc.nextInt();
        System.out.println("Enter the ordinate (y-coordinate) : ");
        line1y2 = sc.nextInt();
        lengthLine1 = Math.sqrt((Math.pow((line1x2-line1x1), 2)+Math.pow((line1y2-line1y1), 2)));
        System.out.println("Length of Line 1 is : " + lengthLine1);
        System.out.println();
        System.out.println("Using the Cartesian Coordinate System, enter the endpoints of the Line 2");
        System.out.println("Endpoint 1 (x1, y1)");
        System.out.println("Enter the abscissa (x-coordinate) : ");
        line2x1 = sc.nextInt();
        System.out.println("Enter the ordinate (y-coordinate) : ");
        line2y1 = sc.nextInt();
        System.out.println("Endpoint 2 (x2, y2)");
        System.out.println("Enter the abscissa (x-coordinate) : ");
        line2x2 = sc.nextInt();
        System.out.println("Enter the ordinate (y-coordinate) : ");
        line2y2 = sc.nextInt();
        lengthLine2 = Math.sqrt((Math.pow((line2x2-line2x1), 2)+Math.pow((line2y2-line2y1), 2)));
        System.out.println("Length of Line 2 is : " + lengthLine2);
        //check equality of two lines based on the end points, whether two lines are the equal
        Double d1 = new Double(lengthLine1);
        Double d2 = new Double(lengthLine2);
        if (d1.equals(d2))
            System.out.print("Line 1 and line 2 have Equal lengths.");
        else
            System.out.print("Line 1 and Line 2 do not have Equal lengths.");
    }
}
/*As a fan of geometry, I want to
check equality of two lines
based on the end points, So
that I know when two lines are
the equal. - Using Java equals method to check equality of 2 Lengths is
preferable.*/