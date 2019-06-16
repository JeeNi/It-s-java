package inheritance;

class Calculator {
    int left, right;
     
    public Calculator(){}
     
    public Calculator(int left, int right){
        this.left = left;
        this.right = right;
    }
     
    public void setOprands(int left, int right) {
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
class SubstractionableCalculator extends Calculator {
    public SubstractionableCalculator(int left, int right) {
        super(left, right);				// super는 부모 클래스를 의미 // this가 자기 자신을 의미하는 것과 같은 원리
    }									// super라고 쓰고 괄호가 붙어있으면 부모 클래스의 생성자를 의미
    									// 하위 클래스의 초기화 코드를 super 보다 먼저 등장시키면 안됨 
    public void substract() {			// 하위 클래스가 만들어진다는 것은 상위 클래스가 이미 인스턴트화 됐다는 뜻이기 때문에, 상위 클래스의 생성자를 호출한 다음에 나타나야함
        System.out.println(this.left - this.right);
    }
}
 
public class CalculatorConstructorDemo5 {
    public static void main(String[] args) {
        SubstractionableCalculator c1 = new SubstractionableCalculator(10, 20);
        c1.sum();
        c1.avg();
        c1.substract();
    }
}
