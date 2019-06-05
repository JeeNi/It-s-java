package variable;

public class PromotionEx {
    public static void main(String[] args){ 

        //작은 크기를 가지는 타입이 큰 크기를 가지는 타이베 저장될 때 발생
        //음수가 저장될 수 있는 byte 탑을 char 타입으로 자동 변환시킬 수 없음

        byte byteValue = 10;
        int intValue = byteValue;          //int <- byte

        System.out.println(intValue);

        char charValue = '가';
        intValue = charValue;              //int <- char

        System.out.println("가의 유니코드=" + intValue);

        intValue = 500;
        long longValue = intValue;         //long <- int
        System.out.println(intValue);

        intValue = 200;
        double doubleValue = intValue;     //double <- int
        System.out.println(doubleValue);

        
        //10, 가의 유니코드=44032, 500, 200.0

    }
}
