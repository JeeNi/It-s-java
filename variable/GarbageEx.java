package variable;

public class GarbageEx {
    public static void main(String[] args) {
        
        //저장할 수 있는 값의 범위를 초과하면 엉터리 값이 생김
        //이러한 값을 쓰레기값이라 함

        byte var1 = 125;
        int var2 = 125;

        for(int i = 0; i < 5; i++) {
            var1++;
            var2++;
            System.out.println("var1: " + var1 + "\t" + "var2: " + var2);

            //"\t"는 tab만큼 칸을 띄워주는 역할

            /*
            var1: 126	var2: 126
            var1: 127	var2: 127
            var1: -128	var2: 128     //byte 변수는 127을 넘어서는 순간 최소값인 -128부터 다시 저장
            var1: -127	var2: 129     //int 변수는 정사적으로 1 증가
            var1: -126	var2: 130
            */
            
        }
        
    }
}