package exception;

class Calculator {
	int left, right;
	
	public void setOperands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void divide() {
	try {	
		System.out.println("계산결과는");
		System.out.println(this.left / this.right);
		System.out.println("입니다.");
	} catch (Exception e) {
		System.out.println("\n\ne.getMessage()\n" + e.getMessage());
	}
		//System.out.println("오류가 발생했습니다  : "+ e.getMessage());
		/*
		System.out.println("\n\ne.getMessge()\n" + e.getMessage());
		System.out.println("\n\ne.toString()\n" + e.toString());
		System.out.println("\n\ne.printStackTrace()");
		e.printStackTrace();
     	}
     	*/
		System.out.println("Divide End");
	}
}

public class CalculatorEx1 {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.setOperands(10, 0);
		c1.divide();
		
		/*
		Calculator c2 = new Calculator();
		c2.setOperands(10, 5);
		c2.divide();
		*/
	}

}
