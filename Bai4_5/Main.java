package Bai4.Bai4_5;

public class Main {
    static void main(String[] args) {
        Shape s = new Shape();
        System.out.println(s);
        s.setColor("blue");
        s.setFilled(false);
        System.out.println(s);

        System.out.println("--------------------");


        Circle c = new Circle(5.0, "red", true);
        System.out.println(c);
        System.out.println("Area: " + c.getArea());
        System.out.println("Perimeter: " + c.getPerimeter());

        System.out.println("--------------------");


        Rectangle r = new Rectangle(4.0, 6.0, "blue", false);
        System.out.println(r);
        System.out.println("Area: " + r.getArea());
        System.out.println("Perimeter: " + r.getPerimeter());

        System.out.println("--------------------");


        Square sq = new Square(5.0, "yellow", true);
        System.out.println(sq);
        System.out.println("Area: " + sq.getArea());
        System.out.println("Perimeter: " + sq.getPerimeter());

        sq.setWidth(8.0);
        System.out.println("After setWidth: " + sq);
        System.out.println("Length: " + sq.getLength());
    }
}
