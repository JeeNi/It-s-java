package generic;

/*
class StudentInfo {
	public int grade;
	
	StudentInfo(int grade) {
		this.grade = grade;
	}
}
class StudentPerson {
	public StudentInfo info;
	StudentPerson(StudentInfo info){
		this.info = info;
	}
}
class EmployeeInfo {
	public int rank;
	EmployeeInfo(int rank) {
		this.rank = rank;
	}
}
class EmployeePerson {
	public EmployeeInfo info;
	EmployeePerson(EmployeeInfo info) {
		this.info = info;
	}
}
public class GenericEx2 {
	public static void main(String[] args) {
		StudentInfo si = new StudentInfo(2);
		StudentPerson sp = new StudentPerson(si);
		System.out.println(sp.info.grade);   // 2
		
		EmployeeInfo ei = new EmployeeInfo(1);
		EmployeePerson ep = new EmployeePerson(ei);
		System.out.println(ep.info.rank);   // 1
	}
}
*/

class StudentInfo {
	public int grade;
	
	StudentInfo(int grade) {
		this.grade = grade;
	}
}
class EmployeeInfo {
	public int rank;
	
	EmployeeInfo(int rank) {
		this.rank = rank;
	}
}
class Person {
	public Object info;
	
	Person(Object info) {
		this.info = info;
	}
}
public class GenericEx2 {
	public static void main(String[] arg) {
		Person p1 = new Person("∫Œ¿Â");
		EmployeeInfo ei = (EmployeeInfo)p1.info;
		System.out.println(ei.rank);
	}
}