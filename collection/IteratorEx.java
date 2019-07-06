package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collection;

public class IteratorEx {
	public static void main(String[] args) {
		//HashSet<Integer> A = new HashSet<Integer> ();
		//ArrayList<Integer> A = new ArrayList<Integer> ();
		//Collection<Integer> A = new ArrayList<Integer> ();
		Collection<Integer> A = new HashSet<Integer> ();
		A.add(1);
		A.add(2);
		A.add(3);
		
		Iterator hi = A.iterator();
		while(hi.hasNext()) {
			System.out.println(hi.next());
		}

	}

}
