package day1205;

import java.util.StringTokenizer;

/**
 * ���ڿ��� ª�� ����� �����ϴ� StringTokenizer�� ���
 * @author owner
 */
public class UseStringTokenizer {
	
	public UseStringTokenizer() {
		String msg = "������ ������ �Դϴ�. ������ -5�Դϴ�.";
		
		//�������� ���� : �Ű����� �ϳ��� ������ ���.
		StringTokenizer stk = new StringTokenizer(msg);
		
		System.out.println(stk.countTokens()+"��");
		
		//��ū�ִ�? ��! ���, ��ū�ִ�? ��! ���, . . . ��ū�ִ�? �ƴϿ�! ��
		while(stk.hasMoreTokens()) { //��ū�� ���� �ϴ��� //true == true ���������� �ڵ��̹Ƿ�? �ʹ� �翬�� �ڵ��̹Ƿ� ����~!
			System.out.println(stk.nextToken()); //��ū�� ��� �����͸� �������� �̵�
		}//end while
		
		String names = "������,������~���ü�,����ö.������~������,������";
		
		//Ư�� ���ڷ� ��ū ���� : �Ű����� �ΰ��� ������
		StringTokenizer stk1 = new StringTokenizer(names, "��");
		//StringTokenizer stk1 = new StringTokenizer(names, ",~"); //��ū 6�� �߾��� �Ǵµ�.
		//StringTokenizer stk1 = new StringTokenizer(names, ",~."); //�߾��� �Ǵµ�.
		System.out.println("-------------------------------");
		System.out.println("��ū�� �� : " + stk1.countTokens());
		
		while(stk1.hasMoreTokens()) { 
			System.out.println(stk1.nextToken());
		}
		
		//Ư�����ڷ� ��ū ����, ���е� ���ڿ��� ��ū���� ó�� : �Ű����� ������ ������
		System.out.println("-------------------------------");
		StringTokenizer stk2 = new StringTokenizer(names, ",.~",true);
		//true�� ��ū���� ó���� ���ڿ��� ��ū���� ó���Ѵ�.
		
		while(stk2.hasMoreTokens()) {
			System.out.println(stk2.nextToken());
		}
		
		
	}//UseStringTokenizer()

	public static void main(String[] args) {
		new UseStringTokenizer();
	}

}
