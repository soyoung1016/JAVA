package day1121;

/**
 * static (class)���� : Ŭ������ ����Ǹ� ���� ó�� �޸�(method)�� �ö󰡰�,
 * ��� ��ü�� �ϳ��� ������ �����Ͽ� ����� ����
 * @author owner
 */
public class UseStaticVariable {
	static int i; //static variable -> �ٷλ��.
	int j; //instance variable -> ��üȭ�Ͽ� ���.
	
	public void test() {
		i=100;
		j=200;
		System.out.println(i+" / "+j);
		
	}//test

	public static void main(String[] args) {
		
		//class ���� ���, Ŭ������.������
		UseStaticVariable.i=2000;
		System.out.println(UseStaticVariable.i);
		
		UseStaticVariable usv=new UseStaticVariable();
		UseStaticVariable usv1=new UseStaticVariable();
		usv.j=5000; //instance������ ������ ��ü�� ���� ����Ѵ�.
		usv1.j=10000;
		
		UseStaticVariable.i=20;
		//usv.i=20;//��ü������ ����ϸ� Ư�� ��ü�� ����(member ����)�� �ƴϹǷ�
		//����� ���������� �����ϴ� ������ �ƴϴ�.
		System.out.println("usv��ü �ν��Ͻ����� : "+usv.j+", ����ƽ���� "+UseStaticVariable.i);
		System.out.println("usv1��ü �ν��Ͻ����� : "+usv1.j+", ����ƽ���� "+UseStaticVariable.i);
		
		
//		j=100;
//		System.out.println(i+" / "+j);
	}//main

}//class
