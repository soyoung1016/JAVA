package day1121;

/**
 * while : ���۰� ���� �𸦶� ����ϴ� �ݺ���<br>
 * 			�ּ� 0�� ����, �ִ� ���Ǳ��� ����<br>
 * ����)
 * 	while (���ǽ�) { <br>
 * 		�ݺ����๮��;<br>
 * 	}
 * @author owner
 */
public class TestWhile {

	public static void main(String[] args) {
		int i=0; //�ʱⰪ
		
		while(i<10) { //���ǽ�
			System.out.println("i="+i); //�ݺ����� ����
			i++; //������
		}//end while
		
		System.out.println("------------------------------------");
		
		
		//���� �Է¹޾� 2~9�� ���̶�� ������ ���
		int a = Integer.parseInt(args[0]);
		int j = 1;
		
		while(0<a&&a<10) {
			System.out.println(a+" * "+j+" = "+a*j);
			j++;
			if(j>9) {
				break;
			}
		}
		
		//���� loop
		i=0;
		while(true) {
			System.out.println("���� loop");
			if(i==5) {
				break;
			}
			i++;
		}
		
	}//main

}//class
