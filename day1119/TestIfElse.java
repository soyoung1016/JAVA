package day1119;

/**
 * if-else : �� �� �ϳ��� �ڵ带 �����ؾ��� �� ���<br>
 * ����) if(���ǽ�){<br>
 * 			���ǿ� ���� �� ������ �����;<br>
 * 		} else {<br>
 * 			���ǿ� ���� ���� �� ������ �����;<br>
 * 		}
 * @author owner
 */
public class TestIfElse {
	
	public static void main(String[] args) {
		int i = 19;
		//������ �����ϴ� ���� �������� ��������� �Ǵ�
		
		System.out.print(i+"��(��)");
		if(i<0) {
			System.out.println("����");
		} else {
			System.out.println("���");
		}//end if
		
		
		//������ �����ϴ� ���� Ȧ������ ¦�������� �Ǵ�
		//�����ϴ� ����� �� ���̶�� {�� ������ �� �ִ�.
		if (i%2==0) {
			System.out.println("¦��");
		} else { 
			System.out.println("Ȧ��");
		}//end if
			
		
		//�Է��ϴ� ���� 3�� ������ "¦"�� ����ϰ� �׷��� �ʴٸ� �Է��� ���� ����ϼ���.
		int a = Integer.parseInt(args[0]);
		
		if (a%3==0) {
			System.out.println("¦");
		} else {
			System.out.println(a);
		}//end if
		

	}//main

}//class
