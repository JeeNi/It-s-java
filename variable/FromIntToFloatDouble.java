package variable;

public class FromIntToFloatDouble {
    public static void main(String[] args){

        
        /*
        int num1 = 123456780;
        int num2 = 123456780;
        float num3 = num2;
        num2 = (int) num3;
        int result = num1 - num2;
        System.out.println(result);
        */

        //-4
        //이는 int 값을 float 타입으로 자동 변환하면서 문제가 발생했기 때문
        //때문에 float 타입은 비트 수가 할당 되어 있음

        int num1 = 123456780;
        int num2 = 123456780;

        double num3 = num2;
        num2 = (int) num3;

        int result = num1 - num2;
        System.out.println(result);

        //0

    }
}
