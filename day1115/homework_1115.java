package day1115;
/*
����
1. ������ �Ҵ�� ���� ����϶��� 2������ ����ϰ� ������� ~�� ����Ͽ�
    ����� �����ϰ� �Էµ� �״���� 10������ ���.
    ��� ��)  "��� �ΰ��"  10 ��(��)  1010
                 "���� �ΰ��"  -10 ��(��) 10

2. 2147483647�� ������ ���� 2byte�� ���� 2byte ���� �и��Ͽ� ����غ�����. 
    ��� ��) ���� 2byte -> 32767
                ���� 2byte -> 65535

3. ||�� ������� �� ������ true��� ������ �������� �ʴ� ���� ������ �� �ִ�
     �ڵ带 �ۼ��ϼ���.


4. å�� ��������. 
*/

class homework_1115 {
	public static void main(String[] args) {
		
		//���� 1��
		int a = 18;
		System.out.println(a+" = "+(a>=0? Integer.toBinaryString(a):(~a+1)));

		int q = -2;
		System.out.println(q+" = "+(q>=0? Integer.toBinaryString(q):(~q+1)));


		//���� 2��
		//2147483647�� ������ ���� 2byte�� ���� 2byte ���� �и��Ͽ� ����غ�����. 
		//��� ��) ���� 2byte -> 32767
                //���� 2byte -> 65535
		System.out.println(Integer.MAX_VALUE>>16);
		System.out.println(Integer.MAX_VALUE>>15);
		//���� ��ĭ�� ���� 2byte, ������ ��ĭ�� ���� 2byte
		//i & 0x0000FFFF�� ���� 2byte ���ϴ� ���...���Ҹ����� �𸣰�����...


		//���� 3��

		boolean flag1=true, flag2=false, result=false;

		int b=5;
		int c=10;
		int d=0;

		flag1=false;
		flag2=false;
		result=false;

		result=(flag1=b<c) || (flag2=b>c);
		System.out.println("���� :" + result);
		
	}
}
