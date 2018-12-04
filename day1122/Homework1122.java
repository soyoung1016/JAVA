package day1122;
/*
 ���� 
�Ʒ��� ������ ó���ϴ� method�� type�� �˸°� �ۼ��ϰ� API�ּ���
 ������ �� ȣ���Ͽ� ����� �� �� Java Doc�� �����غ�����.
- API�ּ��� � ������ method������ �ּ����� ����Ұ�.

1. �ڽ��� �̸��� ��ȯ�ϴ� method�ۼ�.
2. ���̸� �Է¹޾� �¾ �ظ� ��ȯ�ϴ�  method �ۼ�.
3. ���ڸ� �Է¹޾� �ش� ������ �����ڵ� ���� ��ȯ�ϴ� method �ۼ�.
4. ���ڸ� �Է¹޾� ���ڰ�  ������, ������ ������ ���� �� �ش� ������
    ���ڸ�  ����ϴ� ���� �ϴ� method  �ۼ�
5. ȣ���ϸ� �ڽ��� �ּҸ� ����ϴ�  method �ۼ�.
6. ģ���� �̸��� �Է¹޾� ����ϴ�  method �ۼ�(ģ���� n�� �Դϴ�.) 

���� �� ������ �����Ͽ� ������ �������� ���� ���ϰ��� �޼ҵ� �� ��ü�� ��ġ�Ǵ°�.
 */


public class Homework1122 {

	//1������
	/**
	 * ������, ��ȯ�� �ְ� �Ű����� ���� method<br>
	 * ����� ���� ����.<br>
	 * @return �ڽ��� �̸�
	 */
	public String myname() {
		return "�ڼҿ�";
	}
	//1����
	
	//2������
	/**
	 * ������, ��ȯ�� ���� �Ű����� �ִ� method
	 * @param age �¾ ��
	 */
	public int birth(int age) {
		System.out.println("�¾ �ش� "+(2018-age+1)+"�� �Դϴ�.");
		return 2018-age+1;
	}
	//2����
	
	//3������

	/**
	 * ������, ��ȯ�� �ְ� �Ű����� �ִ� method
	 * @param three �����ڵ� ��
	 */
	public int uni(char three) {
		System.out.println((int)three);
		return (int)three;
	}
	//3����
	
	//4������
	/**
	 * ������, ��ȯ�� ���� �谳���� �ִ� method
	 * @param uniuni �ش� ������ �����ڵ� ����
	 */
	public void number(int uniuni) {
		char unitwo;
		unitwo = (char)uniuni;
		if(('A' <= unitwo && unitwo <= 'Z') || ('0' <= unitwo && unitwo <='9') || ('a' <= unitwo && unitwo <= 'z')) {
			System.out.println(unitwo);
		} else {
			System.out.println("�߸��� �Է��Դϴ�.");
		}
	}
	//4����
	
	//5������
	public void add(int ... p) {
		System.out.println(p);
	}
	//5����
	
	//6������
	/**
	 * ���� ������������ �Էµ� ���� ���� ����ϴ� method
	 * @param param ���
	 */
	public void friend(String ... param) {
		System.out.println(param.length);
		
		int cnt = 0 ;
		System.out.println("-------------------");
		
		//�̸����
		for (String val : param) {
			System.out.print(val + " ");
			cnt++;
		} // end for
		
		System.out.println(cnt);
	}
	//6����
	
	public static void main(String[] args) {
		Homework1122 one = new Homework1122();

		one.myname();//1��ȣ��
		one.birth(24); //2��ȣ��
		one.uni('B'); //3��ȣ��
		one.number(66);//4��ȣ��
		one.add();
		one.friend("�ڼҿ�","AA","BB","cc");//6��ȣ��
		
	}
	

}
