package variable;

public class CheckValueBeforeCasting {
    public static void main(String[] args){

        //��ȯ �� Ÿ���� �ּҰ��� �ִ밪�� ������� �ݵ�� �˻�
        //���� ����ٸ� Ÿ�� ��ȭ�� ���� ����!

                int i = 128;

        if( (i<Byte.MIN_VALUE) || (i>Byte.MAX_VALUE)) {
            System.out.println("byte Ÿ������ ��ȯ�� �� �����ϴ�.");
            System.out.println("���� �ٽ� Ȯ���� �ּ���");

        } else {
            byte b = (byte) i;
            System.out.println(b);

        }

    }
}