package exception;

class Calculator {
	int left, right;
	
	public void setOperands(int left, int right) {
		/*
		this.left = left;
		this.right = right;
		*/
		
		/*
		if(right == 0) {
			throw new IllegalArgumentException("두번째 인자의 값은  0이 될 수 없습니다.");
		}
		this.left = left;
		this.right = right;
		*/
		this.left = left;
		this.right = right;
	}
	
	public void divide() {
		/*
		try {
			System.out.println("계산결과는");
			System.out.println(this.left / this.right);
			System.out.println("입니다.");
		} catch (Exception e) {
			System.out.println("\n\ne.getMessage()\n" + e.getMessage());
			System.out.println("\n\ne.toString()\n" + e.toString());
			System.out.println("\n\ne.printStackTrace()");
			e.printStackTrace();
		}
		*/
		if(this.right == 0) {
			throw new ArithmeticException("0으로 나누는 것은 허용되지 않습니다.");
		}
		try {
			System.out.print("계산결과는 ");
			System.out.println(this.left / this.right);
			System.out.println(" 입니다.");
		} catch(Exception e) {
			System.out.println("\n\ne.getMessage()\n" + e.getMessage());
			System.out.println("\n\ne.toString()\n" + e.toString());
			System.out.println("\n\ne.printStackTrace()");
			e.printStackTrace();
		}
	}
}

public class CalculatorEx2 {
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.setOperands(10, 0);
		c1.divide();
	}
}
