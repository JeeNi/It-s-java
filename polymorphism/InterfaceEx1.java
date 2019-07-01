package polymorphism;

/*
interface I {
	}

class C implements I {
	}

public class InterfaceEx1 {

	public static void main(String[] args) {
		I obj = new C();
	}

}
*/

interface I2 {
	public String A();
}

interface I3 {
	public String B();
}

class D implements I2, I3 {
	public String A() {
		return "A";
	}
	
	public String B() {
		return "B";
	}
}

public class InterfaceEx1 {
	public static void main(String[] args) {
		D obj = new D();
		I2 objI2 = new D();
		I3 objI3 = new D();
		
		obj.A();
		obj.B();
		
		objI2.A();
		//objI2.B();
		
		//objI3.A();
		objI3.B();
	}
}