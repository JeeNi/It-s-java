package scope;

public class ScopeGlobalVariable {
	static int i; 			// 전역변수
	
	static void a() {
		/*int*/i = 0;
	}

	public static void main(String[] args) {
		for (/*int*/ i = 0; i < 5; i++) {			// 주석처럼 int를 넣어주면 01234가 출력됨
			a();
			System.out.println(i);
		}

	}

}
