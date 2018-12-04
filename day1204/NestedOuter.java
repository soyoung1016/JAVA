package day1204;

/**
 * ����Ŭ������ static ����ó�� ����� �� �ִ� ��øŬ����
 * @author owner
 */
public class NestedOuter {
	//�ٱ� Ŭ������ ���� ����
	int i;
	static int j;
	//�ٱ� Ŭ������ ���� ��
	
	//�ٱ� Ŭ������ �޼ҵ� ����
	public NestedOuter() {
		System.out.println("�ٱ� Ŭ������ ������");
	}
	
	public void outInstMethod() {
		System.out.println("�ٱ� Ŭ������ instance method");
	}
	
	public static void outStatMethod() {
		System.out.println("�ٱ� Ŭ������ static method");
	}
	//�ٱ� Ŭ������ �޼ҵ� ��
	
	//////////////////////////Nested class ����//////////////////////////////
	static class NestedInner { //static�̶�� ���ٰ� �ؼ� ������ ������ static�� �ƴϴ�
//		int in_i; //static������ �ƴϴ�. instance ����
		static int in_j; //static ����
		
//		public NestedInner() {
//		}
		/*
		 * ���� �ν��Ͻ� ������ �����ڸ� ������ �� ���� �ִµ� �������� �ʴ´�.
		 */
		
		public void inMethod() {
			System.out.println("���� Ŭ������ instance method");
		}
		
		public static void inStatMethod() { //static����
			System.out.println("���� Ŭ������ static method");
//			System.out.println("�ٱ� Ŭ������ �ڿ� ���. i = "+i); 
			//ERROR. �ƹ��� ���� Ŭ������� ������ ��üȭ ���̴� instance ������ ������ �� �� ����.
			System.out.println("�ٱ� Ŭ������ �ڿ� ���. j = "+j); //j�� static�����̹Ƿ� ȣ�� ����
			System.out.println("�ٱ� Ŭ������ �ڿ� ���. j = "+NestedOuter.j); //�̷��� �ᵵ �ȴ�. �̰��� �� ����
			
//			outInstMethod(); //ERROR, instance������ method�̹Ƿ� ����� �� ����.
			outStatMethod(); //��밡��. static������ method�̴�.
			NestedOuter.outStatMethod(); //�䷸�� ����
			
		}
		
	}
	//////////////////////////Nested class ��///////////////////////////////
	
	
	public static void main(String[] args) { //static����
		//static ������ ����� ������ ��üȭ���� Ŭ������.������, Ŭ������.method������ ����Ѵ�.
		NestedInner.inStatMethod();
		//static�������� instance�� �θ��� �ݵ�� ��üȭ�� �ؾ�������(�ٸ� �����϶�)
		//static�������� static�� �θ� �� ��üȭ ���� ȣ���� �� �ִ�.

	}//main

}//class
