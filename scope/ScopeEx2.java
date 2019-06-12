package scope;

public class ScopeEx2 {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
			
			// i가 for문에서 선언되었고 이 변수는 중괄호 사이에서만 유효하기 때문에
			// 중괄호 바깥쪽에서는 존재하지 않는 변수를 화면에 출력하는 것으로 간주
			// 그래서 에러를 발생함
			
		}
		// System.out.println(i);
	}

}
