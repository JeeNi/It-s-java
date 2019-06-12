package scope;

public class ScopeEx1 {

	static void a() {
		String title = "coding everybody";
	}
	
	// title이 a() 메소드 안에 있으면 
	// main 메소드 입장에서는 존재하지 않는 것과 다름 없음
	
	public static void main(String[] args) {
		a();
		// System.out.println(title);
	}

}
