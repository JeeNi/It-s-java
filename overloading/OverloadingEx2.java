package overloading;

public class OverloadingEx2 extends OverloadingEx1 {
	void A(String arg1, String arg2) {
		System.out.println("sub class : void A(String arg1, String arg2)");
	}
	
	void A() {
		System.out.println("sub class : void A()");
	}

	public static void main(String[] args) {
		OverloadingEx2 od = new OverloadingEx2();
		od.A();
		od.A(1);
		od.A("coding everybody");
		od.A("coding everybody", "coding everybody");

	}

}
