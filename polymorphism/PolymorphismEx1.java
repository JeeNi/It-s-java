package polymorphism;

class A{}

class B extends A{}

public class PolymorphismEx1 {
    public static void main(String[] args) {
        A obj = new B();
    }
}

