package generic;

/*
abstract class Info {
	public abstract int getLevel();
}

class EmployeeInfo extends Info {
	public int rank;
	
	EmployeeInfo(int rank) {
		this.rank = rank;
	}
	public int getLevel() {
		return this.rank;
	}
}
class Person<T extends Info> {
	public T info;
	
	Person(T info) {
		this.info = info;
	}
}

public class GenericEx4 {
	public static void main(String[] args) {
		Person p1 = new Person(new EmployeeInfo(1));
		Person<String> p2 = new Person<String>("부장");
	}
}
*/

interface Info {
	int getLevel();
}
class EmployeeInfo implements Info {
	public int rank;
	
	EmployeeInfo(int rank) {
		this.rank = rank;
	}
	public int getLevel() {
		return this.rank;
	}
}
class Person<T extends Info> {     // extends가 제네릭 맥락에서 사용될 때는 '부모가 누구다'라는 것을 의미
	public T info;				   // super도 있지만 활용도가 높지 않음
								   // extends와는 반대로 부모를 제한
	Person(T info) {			   // 여기서 <T extends Info>를 제거하면 <T extends Object>와 같아서 에러 발생
		this.info = info;
	}
}
public class GenericEx4 {
	public static void main(String[] arg) {
		Person p1 = new Person(new EmployeeInfo(1));
		Person<String> p2 = new Person<String>("부장");
	}
}