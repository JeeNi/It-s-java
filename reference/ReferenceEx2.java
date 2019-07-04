package reference;

/*
class A {
	public int id;
	
	A(int id) {
		this.id = id;
	}
}

public class ReferenceEx2 {
	public static void runValue() {
		int a = 1;
		int b = a;
		b = 2;
		System.out.println("runValue, " + a);
	}
	public static void runReference() {
		A a = new A(1);			// new를 통해 만드는 데이터 타입이 담긴 a 변수는 서로 다르게 동작함
		A b = a;
		b.id = 2;
		System.out.println("runReference, " + a.id);
	}
	public static void main(String[] arg) {
		runValue();
		runReference();
	}
}
*/

class A {
	public int id;
	
	A(int id) {
		this.id = id;
	}
}

public class ReferenceEx2 {
	public static void runValue() {
		int a = 1;
		int b = a;
		b = 2;
		System.out.println("runValue, " + a);
	}
	public static void runReference() {
		A a = new A(1);			
		A b = a;
		b = new A(2);
		b.id = 2;
		System.out.println("runReference, " + a.id);
	}
	public static void main(String[] arg) {
		runValue();
		runReference();
	}
}

