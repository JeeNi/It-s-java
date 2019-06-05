package variable;

public class VariableEx1{
    public static void main(String[] args) {

        /*
        정수 리터럴_ 
        
        소수점이 없는 정수 리터럴 > 10진수
        ex) 0, 75, -100
        0으로 시작되는 리터럴 > 8진수
        ex) 02, -04
        0x or 0X로 시작하고 0~9 숫자나 A, B, C or a, b ,c로 구성된 리터럴 > 16진수
        ex) 0x5, 0xA, 0xB3, 0xAC08
        저장할 수 있는 타입은
        byte, char, shotr, int, long
        */

        /*
        실수 리터럴_
        소수점이 있는 리터럴 > 10진수 실수
        ex) 0.25, -3.14
        대문자 E or e가 있는 리터럴 > 10진수 지수와 가수
        ex) 5E7, -0.12E-5
        저장할 수 있는 타입은
        float, double
        */

        /*
        문자, 문자열 리터럴_
        작은 따옴표(')로 묶은 텍스트 > 문자 리터럴
        ex) 'A', '한', '\t', '\n'
        큰 따옴표(")로 묶은 텍스트 > 문자열 리터럴
        ex) "대한민국", "나는 JeeNi"
        저장할 수 있는 타입은
        String 하나뿐!
        */

        /*
        논리 리터럴_
        true, false
        저장할 수 있는 타입은
        boolean 하나뿐!
        */


        //10을 변수 value의 초기값으로 저장
        int value = 10;

        //변수 value 값을 읽고 10을 더하는 산술 연산을 수행
        //연산의 결과값을 변수 result의 초기값으로 저장

        int result = value + 10;


        //변수 result 값을 읽고 콘솔에 출력
        System.out.println(result);
        
    }
}