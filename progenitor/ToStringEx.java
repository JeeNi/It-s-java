package progenitor;

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
	public String toString() {
		//return "left :" + this.left + ", right :" + this.right;
		return super.toString() + ",left : " + this.left + ",right : " + this.right;
	}
}

public class ToStringEx {
	public static void main(String[] arg) {
		Calculator c1 = new Calculator();
		c1.setOperands(10, 20);
		System.out.println(c1);
		System.out.println(c1.toString());
		// toString을 직접 호출하지 않아도 어떤 객체를 
		// System.out.print로 호출하면 자동으로 toString이 호출되도록 약속
	}
}
