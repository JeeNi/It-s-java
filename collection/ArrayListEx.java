package collection;

import java.util.ArrayList;

public class ArrayListEx {
	public static void main(String[] arg) {
		String[] arrayObj = new String[2];
		arrayObj[0] = "one";
		arrayObj[1] = "two";
		// arrayObj[2] = "three"; 오류가 발생한다.
		for (int i=0; i<arrayObj.length; i++) {
			System.out.println(arrayObj[i]);
		}
		
		//ArrayList al = new ArrayList();
		ArrayList<String> al = new ArrayList<String>(); // al을 통해 ArrayList에 추가되는 값이
		al.add("one");									// String 타입임을 제네릭을 통해 지정
		al.add("two");
		al.add("three");
		for (int i=0; i<al.size(); i++) {
			//System.out.println(al.get(i));
			
			String val = al.get(i);
			System.out.println(val);
			
			//String val = (String)al.get(i);
			//System.out.println(val);			// ArrayList를 사용할 경우 add() 메소드로 값을 가져올 때
		}										// 그 값을 원래의 데이터 타입으로 형변환해야 하는 제약사항이 있음
	}

}
