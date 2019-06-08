package method;

public class ReturnEx2 {
	
	public static String[] getMembers() {
		
		// 메소드 안에 members라는 변수를 정의(그 변수는 문자열을 담을 수 있는 배열)
		// 각 이름들을 members라는 변수에 담음
		String[] members = {"최진혁", "최유빈", "한이람"};
		
		// return에서 members를 반환
		return members;
	}
	
	public static void main(String[] args) {
		String[] members = getMembers();
	}
}
	
	
	
	/*
	public static String getMember1() {
		return "최진혁";
	}
	
	public static String getMember2() {
		return "최유빈";
	}
	
	public static String getMember3() {
		return "한이람";
	}
	
	public static void main(String[] args) {
		System.out.println(getMember1());
		System.out.println(getMember2());
		System.out.println(getMember3());
	}
	*/


