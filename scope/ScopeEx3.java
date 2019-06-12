package scope;

public class ScopeEx3 {

		static int i = 5;
		
		// 처음에 5가 출력됨
		
		static void a() {
			int i = 10;
			b();
		}
		
		static void b() {
			int i = 30; 	// 지역변수      	// 30이 출력됨 
			System.out.println(i);		// i의 변수가 b() 메소드의 유효범위에 속하기 때문
		}								// 전역변수와 지역 변수를 없애면 에러가 발생	
		
		public static void main(String[] arg) {
			int i = 1; // 여전히 5가 출력됨
			a();
		}
	}
				


