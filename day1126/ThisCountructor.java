package day1126;

/**
 * this�� ����� ������ ȣ��
 * @author owner
 */
public class ThisCountructor {
	
	public ThisCountructor() {
		//this(); ���θ� ��� �θ��� �ٽ� ���ڸ��� ���⶧���� ���ȣ��. ERROR. �� �� ������ ������ ���� ���� ����
		//this(25);
		System.out.println("�⺻ ������");
	}
	
	public ThisCountructor(int i) {
		this();
		System.out.println("�����ִ� ������ : "+i);
//		this(); ������ �������� ù��° �ٿ����� ����� �� �ִ�.
	}
	
	public static void main(String[] args) {
		//new ThisCountructor();
		new ThisCountructor(22);
		//������ ��ü�� �������� ���ļ� ���� ���� ��ü���� ������ ������ ���ε�
		//���������� method�� ���� ������ ��ü�� �����ؼ� ����� ���� ����.
		//�׷��� ������ �������� �ʴ´�.
	}//main

}//class
