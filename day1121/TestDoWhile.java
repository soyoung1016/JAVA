package day1121;

/**
 * do ~ while : ���۰� ���� �� �� ����ϴ� �ݺ��� <br>
 * 				�ּ� 1�� ����, �ִ� ���Ǳ��� ����<br>
 * ����)
 * 		do { <br>
 * 			�ݺ����๮��;<br>
 * 		} while(���ǽ�);
 * 
 * @author owner
 */
public class TestDoWhile {

	public static void main(String[] args) {
		
		int i = 0; //�ʱⰪ
		
		do {
			System.out.println("i="+i); //�ݺ����๮��
			i++; //������
		} while(i<10);
		
		//�ԷµǴ� ������ ������ ���
		i=Integer.parseInt(args[0]);
		
		if(i>1&&i<10) {
			System.out.println(i+"��");
			int j=1;
			do {
				System.out.println(i+" x "+j+" = "+i*j);
				j++;
			} while(j<10);
		} else {
			System.out.println("���� 2�ܿ��� 9�ܱ����� �Է����ּ���.");
		}
	}//main

}//class
