package Bai2.Bai2_8;

public class Main {
    static void main(String[] args) {
        MyCircle c1 = new MyCircle();
        System.out.println(c1);


        MyCircle c2 = new MyCircle(3, 4, 5);
        System.out.println(c2);


        MyPoint p1 = new MyPoint(6, 8);
        MyCircle c3 = new MyCircle(p1, 2);
        System.out.println(c3);


        c2.setRadius(10);
        c2.setCenterX(1);
        c2.setCenterY(2);

        System.out.println("Radius: " + c2.getRadius());
        System.out.println("Center X: " + c2.getCenterX());
        System.out.println("Center Y: " + c2.getCenterY());

        c2.setCenterXY(0, 0);
        System.out.println("Center XY: "
                + c2.getCenterXY()[0] + ", "
                + c2.getCenterXY()[1]);


        System.out.println("Area: " + c2.getArea());
        System.out.println("Circumference: "
                + c2.getCircumference());


        System.out.println("Distance: " + c2.distance(c3));
    }

}
