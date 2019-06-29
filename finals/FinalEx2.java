package finals;

class A {
	final void b() {
		}
}

class B extends A{
	void b() {
		}
}

// B 클래스에서 A 클래스의 b() 메소드를 오버라이딩 하면 에러 발생
// 메소느가 final로 지정되면 해당 메소드는 오버라이딩할 수 없음

final class C{
	final void b() {
		}
}

class D extends C{
	}

// C 클래스를 final로 지정해서 더는 상속할 수 없기 때문에 에러 발생