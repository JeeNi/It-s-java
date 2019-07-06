package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class SetEx {
	public static void main(String[] arg) {
		/*
		//HashSet<Integer> A = new HashSet<Integer> ();
		ArrayList<Integer> A = new ArrayList<Integer> ();
		A.add(1);
		A.add(2);						// List는 추가하는 모든 값이 들어감
		A.add(2);						// Set은 중복되는 값은 들어가지 않고 고유한 값만 저장
		A.add(2);
		A.add(2);
		A.add(3);
		*/
		
		HashSet<Integer> A = new HashSet<Integer> ();
		A.add(1);
		A.add(2);
		A.add(3);
		HashSet<Integer> B = new HashSet<Integer> ();
		B.add(3);
		B.add(4);
		B.add(5);
		HashSet<Integer> C = new HashSet<Integer> ();
		C.add(1);
		C.add(2);
		
		System.out.println(A.containsAll(B));   // false   // A 집합에 B 집합의 전체 원소가 모두 담겨있는 확인하는 역할
		System.out.println(A.containsAll(C));	// true	   	
		
		//A.addAll(B);				// A 집합에  B 집합을 합쳐서 A로 만든다는 뜻
		//A.retainAll(B);			// retain은 '간직하다' 그래서 A 집합에도 있고 B 집합에도 있는 값만 A에 담겠다는 뜻 (교집합)
		A.removeAll(B);
		
		Iterator hi = A.iterator();
		while (hi.hasNext()) {
			System.out.println(hi.next());			// List에는 추가한 모든 값이 들어감, Set은 집합이기에 중복되는 값은 들어가지 않음
		}											// List의 값은 순서대로 저장, Set에서는 값들이 순서대로 저장되는 것이 보장되지 않음
	}
}
