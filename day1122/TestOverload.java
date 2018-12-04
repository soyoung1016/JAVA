package day1122;

/**
 * ������ : method Overload<br>
 * - �ϳ��� Ŭ�������� ���� �̸��� method�� ������ �ۼ��ϴ°�<br>
 * ��Ģ)
 * 	1. ����������, ��ȯ��, method���� �����ϰ� ����� �Ű������� �ٸ��� �ۼ�
 * @author owner
 */
public class TestOverload {
	
	/**
	 * ���� �ϳ� ����ϴ� ��
	 */
	public void printStar() {
		System.out.println("��");
	}//printStar 

	/**
	 * �ԷµǴ� ���� ���� ���� ������ ����ϴ� ��
	 * @param count ����� ���� ����
	 */
	public void printStar(int count) {
		for(int i=0; i < count; i++) {
			System.out.print("��");
		}//end for
	}//printStar 
	
	public void googoodan() {
		int i = 3;
		for (int j=1; j<10; j++) {
		System.out.println(i+" x "+j+" = "+i+j);
		}
	}
	
	public void googoodan(int a) {
		if (1<a&&a<10) {
			while (a<10) {
				for (int b=1; b<10; b++) {
					System.out.print(a+" x "+b+" = "+a*b+" ");
				}//end for
				a++;
				System.out.println(" ");
			}
		}//end if
	}//googoodan
	
	public static void main(String[] args) {
		TestOverload to = new TestOverload();
		//���� 1�� ���
		to.printStar();//ù��°��
		//���� ������ ���
		to.printStar(5);//�ι�°��
		
		System.out.println(" ");
		
		//������ 3���� ����ϴ� method
		TestOverload dan = new TestOverload();
		dan.googoodan();
		
		//�Է��ϴ� ���� 2~9�� �����϶� �ش� �ܺ��� 9�ܱ����� ����ϴ� method
		dan.googoodan(7);
		

	}//main

}//class
