package generic;

class EmployeeInfo {
	public int rank;
	
	EmployeeInfo(int rank) {
		this.rank = rank;
	}
}
class Person<T, S> {				// 제네릭은 기본 테이터 타입이(int, char, double) 올 수 없음
	public T info;					// 기본 데이터 타입은  객체가 아님
	public S id;					// 래퍼(wrapper) 클래스를 사용하여 객체 처럼 다루면 됨
	
	Person(T info, S id) {
		this.info = info;
		this.id = id;
	}
	public <U> void printInfo(U info) {		// 메소드 안에서 U로 지정된 데이터 타입이 바로 info 매개변수의 제네릭 타입이 된다는 뜻
		System.out.println(info);
	}
}

public class GenericEx3 {
	public static void main(String[] args) {
		//Person<EmployeeInfo, Integer> p1 =
				//new Person<EmployeeInfo, Integer>(new EmployeeInfo(1), 1);
											// 그래서 int에 해당하는 부분을 int의 래퍼 클래스의 Integer로 대체한 것
		/*
		EmployeeInfo e = new EmployeeInfo(1);
		Integer i = new Integer(1);
		Person<EmployeeInfo, Integer> p1 =
				new Person<EmployeeInfo, Integer>(e, i);
		System.out.println(p1.id.intValue());
		*/
		/*
		EmployeeInfo e = new EmployeeInfo(1);
		Integer i = new Integer(10);
		Person<EmployeeInfo, Integer> p1 =
				new Person<EmployeeInfo, Integer>(e, i);
		System.out.println(p1.id.intValue());
		*/
		EmployeeInfo e = new EmployeeInfo(1);
		Integer i = new Integer(10);
		Person<EmployeeInfo, Integer> p1 =
				new Person<EmployeeInfo, Integer>(e, i);
		p1.<EmployeeInfo>printInfo(e);
		p1.printInfo(e);
	}
}