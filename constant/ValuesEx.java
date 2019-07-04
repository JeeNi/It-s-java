package constant;

enum Fruit{
    APPLE("red"), PEACH("pink"), BANANA("yellow");
	
    private String color;
    
    Fruit(String color){
        System.out.println("Call Constructor "+this);
        this.color = color;
    }
    
    String getColor(){
        return this.color;
    }
}
 
enum Company{
    GOOGLE, APPLE, ORACLE;
}
 
public class ValuesEx {
     
    public static void main(String[] args) {
        for(Fruit f : Fruit.values()){					// for 문에 ":"가 있는 것이 foreach 구문
            System.out.println(f+", "+f.getColor());
        }
    }
}
