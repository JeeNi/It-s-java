package overriding;



class Calculator {
    int left, right;
 
    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }
 
    public int avg() {
    	//System.out.println(this.left + this.right);
        return ((this.left + this.right) / 2);
    }
}
 
class SubstractionableCalculator extends Calculator {
     
    public void sum() {
        System.out.println("실행 결과는 " +(this.left + this.right)+"입니다.");
        
        // 실행 결과는 c1.sum이 상위 클래스의 메소드가 아닌
        // 하위 클래스의 메소드 sum을 실행함
        
        // 하위 클래스 입장에서 부모 클래스란, 기본적인 동작 방법을 정의한 것
        // 하위 클래스에서 상위 클래스와 동일한 메소드를 정의하면, 부모 클래스로부터
        // 물려 받은 기본 동작 방법을 변경하는  효과
        
        // 기본 동작은 폭넓게 적용되고, 예외적인 동작은 더 높은 우선순위를 갖게 함
        
    }
    
    //public int avg() {
    //public int avg() {
    	//return ((this.left + this.right) / 2);
    public int avg() {
    	return super.avg();
    	
    	// 오류
    	// avg는 리턴 타입이 void 이지만 상속 클래스의 리턴 타입은 int임 
    	// 상위 클래스의 코드를 변경
    	
    	// 두번 째도 오류
    	// 상위와 하위 클래스의 코드가 중복되기 때문
    	// 중복은 제거 되어야 하기에 super를 사용
    	
    	// 세번 째는 avg에서 상위 클래스의 메소드를 호출하기 위해 super 사용
    	// 코드 중복 제거
    	
    	// 이처럼 부모 클래스의 기능을 변경할 수 있는 방법이 오버라이딩

    }
     
    public void substract() {
        System.out.println(this.left - this.right);
    }
}
 
public class OverridingCalculatorEx1 {
    public static void main(String[] args) {
        SubstractionableCalculator c1 = new SubstractionableCalculator();
        c1.setOprands(10, 20);
        c1.sum();
        System.out.println("실행 결과는" + c1.avg());
        c1.substract();
    }
}
