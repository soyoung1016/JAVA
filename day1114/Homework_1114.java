package day1114;
/*
1. �Ʒ��� ���� ������ ������ ����� ����� ������.

   �̴ϼ� : 'K', ���� : �ڽ��ǳ���, �޴��÷� : 1.5, ������ �÷� : 0.8

   ��� : ���� �̴ϼ��� 'K'�̰�, xx���Դϴ�. �÷��� �޴� xx, ������ xx�Դϴ�.

2. �⺻�� ���������� �����Ǵ� Ŭ������ Wrapper Class��� �Ѵ�. 
   Java Document���� WrapperŬ������ ����� �����ϴ��� ã�ƺ��� 
   �׿� ���� �ּҰ��� �ִ밪�� ��� �Ѵ�. 
 
   ��� :  byte�� �ּҰ� :  -128  �ִ밪 : 127 
*/


class Homework_1114 {
	public static void main(String[] args) 
	{
		//1�� ����
		char initial = 'K';
		int age = 24;
		double left = 1.5;
		double right = 0.8;

		System.out.println("���� �̴ϼ��� "+initial+"�̰�, "+age+"���Դϴ�. �÷��� �޴� "+left+", ������ "+right+"�Դϴ�.");
		//1�� ��

		//2������
		System.out.println("byte�� �ּҰ� : "+ Byte.MAX_VALUE+" / �ִ밪 : "+Byte.MIN_VALUE);
		System.out.println("short�� �ּҰ� : "+ Short.MAX_VALUE+" / �ִ밪 : "+Short.MIN_VALUE);
		System.out.println("int�� �ּҰ� : "+ Integer.MAX_VALUE+" / �ִ밪 : "+Integer.MIN_VALUE);
		System.out.println("long�� �ּҰ� : "+ Long.MAX_VALUE+" / �ִ밪 : "+Long.MIN_VALUE);
		System.out.println("float�� �ּҰ� : "+ Float.MAX_VALUE+" / �ִ밪 : "+Float.MIN_VALUE);
		System.out.println("double�� �ּҰ� : "+ Double.MAX_VALUE+" / �ִ밪 : "+Double.MIN_VALUE);
		
		//2�� ��, boolean�� �ִ� �ּ� X, Char�� X

		int deci = 15; //10����
		int octal = 017; //8����
		int hex = 0xf; //16����

		//int tel=0101238;

		System.out.println(deci+octal+hex);
		//System.out.println(tel);

	}
}
