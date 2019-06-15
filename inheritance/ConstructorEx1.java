package inheritance;

public class ConstructorEx1 {

		public ConstructorEx1(int param1) {}   // 오류
		
		// 매개변수가 있는 생성자는 자동으로 기본 생성자들 만들어 주지 않음
		
		public static void main(String[] args) {
		ConstructorEx1 c = new ConstructorEx1();

	}

}
