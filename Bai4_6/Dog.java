package Bai4.Bai4_6;


public class Dog extends Mammal {


    public Dog(String name) {
        super(name);
    }


    public void greet() {
        System.out.println("Woof");
    }


    public void greet(Dog another) {
        System.out.println("Wooooof");
    }


    @Override
    public String toString() {
        return "Dog[" + super.toString() + "]";
    }
}

