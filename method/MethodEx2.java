package method;

public class MethodEx2 {

	public static String numbering (int init, int limit) {
		int i = init;
		
		// 만들어 지는 숫자를 output 변수에 담기 위해
		// 변수에 빈 값을 할당
		String output = "";
		while (i < limit) {
			// 숫자를 화면에 출력하는 대신 output 변수에 담음
			output += i;
			i++;
			
		}
		// **중요
		// output에 담긴 문자열은 메소드 외부로 반환하려면
		// 아래와 같이 return 키워드 뒤에 반환하려는 값을 배치
		return output;
		
	}
	
	public static void main(String[] args) {
		// numbering 메소드가 반환한 값이 result 변수에 담김
		String result = numbering (1, 5);
		// result 변수의 값을 화면에 출력
		System.out.println(result);
		// mail(result);
		// file(result);
	}

}
