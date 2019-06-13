package object;

class Calculator1 {
	int left, right;
	
	public Calculator1(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left + this.right);
	}
	
	public void avg() {
		System.out.println((this.left + this.right) / 2);
	}
}

public class CalculatorInstanceEx1 {    				// 자바는 내부적으로 클래스와 똑같은 이름의 메소드를
													 	// 자동으로 만들어 줌
	public static void main(String[] args) {			// 없으면 자동으로 만들고, 있으면 내가 만든 것을 사용
		Calculator1 c1 = new Calculator1(10, 20);
		c1.sum();              // (인스턴스) 생성자
		c1.avg();
		
		Calculator1 c2 = new Calculator1(20, 40);
		c2.sum();
		c2.avg();
	}

}
