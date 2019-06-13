package scope;

class C{
	int v= 10;
	
	void m() {
		int v = 20;
		System.out.println(v);
		System.out.println(this.v);			 // 처음은 10을 출력함
	}								 		 // m() 메소드 안에 int v =20;을 넣으면 20을 출력	
}											 // 지역변수 우선순위가 더 높아서 지역변수 v의 값이 출력되기 때문
											 // 구체적인 값일수록 더 우선순위가 높다는 것이 일반적인 원칙
public class ScopeEx4 {				         // this가 붙으면 그 객체에 대한 전역 유효범위를 의미

	public static void main(String[] args) {
		C c1 = new C();
		c1.m();
	}

}         //20, 10
