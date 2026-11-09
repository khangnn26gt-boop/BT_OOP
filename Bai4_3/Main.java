package Bai4.Bai4_3;

import java.util.Arrays;

public class Main {
    static void main(String[] args) {
        Point2D p1 = new Point2D();

        System.out.println("POINT 2D:");
        System.out.println("Point = " + p1);
        System.out.println("X = " + p1.getX());
        System.out.println("Y = " + p1.getY());
        System.out.println("XY = "
                + Arrays.toString(p1.getXY()));


        p1.setXY(3.0f, 4.0f);

        System.out.println("New Point = " + p1);


        Point3D p2 = new Point3D(1.0f, 2.0f, 3.0f);

        System.out.println("\nPOINT 3D:");
        System.out.println("Point = " + p2);
        System.out.println("X = " + p2.getX());
        System.out.println("Y = " + p2.getY());
        System.out.println("Z = " + p2.getZ());

        System.out.println("XYZ = "
                + Arrays.toString(p2.getXYZ()));


        p2.setXYZ(5.0f, 6.0f, 7.0f);

        System.out.println("New Point = " + p2);
    }
}