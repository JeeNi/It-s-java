package object;

public class CalculatorEx1 {
	
	public static void sum(int left, int right) {
		System.out.println(left + right);
	}
	
	public static void main(String[] args) {
		sum(10, 20);
		sum(20, 40);
	}
	
	/*
	public static void main(String[] args) {
		
		// 아래 로직이 1000줄에 달하는 복잡한 로직이라 가정
		// +도 중복을 제거해야 하는 요소가 됨
		
		System.out.println(10 + 20);
		System.out.println(20 + 40);
	}
	*/

}
