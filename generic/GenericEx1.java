package generic;

class Person<T> {
	public T info;
}

public class GenericEx1 {
	public static void main(String[] arg) {
		Person<String> p1 = new Person<String> ();
		Person<StringBuilder> p2 = new Person<StringBuilder> ();
	}
}
