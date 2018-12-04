package day1126;

/**
 * Ŭ������ ��ü�� ���� �� �� �⺻������ ������ �־���� �⺻���� �����ϰų�,<br>
 * �⺻������ ����� �ڵ带 �����ϴ� method�� ����<br>
 * ��ü �ʱ�ȭ��<method>
 * @author owner
 */
public class TestConstructor {	//�����ڸ� ������ ����
	
	/**
	 * �⺻������ : Ŭ���� �ۼ��� �����ڸ� �ϳ��� �������� ������ �����Ϸ��� �Ű����� ���� default constructor�� �����Ѵ�.
	 */
	public TestConstructor() {
		System.out.println("�⺻ ������");
	}//TestConstructor
	
	/**
	 * �����ִ� ������ : �������� Overload<br>
	 * �ܺ��� �Է°��� ������ ����<br>
	 * @param i ������ ��
	 */
	public TestConstructor(int i) {
		System.out.println("�����ִ� ������ :" + i);
	}//TestConstructor
	
	public void test() {
		System.out.println("test mehtod~~!");
		//TestConstructor(300); //�����ڸ� method ȣ���ϵ� ȣ���� �� ����. ��üȭ�� ���ؼ��� �θ� �� �ִ�.
		temp();//method ȣ��
	}//test
	
	public void temp() {
		System.out.println("------------------------test mehtod~~!");
	}//temp
	
	public static void main(String[] args) {
		//Overloading �� �����ڸ� ����Ͽ� ��üȭ�� �پ��ϰ� �� �� ����.
		TestConstructor tc = new TestConstructor(); //�⺻ ������
		TestConstructor tc1 = new TestConstructor(26); // �����մ� ������
		
		System.out.println(tc);
		System.out.println(tc1);
		
		tc.test();

	}//main

}//class
