package Bai4.Bai4_6;

public class Main {
    static void main(String[] args) {
        Animal a = new Animal("Animal 1");
        System.out.println(a);

        System.out.println("--------------------");


        Mammal m = new Mammal("Mammal 1");
        System.out.println(m);

        System.out.println("--------------------");


        Cat c = new Cat("Kitty");
        System.out.println(c);
        c.greet();

        System.out.println("--------------------");


        Dog d1 = new Dog("Buddy");
        Dog d2 = new Dog("Max");

        System.out.println(d1);
        d1.greet();
        d1.greet(d2);
    }
}