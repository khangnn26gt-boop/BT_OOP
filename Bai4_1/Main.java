package Bai4.Bai4_1;

public class Main {
    static void main(String[] args) {

        Cylinder c1 = new Cylinder();

        System.out.println("Cylinder 1:");
        System.out.println("Radius = " + c1.getRadius());
        System.out.println("Height = " + c1.getHeight());
        System.out.println("Base area = " + c1.getArea());
        System.out.println("Volume = " + c1.getVolume());


        Cylinder c2 = new Cylinder(10.0);

        System.out.println("\nCylinder 2:");
        System.out.println("Radius = " + c2.getRadius());
        System.out.println("Height = " + c2.getHeight());
        System.out.println("Base area = " + c2.getArea());
        System.out.println("Volume = " + c2.getVolume());


        Cylinder c3 = new Cylinder(2.0, 10.0);

        System.out.println("\nCylinder 3:");
        System.out.println("Radius = " + c3.getRadius());
        System.out.println("Height = " + c3.getHeight());
        System.out.println("Base area = " + c3.getArea());
        System.out.println("Volume = " + c3.getVolume());

    }
}
