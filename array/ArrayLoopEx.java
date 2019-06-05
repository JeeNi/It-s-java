package array;

public class ArrayLoopEx {

	public static void main(String[] args) {
		
		String[] members = {"최진혁", "최유빈", "한이람"};
		
		/*
		for(int i = 0; i < members.length; i++) {
			String member = members[i];
			
		*/
		for (String e: members) {						// members의 값을 변수 e에 담아
			System.out.println(e + "이 상담을 받았습니다");		// 중괄호 구간 안으로 전달
		}
	}

}
