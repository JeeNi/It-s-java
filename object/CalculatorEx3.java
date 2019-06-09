package object;

class Calculator{
	int left, right;
	
	public void setOperands(int left, int right) {
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

public class CalculatorEx3{
	public static void main(String[] arg) {
		Calculator c1 = new Calculator(); 			// 메소드가 아닌 new가 붙은 객체
		c1.setOperands(10,  20);
		c1.sum();
		c1.avg();
	}
}