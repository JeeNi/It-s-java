package variable;

public class CharEx {
    public static void main(String[] args){

        //저장할 수 있는 값은 0 ~ 65535

        //char 타입의 변수에는 음수 값을 저장할 수 없음
        //bcuz 유니코드는 음수가 없기 때문

        //char 타입의 변수는 단 하나의 문자만 저장
        //문자열을 저장하고 싶다면 String 타입을 사용

        //char 타입의 변수는 작은 따옴표(') 두개를 연달아 붙인 빈 문자를 대입하면 컴파일 에러 발생
        //그렇기 때문에 공백(유니코드:32) 하나를 포함해서 초기화 진행

        //하지만 String 변수는 큰 따옴표(") 두 개를 연달아 붙인 빈 문자를 대입해도 무방

        char c1 = 'A';              //문자를 직접 저장
        char c2 = 65;               //10진수로 저장
        char c3 = '\u0041';         //16진수로 저장

        char c4 = '가';             //문자를 직접 저장
        char c5 = 44032;            //10진수로 저장
        char c6 = '\uac00';         //16진수로 저장

        int uniCode = c1;           //유니코드 얻기

        System.out.println(c1);         //A 
        System.out.println(c2);         //A
        System.out.println(c3);         //A
        System.out.println(c4);         //가
        System.out.println(c5);         //가
        System.out.println(c6);         //가
        System.out.println(uniCode);    //65

    }
}
