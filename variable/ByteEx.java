package variable;

public class ByteEx{
    public static void main(String[] args){
        
        //byte 타입은 색상 정보 및 파일 또는 이미지 등의 이진(바이너리) 데이터를 처리할 때로 사용
        //저장할 수 있는 값의 범위는 -128 ~ 127
        //실행 중, 저장할 수 있는 값의 범위를 초과하면 최소값 부터 다시 반복 저장
        //다른 정수 타입 또한 이와 같은 방식으로 처리

        byte var1 = -128;
        byte var2 = -30;
        byte var3 = 0;
        byte var4 = 30;
        byte var5 = 127;
        //byte var6 = 128; //컴파일 에러

        System.out.println(var1);    //-128
        System.out.println(var2);    //-30   
        System.out.println(var3);    //0   
        System.out.println(var4);    //30
        System.out.println(var5);    //127
        


    }
    
}
