package day1122;

/**
 * ��� method
 * @author owner
 */
public class UsePrintf {

	public static void main(String[] args) {
//		System.out.printf("����%d",11);
//		System.out.format("����%d",11);
		//format�̵� printf�� ���� �ٲ��� ����. �ڿ� ���� \n�� ����Ͽ� ���� �ٲ��־�� �Ѵ�.
		
		System.out.printf("����[%d][%5d][%-5d]\n", 123,123,123);
		System.out.printf("����[%c][%5c][%-5c]\n", 'A','B','C');
		System.out.printf("���ڿ�[%s][%10s][%-10s]\n", "A","B","C");
		System.out.printf("�Ǽ�[%.2f][%5.2f][%-5.2f]\n", 3.141592, 3.141592, 3.141592);
		
		System.out.printf("������ %d��%d��%d�� %s���� �÷��� %.2f �Դϴ�.",2018,11,22,"��",1.5);//�ڸ����� ���ڶ�� 0���� ä������ ����
		
	}//main

}//class
