package polymorphism;

class A {
	public String x() {
		return "X";
	}
}


class B extends A {
	public String y() {
		return "y";
	}
}

public class PolymorphismEx2 {

	public static void main(String[] args) {
		A obj = new B();
		obj.x();
		obj.y();
	}

}
