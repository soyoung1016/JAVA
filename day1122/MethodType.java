package day1122;

/**
 * method�� 4��������
 * @author owner
 */
public class MethodType {
	
	/**
	 * ��ȯ�� ���� �Ű����� ������ - ���� ��
	 */
	public void typeA() {
		System.out.println("�ȳ��ϼ���?");
		
	}//typeA
	
	/**
	 * ��ȯ�� ����, �Ű����� �ִ� �� - ���� ��
	 * @param i ����ϰ� ���� ��
	 */
	public void typeB(int i) {
		System.out.println(i+"�� �ȳ�");
	}//typeB
	
	/**
	 * ��ȯ�� �ְ�, �Ű����� ���� �� - ���� ��
	 * ���� �޾� ����ϴ� �ڵ尡 �ʿ�
	 * @return ��, ���� �Ǽ������� ��ȯ
	 */
	public double typeC() {
		//int i = 11;
		//int�� ������ �ϸ� int�θ� ���� �� �ֱ� ������ �ٸ� ���������� ERROR
		return 2018.11;	//return �Ʒ����� �ƹ��͵� ����, ���� �ȴ�.		
		//System.out.println("");
	}
	
/*
	public float typeF() {
		return 2018.11F;
		//return (float)2018.11;
	}
	//����� �Ǵ� ĳ������ �ϸ� �ȴ�. �ؿ� ���ø� ����!(���״� double)
*/
	/**
	 * ��ȯ�� �ְ�, �Ű����� �ִ� �� - ���� ��
	 * @param d ������ ����� ���� �Ǽ� ��
	 * @return ������ ��ȯ�� ��
	 */
	public int typeD(double d) {
		int i = (int)d; //ĳ������ ������ �� �ս� �߻�
		return i;
	}

	
	public static void main(String[] args) {
		MethodType mt=new MethodType();
		//1. ���� �� method ȣ��
		mt.typeA();
		
		//2. ���� �� method ȣ��
		mt.typeB(5);
		mt.typeB(10);
		mt.typeB(2);
		
		//3. ���� �� method ȣ�� - ��ȯ���� ��ġ�ϴ� ������ ���� ���� ����
		double i = mt.typeC()+1;
		System.out.println("������ "+i);
		
		//4. ���� �� method ȣ�� - ��ȯ���� ��ġ�ϴ� ������ ���� ���� ����
		int j= mt.typeD(300.003);
		System.out.println("������ "+j);

	}//main

}//class
