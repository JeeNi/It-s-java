package variable;

public class CastingEx {
    public static void main(String[] args){
        
        //캐스팅 연산자 ()를 사용 -> 괄호 안에 들어가는 타입을 쪼개는 단위
        //int 타입은 char 타입으로 자동 변환되지 않음
        
        //실수 타입(float, double)은 정수 타입(byte, short, int, long)으로 자동 변환 안 됨
        //소수점 이하 부분은 버려지고, 정수 부분만 저장
        
        int intValue = 44032;
        char charValue = (char) intValue;
        
        System.out.println(charValue);

        long longValue = 500;
        intValue = (int) longValue;

        System.out.println(intValue);

        double doubleValue = 3.14;
        intValue = (int) doubleValue;    //intValue는 정수 부분인 3만 저장된다

        System.out.println(intValue);


        //가, 500, 3

    }
}