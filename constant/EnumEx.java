package constant;

enum Fruit {
	APPLE("red"), PEACH("pink"), BANANA("yellow");
	
	//public String color;
	private String color;
	
	//Fruit() {
	Fruit(String color) {
		//System.out.println("Call Constructor");
		//System.out.println("Call Constructor" + this);
		System.out.println("Call Constructor" + this);
		this.color = color;
	}
	
	String getColor() {
		return this.color;
	}
}

enum Company {
	GOOGLE, APPLE, ORACLE;
		
		// enum을 통한 효과는 코드 단순화, 인스턴트의 생서과 상속을 방지
}

public class EnumEx {
	public static void main(String[] arg) {
		Fruit type = Fruit.APPLE;
		switch (type) {
		//case Fruit.APPLE:
		case APPLE:
			//System.out.println(57 + "kcal");
			//System.out.println(57 + "kcal, "+Fruit.APPLE.color);
			System.out.println(57 + "kcal, "+Fruit.APPLE.getColor());
			break;
		//case Fruit.PEACH:
		case PEACH:
			//System.out.println(34 + "kcal");
			//System.out.println(34 + "kcal, "+Fruit.PEACH.color);
			System.out.println(34 + "kcal, "+Fruit.PEACH.getColor());
			break;
		//case Fruit.BANANA:
		case BANANA:
			//System.out.println(93 + "kcal");
			//System.out.println(34 + "kcal, "+Fruit.BANANA.color);
			System.out.println(34 + "kcal, "+Fruit.BANANA.getColor());
			break;
			
			// case가 갖는 각 레이블은 switch 문으로 전달한 데이터 타입이 Fruit라는 사실을 switch 문에서 알기 때문에
			// 별도로 Fruit를 적지 않고 상수만 적음
		}
	}

}
