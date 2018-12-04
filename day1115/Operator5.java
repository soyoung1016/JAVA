package day1115;
/*
	��������
	1. �Ϲݳ�
		1.1 &&(AND) : ���װ� ������ ��� true�� ���� true ��ȯ
		1.2 ||(OR) : ���װ� ������ ��� false �� ���� false ��ȯ
	2. ��Ʈ��
		2.1 &(AND) : ���� ��Ʈ�� ������Ʈ ��� 1�� ��� 1����
		2.2 |(OR) : ���� ��Ʈ�� ������Ʈ ��� 0�� ��� 0����
		2.3 ^(XOR) - Exclusive OR : ���� ��Ʈ�� ������Ʈ �� �� �ϳ��� 1�� ��� 1����
*/
class Operator5 {
	public static void main(String[] args) {

		boolean flag1=true, flag2=false, flag3=true, flag4=false;
		int i = 0, j = 0;

		System.out.println("-----------------&&------------------");
		System.out.println(flag1+" && "+flag3+" = " + (flag1 && flag3)); //true
		System.out.println(flag1+" && "+flag2+" = " + (flag1 && flag2)); //false
		//������ false�̸� ������ ������� �ʰ� false�� ����� �����.
		System.out.println(flag2+" && "+flag3+" = " + (flag2 && flag3)); //false
		System.out.println(flag2+" && "+flag4+" = " + (flag2 && flag4)); //false


		System.out.println("-----------------||------------------");
		System.out.println(flag1+" || "+flag3+" = " + (flag1 || flag3)); //true
		System.out.println(flag1+" || "+flag2+" = " + (flag1 || flag2)); //true
		//������ true�̸� ������ ������� �ʰ� true�� ����� �����.
		System.out.println(flag2+" || "+flag3+" = " + (flag2 || flag3)); //true
		System.out.println(flag2+" || "+flag4+" = " + (flag2 || flag4)); //false

		System.out.println("-------------------------------------");

		flag1=false;
		flag2=false;
		flag3=false;

		flag3=(flag1=3>4) && (flag2=5>4);
		System.out.println("���� : "+flag1+", ���� : "+flag2+", ���� :" + flag3);


		System.out.println("-------------------------------------");
		//���������� ����
		
		i=28;
		j=48;
		System.out.println(i+" & "+j+" = " + (i&j));
		//28�� 0001 1100
		//48�� 0011 0000
		//���  0001 0000 = 16 
		i=16;
		j=3;
		System.out.println(i+" | "+j+" = " + (i|j));
		//16�� 0001 0000
		//3��  0000 0011
		//���  0001 0011 = 16 + 1 + 2 = 19
		i=10;
		j=12;
		System.out.println(i+" ^ "+j+" = " + (i^j));
		//10�� 0000 1010
		//12�� 0000 1100
		//���  0000 0110 = 6

	}//main
}//class
