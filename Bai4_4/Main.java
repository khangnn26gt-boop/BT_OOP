package Bai4.Bai4_4;

public class Main {
    static void main(String[] args) {

        Point p1 = new Point(1.5f, 2.5f);

        System.out.println("Point:");
        System.out.println(p1);
        System.out.println("X = " + p1.getX());
        System.out.println("Y = " + p1.getY());

        p1.setX(3.5f);
        p1.setY(4.5f);

        System.out.println("After changing X and Y:");
        System.out.println(p1);

        // Test class MovablePoint
        MovablePoint mp1 = new MovablePoint(1.0f, 2.0f, 0.5f, 1.0f);

        System.out.println("\nMovablePoint:");
        System.out.println(mp1);

        System.out.println("X Speed = " + mp1.getXSpeed());
        System.out.println("Y Speed = " + mp1.getYSpeed());

        // Move the point
        mp1.move();

        System.out.println("After moving:");
        System.out.println(mp1);

        // Test getSpeed()
        float[] speed = mp1.getSpeed();

        System.out.println("Speed: (" + speed[0] + ", " + speed[1] + ")");
    }
}
