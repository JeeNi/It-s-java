package exception;

// class DivideException extends RuntimeException {
class DivideException extends Exception {
	DivideException() {
		super();
	}
	DivideException(String message) {
		super(message);
	}
}
class Calculator {
	int left, right;
	public void setOperands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	/*
	public void divide() {
		if(this.right == 0) {
			throw new DivideException("0으로 나누는 것은 허용되지 않습니다.");
		}
		System.out.println(this.left / this.right);
	}
	*/
	
	/*
	public void divide() {
		if(this.right == 0) {
			try {
				throw new DivideException("0으로 나누는 것은 허용되지 않습니다.");
			} catch (DivideException e) {
				e.printStackTrace();
			}
		}
		System.out.println(this.left / this.right);
	}
	*/
	
	public void divide() throws DivideException {
		if(this.right == 0) {
			throw new DivideException("0으로 나누는 것은 허용되지 않습니다.");
		}
		System.out.println(this.left / this.right);
	}
	
}

public class CalculatorEx3 {
	public static void main(String[] arg) {
		Calculator c1 = new Calculator();
		c1.setOperands(10, 0);
		try {
			c1.divide();
		} catch (DivideException e) {
			e.printStackTrace();
		}
	}
}
