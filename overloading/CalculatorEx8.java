package overloading;

class calculator{
	int left, right;
	int third = 0;
	
	public void setOperands(int left, int right) {
		System.out.println("setOperands(int left, int right)");
		this.left = left;
		this.right = right;
	}
	
	public void setOperands(int left, int right, int third) {
		System.out.println("setOperands(int left, int right, int third)");
		this.setOperands(left,  right);
		// this.left = left;
		// this.right = right;
		this.third = third;
	}
	
	public void sum() {
		System.out.println(this.left + this.right + this.third);
	}
	
	public void arg() {
		System.out.println((this.left + this.right + this.third) / 3);
	}
}


public class CalculatorEx8 {

	public static void main(String[] args) {
		calculator c1 = new calculator();
		c1.setOperands(10, 20);
		c1.sum();
		c1.arg();
		c1.setOperands(10, 20, 30);
		c1.sum();
		c1.arg();
	}

}
