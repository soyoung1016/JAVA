package day1114;
/*
�⺻�� ��������
������ : byte, short, int, long
������ : char
�Ǽ��� : float, double
�Ҹ��� : boolean
*/

class PrimitiveDataType {
	public static void main(String[] args) {
		//������
		byte a = 10;
		short b = 20;
		int c = 30;
		long d = 40; //�Ҵ�Ǵ� ���� 4byte�� �̹Ƿ� literal�� ��ȯ�� �ʿ����
		long e = 2147483648L; //literal�� ������ ���� �����Ƿ� literal�� ũ�⸦ ���� - �����
		//�ִ�� 2147483647

		System.out.println("byte : " +a+ ", short : " +b+ ", int : "+c+", long : "+d+", "+e);

		//������ : unicode �� : \u0000
		char f='A';
		char f2=66;//unicode���� 10������ �Ҵ簡��
		char g='0';
		char h='��';
		//��� : unicode�� ���� ���� ���
		System.out.println("char : "+f+", "+f2+", "+g+", "+h);

		//�Ǽ�
		float i = 3.14F; //����� - �Ǽ� literal�� 8byte�̰�
						//float ���������� 4type�̹Ƿ� ���Ҵ��� ���� �ʴ´�. �׷��� �����!
						
		double j=3.14; //literal�� ���������� �����Ƿ� ����� ���� �Ҽ��ִ�.
		double k=3.14;

		System.out.println("float : "+i+", "+j+", "+k);

		//�Ҹ���
		boolean l=true;
		boolean m=false;

		System.out.println("boolean : "+l+", "+m);

	}//main
}//class
