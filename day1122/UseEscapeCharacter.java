package day1122;

/**
 * Ư������ : ���ڿ��� \�� �����ϴ� ����� ���� ����
 * @author owner
 */
public class UseEscapeCharacter {

	public static void main(String[] args) {
		System.out.println("��\t�ҿ�"); //\t : tab
		System.out.println("��\t\t�ҿ�");
		System.out.println("��\n�ü�"); //\n : newline
		System.out.println("��\r�ü�"); //\r : return(Ŀ���� ������������ ���� �ٲ�)
		System.out.println("��\r�ü�"); //\r : return(Ŀ���� ������������ ���� �ٲ�)
		System.out.println("������ \"�޿���\" �Դϴ�."); //\" : "
		System.out.println("������ \'�޿���\' �Դϴ�."); //\' : '
		System.out.println("C:\\dev\\workspace\\javase_prj\\src\\day1122\\Test.java"); // \�� ������ \�� �Ἥ Ư�����ڰ� �ƴ϶�� ǥ��
		//System.out.println("C:/dev/workspace/javase_prj/src/day1122/Test.java");// /�� �׳� ����
		System.out.println("������\b");
		System.out.println("������\f");
		

	}//main

}//class
