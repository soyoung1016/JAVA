package day1119;

/**
 * ���ǹ��� ���<br>
 * ���� if�� : ���ǿ� �´� ��쿡�� �ڵ带 �����ؾ��� ��<br>
 * ���� ) if(���ǽ�) {<br>
 * 			���ǿ� ���� �� ���� �����...;<br>
 * 		}
 * @author owner
 */
public class TestIf {
	
	//Constant : ������ ���ó�� ����� ��(���� �������� ���ϴ� ����)
	public static final int FLAG_VALUE=1250;
	public static final int FLAG_CNT=20;

	public static void main(String[] args) {
/*		
		int i = 10;
		
		if(i<0) {
			i = -i;
		}//end if

		System.out.println("i = "+i);
*/
		//�̸��� �Է¹޾� �̸��� "������"�̸� �̸��� ����ϱ� �� "����"�� ����ϰ�
		//�׷��� �ʴٸ� �̸��� ���
		
		if(args[0].equals("������")) {
			System.out.print("����");
		}//end if
		System.out.println(args[0]);
		
		//���������� ���ڿ��� ������ ��ȯ
		int i = Integer.parseInt(args[1]);
		int j = Integer.parseInt(args[2]);
		
		System.out.println(i+"+"+j+"="+(i+j));
		
		//args[3]�� �Է¹޾� �� ���� 20�̳���� 1250�� �Է¼��� ���Ͽ� ����ϰ�
		//20���� ũ�ٸ� 1250�� 10%�� ���� ���� �Է¼��� ���Ͽ� ���
		
		//constant�� �̿��ؼ� �ڵ��ۼ�, ���ʿ� ����
		//java day1119.TestIf ���ڿ� ���� ���� ����
		//						0	1  2  3
		int input_value=Integer.parseInt(args[3]);
		int sum=TestIf.FLAG_VALUE;
		
		if(input_value > FLAG_CNT) {
			sum=(int)(TestIf.FLAG_VALUE+TestIf.FLAG_VALUE*0.1);
		}//end if
		
			System.out.println(sum*input_value);

		
	}//main

}//class
