package day1119;

/**
 * switch ~ case : ������ ���� ��(JDK1.7�������ʹ� ���ڿ��� �� ����)<br>
 * ����) switch(������) {
 * 			case ��� : ���๮��;
 * 			case ��� : ���๮��;
 * 			.<br>
 * 			.<br>
 * 			default : ��ġ�ϴ� ����� ���� �� ���๮��;<br>
 * 		}
 * @author owner
 */
public class TestSwitchCase {

	public static void main(String[] args) {
		int i = 0;
		
		switch (i) {//switch�� �ԷµǴ� ������ ���������� byte, short, int, char, String
		//case�� �ԷµǴ� ������ ���� �ٸ� ������ ������.
		case 0 : System.out.println("����");
		case 1 : System.out.println("��ħ");
		case 2 : System.out.println("����");
		//������ ���������� char�� ��� ���̽� �� ����� char�� ���� ���ڷ� �����Ѵ�.
		//1�� '1'�� �ٸ���. char i = '1'�� ���, 1�� unicode�� 49�� ����.
		//�׷� ��� case 49�� �����Ƿ� �ٷ� default�� �� ó���ȴ�.
		//String i = "1"�� ���� case "1"�� �񱳰� �ȴ�.
		
		default : System.out.println("����");
		}//end switch
	}//main

}//class
