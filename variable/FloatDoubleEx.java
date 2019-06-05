package variable;

public class FloatDoubleEx {
    public static void main(String[] args){

        //자바는 실수 리터럴의 기본 타입을 double로 간주
        //float 보다 double이 더 정밀한 값을 저장함

        //bcuz 실수 리터럴을 float 타입 변수에 그냥 저장할 수 없음
        //float 타입 변수를 저장하려면 소문자'f'나 대문자'F'를 붙여야 함


        //실수값 저장
        double var1 = 3.14;
        //float var2 = 3.14;    //컴파일 에러(Type mismatch)
        float var3 = 3.14F;

        //정밀도 테스트
        double var4 = 0.1234567890123456789;
        float var5 = 0.1234567890123456789F;

        System.out.println("var1: " + var1);     //var1: 3.14
        System.out.println("var3: " + var3);     //var3: 3.14
        System.out.println("var4: " + var4);     //var4: 0.12345678901234568  //float보다 정밀함
        System.out.println("var5: " + var5);     //var5: 0.12345679

        //e 사용하기
        int var6 = 3000000;                      
        double var7 = 3e6;
        float var8 = 3e6F;
        double var9 = 2e-3;
        System.out.println("var6: " + var6);     //var6: 3000000
        System.out.println("var7: " + var7);     //var7: 3000000.0
        System.out.println("var8: " + var8);     //var8: 3000000.0
        System.out.println("var9: " + var9);     //var9: 0.002

    }
}
