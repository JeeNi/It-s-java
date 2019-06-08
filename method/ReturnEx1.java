package method;

public class ReturnEx1 {

	public static int one() {
		
		// sysout에서 one() 이라는 메소드를 호출
		// 이 메소드는 return을 세 번 실행
		// 결과는 1로 치환
		// 자바는 return을 만나는 순간 return 뒤에 따라오는 값을
		// 메소느 바깥쪽으로 반환하면서 메소드의 실행을 완전 종료하기 때문
		return 1;
		return 2;
		return 3;
	}
	
	public static void main(String[] args) {
		System.out.println(one());
	}

}
