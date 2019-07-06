package collection;

import java.util.*;

class Computer implements Comparable {
	int serial;
	String owner;
	
	Computer(int serial, String owner) {
		this.serial = serial;
		this.owner = owner;
	}
	public int compareTo(Object o) {					// a.compareTo(b)
		return this.serial - ((Computer)o).serial;		// 0: a와 b가 같은 경우
	}													// 양수: a가 b보다 클 경우
	public String toString() {						 	// 음수: b가 a보다 클 경우
		return serial + " " + owner;					// compareTo() 메소드를 구현한다는 것은
	}													// Computer가 가진 serial, owner 등 여러 속성 가운데
}														// 무엇을 기준으로 크고 작은 것을 분별할 것인지 결정 한다는 것
public class CollectionsEx {
	public static void main(String[] args) {
		List<Computer> computers = new ArrayList<Computer>();
		
		computers.add(new Computer(500, "JeeNi"));
		computers.add(new Computer(200, "Leezche"));
		computers.add(new Computer(3233, "graphittie"));
		
		Iterator i = computers.iterator();
		System.out.println("before");
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		Collections.sort(computers);
		System.out.println("\nafter");
		i = computers.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
