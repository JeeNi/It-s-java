package operator;

public class ConditionalOperationEx{
    public static void main(String[] args) {


        //삼항 연산자는 ? 앞의 조건식에 따라 콜론(:) 앞뒤의 
        //피연산자를 선택하여 true와 false를 나누는 조건 연산식
        
        int score = 85;
        char grade = (score > 90) ? 'A' : ( (score > 80) ? 'B' : 'C');
        System.out.println(score + "점은" + grade + "등급입니다.");

        //85점은B등급입니다.

    }
}
