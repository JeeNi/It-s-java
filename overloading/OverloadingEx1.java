package overloading;

public class OverloadingEx1 {
	void A() {
		System.out.println("void A()");
	}
	
	void A(int arg1) {
		System.out.println("void A(int arg1)");
	}
	
	/*
	void A(int param1) {
		System.out.println("void A(int param1");
	}
	*/
	
	void A(String arg1) {
		System.out.println("void A(String arg1)");
	}
	
	//int A() {
	//	  System.out.println("void A(String arg1)");
    // }
	
	public static void main(String[] args) {
		OverloadingEx1 od = new OverloadingEx1();
		od.A();
		od.A(1);
		od.A("coding everybody");
	}

}
