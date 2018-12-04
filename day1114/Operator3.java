package day1114;
/*
	����Ʈ������
	<< (left shift) : ��Ʈ�� �������� �а� �о ��ĭ�� �׻� 0���� ä���.
	>> (right shift) : ��Ʈ�� ���������� �а� �о ��ĭ�� �ֻ��� ��ȣ ��Ʈ�� ���� ����� 0��, ������ 1�� ä���. 
	>>> (unsigned right shift) : ��Ʈ�� ���������� �а� �о ��ĭ�� �׻� 0���� ä���.
*/

class Operator3 {
	public static void main(String[] args) {
		
		//method : static method ���
		//Ŭ������.method��(��)
		int i = 11;
		System.out.println(Integer.toBinaryString(i)); //1011
		System.out.println(Integer.toOctalString(i)); //13
		System.out.println(Integer.toHexString(i)); //0xb

		i=9;
		System.out.println(i+" << 3 = "+ (i << 3));
		//0000 1001 ������
		//0100 1000 �и���
		//8 + 64 = 72 ��

		i=36;
		System.out.println(i+" >> 3 = "+ (i >> 3));
		//0010 0100 ������
		//0000 0100	100 �и���, 100�� ������
		//���� 4

		i=120;
		System.out.println(i+" >>> 4 = "+ (i >>> 4));
		//0111 1000 ������
		//0000 0111 1000 �и���, 000�� ������
		//���� 4+2+1 = 7

		i=1;
		System.out.println(i << 31); //-2147483648 //�ֻ��� ��ȣ��Ʈ ����
		System.out.println(i << 32); //1�� ���´�. �ٽ� ������ ���ƿ�.
	
		i=-1;
		System.out.println(i >> 100); //-1 //�ֻ��� ��ȣ��Ʈ ����
		System.out.println(i >>> 1); // 0111 11111????, 2147483647 //�ֻ��� ��ȣ��Ʈ 0���� ����




	}//main
}//class
