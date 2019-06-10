package object;

class Class2 {
	static double PI = 3.14;
	
	// 클래스 변수인 base 추가
	static int base = 0;
	int left, right;
	
	public void setOperands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		
		// 더하기에 base의 값을 포함
		System.out.println(this.left + this.right + base);
	}
	
	public void arg() {
		
		// 평균치에 base의 값을 포함
		System.out.println((this.left + this.right + base) / 2);
	}
}

public class ClassEx2 {
	public static void main(String[] args) {
		Class2 c1 = new Class2();
		c1.setOperands(10, 20);
		
		// 30 출력
		c1.sum();
		
		Class2 c2 = new Class2();
		c2.setOperands(20, 40);
		
		// 60출력
		c2.sum();
		
		// 클래스 변수 base의 값을 10으로 지정
		Class2.base = 10;
		
		// 40출력
		c1.sum();
		
		// 70출력
		c2.sum();
				
	}

}
