package variable;

public class LongEx {
    public static void main(String[] args){

        //저장할 수 있는 값의 범위는 -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807

        //int 타입의 저장 범위를 넘어서는 큰 정수는 반드시 소문자 'l' or 대문자 'L'을 붙임
        //bcuz 컴파일 에러 발생 (보통 대문자 'L' 사용, 이는 숫자 '1'과 혼돈 됨)

        long var1 = 10;
        long var2 = 20L;
        //long var3 = 1000000000000;  //컴파일 에러  //정수 리터럴에 'L'을 붙이지 않음
        long var4 = 1000000000000L;

        System.out.println(var1);     //10
        System.out.println(var2);     //20
        System.out.println(var4);     //1000000000000
        

    }
}
