package finals;

class Calculator{
	static final double PI = 3.14;
	
	// "공통적"이라는 부분에서 static을 쓸 수 있는데 "바뀌지 않는"에 대한 문법적인 또는 기능적인 지원이 없음
	// 이 말은 원한다면 PI 변수에 담긴 3.14 값을 사용하는 쪽에서 수정할 수 있음
	// 이 때 사용하는 것이 final
	// 필드에 final을 지정하면 3.14라는 값이 지정된 PI 값은 바꿀 수 없는 상수가 됨
	
	int left, right;
	
	public void setOperands(int left, int right) {
		this.left = left;
		this.right = right;
		//Calculator.PI = 6;   // 그래서 PI 값을 변경하려고 하기 때문에 오류가 남
	}
	
	public void sum() {
		System.out.println(this.left + this.right);
	}
	
	public void avg() {
		System.out.println((this.left + this.right) / 2);
	}
}

public class FinalEx1 {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		System.out.println(c1.PI);
		//Calculator.PI = 10;  // 이 또한 오류가 남
	}

}
