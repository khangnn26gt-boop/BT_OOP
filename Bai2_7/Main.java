package Bai2.Bai2_7;

public class Main {
    static void main(String[] args) {
        MyLine line1 = new MyLine(1, 2, 4, 6);

        System.out.println(line1);

        System.out.println("Begin: " + line1.getBegin());
        System.out.println("End: " + line1.getEnd());

        line1.setBeginX(2);
        line1.setBeginY(3);
        line1.setEndX(5);
        line1.setEndY(7);

        System.out.println("Begin X: " + line1.getBeginX());
        System.out.println("Begin Y: " + line1.getBeginY());
        System.out.println("End X: " + line1.getEndX());
        System.out.println("End Y: " + line1.getEndY());

        line1.setBeginXY(0, 0);
        line1.setEndXY(3, 4);

        System.out.println("Begin XY: "
                + line1.getBeginXY()[0] + ", "
                + line1.getBeginXY()[1]);

        System.out.println("End XY: "
                + line1.getEndXY()[0] + ", "
                + line1.getEndXY()[1]);

        System.out.println("Length: " + line1.getLength());
        System.out.println("Gradient: " + line1.getGradient());

        MyPoint p1 = new MyPoint(1, 1);
        MyPoint p2 = new MyPoint(4, 5);

        MyLine line2 = new MyLine(p1, p2);
        System.out.println(line2);

        line2.setBegin(new MyPoint(0, 0));
        line2.setEnd(new MyPoint(6, 8));

        System.out.println("New line: " + line2);
    }


}
