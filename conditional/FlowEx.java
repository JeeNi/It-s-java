package conditional;

import java.util.*;

public class FlowEx {
    public static void main(String[] args) {
        

        /*
        for(int i = 1; i<= 5; i++){
            for(int j = 1; j<=10; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        */

        int num = 0;

        System.out.print("*�� ����� ������ ���� �Է��ϼ���.>");

        Scanner scanner = new Scanner (System.in);
        String tmp = scanner.nextLine();               //ȭ���� ���� �Է¹��� ������ tmp�� ����
        num = Integer.parseInt(tmp);                   //�Է¹��� ���ڿ� (tmp)�� ���ڷ� ��ȯ

        
        for(int i = 0; i<num; i++){
           
            for(int j = 0; j<=i; j++){
            
                System.out.print("*");

            }
            System.out.println();
        }
    }
}