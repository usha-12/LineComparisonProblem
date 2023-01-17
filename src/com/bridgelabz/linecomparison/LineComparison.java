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
        System.out.println("Welcome to the Line Comparison Computation Program..");
        Line line1 = new Line();
        Line line2 = new Line();
        LineComparison lineObject = new LineComparison();
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Using the cartesian coordinate system enter the endpoint of the Line 1");
        System.out.println("Endpoint 1 (x1, y1)");
        System.out.println("Enter the abscissa (x-Coordinate) =");
        line1x1 = sc.nextInt();
        System.out.println("Enter the ordinate (y-Coordinate) =");
        line1y1 = sc.nextInt();
        System.out.println("Endpoint 2 (x2, y2)");
        System.out.println("Enter the abscissa (x-Coordinate) =");
        line1x2 = sc.nextInt();
        System.out.println("Enter the ordinate (y-Coordinate) =");
        line1y2 = sc.nextInt();
        line1.setStartCoordinates(line1x1, line1y1);
        line1.setEndCoordinates(line1x2, line1y2);
        System.out.println();
        System.out.println("==============================================");
        System.out.println("Using the cartesian coordinate system enter the endpoint of the Line 2");
        System.out.println("Endpoint 1 (x1, y1)");
        System.out.println("Enter the abscissa (x-Coordinate) =");
        line2x1 = sc.nextInt();
        System.out.println("Enter the ordinate (y-Coordinate) =");
        line2y1 = sc.nextInt();
        System.out.println("Endpoint 2 (x2, y2)");
        System.out.println("Enter the abscissa (x-Coordinate) =");
        line2x2 = sc.nextInt();
        System.out.println("Enter the ordinate (y-Coordinate) =");
        line2y2 = sc.nextInt();
        line2.setStartCoordinates(line2x1, line2y1);
        line2.setEndCoordinates(line2x2, line2y2);
        lengthLine1 = lineObject.calculateLength(line1);
        lengthLine2 = lineObject.calculateLength(line2);
        lineObject.display(lengthLine1, lengthLine2);
        lineObject.checkEqualLengths(lengthLine1, lengthLine2);
        sc.close();
    }

    public double calculateLength(Line line){
        int x1 = line.getStartCoordinates().getxCoordinate();
        int y1 = line.getStartCoordinates().getyCoordinate();
        int x2 = line.getEndCoordinates().getxCoordinate();
        int y2 = line.getEndCoordinates().getyCoordinate();
        return (Math.sqrt((Math.pow((x2-x1),2)+Math.pow((y2-y1),2))));

    }
    public void checkEqualLengths(double lengthA, double lengthB){
        System.out.println();
        if (lengthA == lengthB)
            System.out.println("Line 1 and line 2 have Equal length ");
        else
            System.out.println("Line 1 and Line 2 do not have Equal length.");
    }
    public void compareLengths (double lengthA, double lengthB){
        System.out.println();
        if ((Double.compare(lengthA, lengthB)) == 0)
            System.out.println("Length of Line 1 is equal to the length of Line 2.");
        else
        if ((Double.compare(lengthA, lengthB)) > 0)
            System.out.println("Length of Line 1 is greater than the length of Line 2.");
    }
    public void display(double lengthA, double lengthB){
        System.out.println();
        System.out.println("Length of Line 1 is : "+lengthA);
        System.out.println("Length of Line 2 is : "+lengthB);
    }

}
/*Use Java Object-Oriented
Programming Concepts of Line
and Point as well as equals and
compareTo methods. - Using Java compareTo method to compare 2 Lengths is
preferable.*/