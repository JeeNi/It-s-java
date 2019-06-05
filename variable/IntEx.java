package variable;

public class IntEx {
    public static void main(String[] args){

        //저장할 수 있는 값의 범위는 -2,147,483,648 ~ 2,147,483,647
        
        //일반적으로 정수를 저장할 때는 int 타입을 사용!

        int var1 = 10;             //10진수로 저장
        int var2 = 012;            //8진수로 저장
        int var3 = 0xA;            //16진수로 저장


        System.out.println(var1);  //10
        System.out.println(var2);  //10 
        System.out.println(var3);  //10   //출력은 10진수로 됨

    }
}
