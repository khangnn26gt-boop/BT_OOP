package Bai4.Bai4_2;

public class Main {
    static void main(String[] args) {

        Student s1 = new Student(
                "Nguyen Van A",
                "Ha Noi",
                "Computer Science",
                2,
                5000.0
        );

        System.out.println("STUDENT:");
        System.out.println(s1);

        System.out.println("Name: " + s1.getName());
        System.out.println("Address: " + s1.getAddress());
        System.out.println("Program: " + s1.getProgram());
        System.out.println("Year: " + s1.getYear());
        System.out.println("Fee: " + s1.getFee());


        s1.setAddress("Ho Chi Minh");

        System.out.println("New address: "
                + s1.getAddress());

        Staff st1 = new Staff(
                "Tran Van B",
                "Da Nang",
                "ABC University",
                15000.0
        );

        System.out.println("\nSTAFF:");
        System.out.println(st1);

        System.out.println("Name: " + st1.getName());
        System.out.println("Address: " + st1.getAddress());
        System.out.println("School: " + st1.getSchool());
        System.out.println("Pay: " + st1.getPay());


        st1.setPay(18000.0);

        System.out.println("New pay: " + st1.getPay());
    }
}