package progenitor;

class Student {
	String name;
	Student(String name) {
		this.name = name;
	}
	public boolean equals(Object obj) {
		Student _obj = (Student)obj;
		return name == _obj.name;
	}
}

		// 객체 간의 동일성을 비교하고 싶을 때는 ==를 사용하지 말고 equals를 이용
		// equals를 직접 구현해야 한다면 hashCode도 함께 구현해야 함을 알자
		// 그 이유가 분명하지 않다면 비교 연산자 ==은 원시 데이터형을 비교할 때만 사용

class EqualsEx {
	public static void main(String[] arg) {
		Student s1 = new Student("JeeNi");
		Student s2 = new Student("JeeNi");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}

}
