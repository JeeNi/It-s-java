package object;

class Class3 {
	public static void sum(int left, int right) {
		System.out.println(left + right);
	}
	
	public static void avg(int left, int right) {
		System.out.println((left + right) / 2);
	}

}

public class ClassEx3{
	public static void main(String[] args) {
		Class3.sum(10, 20);
		Class3.avg(10, 20);
		Class3.sum(20, 40);
		Class3.avg(20, 40);
	}
}
