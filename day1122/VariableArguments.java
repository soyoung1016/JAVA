package day1122;


/**
 * Variable Arguments
 * �Ű������� �ϳ��ε� �μ��� ������ ���� �� �ִ� ���<br>
 * method �������� �迭�� ó���ȴ�.<br>
 * ���� ) "�������� . . . �Ķ������" �������� ����
 * @author owner
 */
public class VariableArguments {
	
	/**
	 * ���� ������������ �� �Է� ���� ������ ��� �� ��.
	 * @param param ���� ������
	 */
	public void test(int ... param) {
		for(int val : param) {
			System.out.println(val);
		} //end for
		System.out.println("test method called!");
	}//test
	
	
	/**
	 * ���� �μ��� �ޱ����� �Ű������� ���� ���������� �� �� �ִ�.
	 * @param i ù��°
	 * @param d �ι�°
	 * @param j ����°
	 */
	public void test1 (int i, double d, int ... j) {
		System.out.println("ó�� �Ű����� : " + i);
		System.out.println("�ι�° �Ű����� : " + d);
		System.out.println("����° �Ű����� : " + j);//j�� �������̱� ������ for���� ���� ������ �ּҰ��� ����.
		for (int idx=0; idx < j.length; idx++) { //��� j�� ����!! �迭�� ���� int������ ���� ~~���� j������ ���� �����°�.
			System.out.println(j[idx]);
		}//end for
		
	}
	
	//���ڿ��� �Է¹��� �� �ִ� �Ű������� ����
	public void printName(String name) {
		System.out.println(name+"�� �ȳ��ϼ���");
	}//printName
	
	public static void main(String[] args) {
		VariableArguments va = new VariableArguments();
		//va.test(1,2,3,4,5,6,7,8);
		va.test();
		va.test1(1,3.14,10,20,30,40,50,60);
		
		
		String name = "�ڼҿ�";
		va.printName(name);
		
		System.out.println("\"�ȳ�\"");
		
	}//main

}//class
