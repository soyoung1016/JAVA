package day1115;
/*
	����(����)������
*/

class Operator6 {
	public static void main(String[] args) {
		int i = 11;
		System.out.println(i+"��(��) "+(i>=0? "���":"����"));

		//i = 0;
		//System.out.println(i+"��(��) "+(i>=0? "���":"����"));

		//i = -1;
		//System.out.println(i+"��(��) "+(i>=0? "���":"����"));

		//����
		System.out.println(i+"�� ���밪 "+ (i>=0 ? i:-i));

		//������ ���� ¦������ Ȧ������ �Ǵ��ϴ� ���׿�����
		System.out.println(i+"��(��) "+((i/2==0) ? "¦��":"Ȧ��")+"�Դϴ�.");
		//���� ���Ҷ��� ==�� ����Ѵ�...!!!

	}
}
