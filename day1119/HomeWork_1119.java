package day1119;

/**
 *
 *1. ����� �ð��� �Է¹޾� �Ʒ��� �������� ����ϼ���.
 *��� :  ����� �ð��� �ִ� 2�ð��� ������ ������ 60���� �Ѵ� �ٸ� "��Ÿ�"
 	 60�� ���϶�� "�ܰŸ�"�� ����ϼ���.

2. �̸�, ������ܰ� ����� �Ÿ��� �Է¹޾� �Ʒ��� ���� ����ϼ���.
   ��������� "����,����ö,�ý�,����"�� �����Ѵ�.
   ������� 1200��, ����ö ��� 1250��, �ýÿ�� 3800�� �Դϴ�.
   ����� 10Ű�� ������ �⺻���, �� 5Ű�� �ʰ��� ���� 100���� ���� �մϴ�.

 ���   :  xxx�� ����� ��������� xx�̸� �Ÿ��� xx Ű�� �Դϴ�.
            �� �̿� ��� xx���̰�, �պ��̿� ��� xx���̸�, �Ѵ� 20�ϱ���
            ������ ��: xxxx�� �Դϴ�.  
 * @author owner
 */
public class HomeWork_1119 {
	
	public static final int BUS_PRICE=1200;
	public static final int SUB_PRICE=1250;
	public static final int TAXI_PRICE=3800;
	
	
	public static void main(String[] args) {
		
		//1�� ����
		int commute = Integer.parseInt(args[0]);
		
		if (0<commute&commute<=60) {
			System.out.println("�ܰŸ� �Դϴ�.");
		} else if (60<commute&commute<=120) {
			System.out.println("��Ÿ� �Դϴ�.");
		} else {
			System.out.println("�ִ� �ð��� �ʰ��Ͽ����ϴ�.");
		}//end else
		//1�� ��
		
		
		//2�� ����
		/*
		 * 2. �̸�, ������ܰ� ����� �Ÿ��� �Է¹޾� �Ʒ��� ���� ����ϼ���.
		 
		   ��������� "����,����ö,�ý�,����"�� �����Ѵ�.
		   ������� 1200��, ����ö ��� 1250��, �ýÿ�� 3800�� �Դϴ�.
		   ����� 10Ű�� ������ �⺻���, �� 5Ű�� �ʰ��� ���� 100���� ���� �մϴ�.

		 ���   :  xxx�� ����� ��������� xx�̸� �Ÿ��� xx Ű�� �Դϴ�.
		            �� �̿� ��� xx���̰�, �պ��̿� ��� xx���̸�, �Ѵ� 20�ϱ���
		            ������ ��: xxxx�� �Դϴ�.
		 */
				
		int distance = Integer.parseInt(args[3]);
		int price = (int)(distance-10)/5;
		
		System.out.print(args[1]+"�� ����� ���� ������ ");
		
		if (args[2].equals("����")) {
			if(distance<=10) {
				System.out.println(args[2]+"�̸� �Ÿ��� "+args[3]+"Ű�� �Դϴ�.");
				System.out.println("�� �̿� ����� "+BUS_PRICE+"�� �̰�, �պ� �̿��� "+BUS_PRICE*2+"���̸�, �Ѵ� 20�� ���� ������ �� : "+BUS_PRICE*2*20+"�� �Դϴ�.");
			} else {
				System.out.println(args[2]+"�̸� �Ÿ��� "+args[3]+"Ű�� �Դϴ�.");
				System.out.println("�� �̿� ����� "+(BUS_PRICE+(price*100))+"�� �̰�, �պ� �̿��� "+((BUS_PRICE+(price*100))*2)+
									"���̸�, �Ѵ� 20�� ���� ������ �� : "+((BUS_PRICE+(price*100))*2*20)+"�� �Դϴ�.");
			}
		}
		
		else if (args[2].equals("����ö")) {
			if(distance<=10) {
				System.out.println(args[2]+"�̸� �Ÿ��� "+args[3]+"Ű�� �Դϴ�.");
				System.out.println("�� �̿� ����� "+SUB_PRICE+"�� �̰�, �պ� �̿��� "+SUB_PRICE*2+"���̸�, �Ѵ� 20�� ���� ������ �� : "+SUB_PRICE*2*20+"�� �Դϴ�.");
			} else {
				System.out.println(args[2]+"�̸� �Ÿ��� "+args[3]+"Ű�� �Դϴ�.");
				System.out.println("�� �̿� ����� "+(SUB_PRICE+(price*100))+"�� �̰�, �պ� �̿��� "+((SUB_PRICE+(price*100))*2)+
									"���̸�, �Ѵ� 20�� ���� ������ �� : "+((SUB_PRICE+(price*100))*2*20)+"�� �Դϴ�.");
			}
		}
		
		else if (args[2].equals("�ý�")) {
			if(distance<=10) {
				System.out.println(args[2]+"�̸� �Ÿ��� "+args[3]+"Ű�� �Դϴ�.");
				System.out.println("�� �̿� ����� "+TAXI_PRICE+"�� �̰�, �պ� �̿��� "+TAXI_PRICE*2+"���̸�, �Ѵ� 20�� ���� ������ �� : "+TAXI_PRICE*2*20+"�� �Դϴ�.");
			} else {
				System.out.println(args[2]+"�̸� �Ÿ��� "+args[3]+"Ű�� �Դϴ�.");
				System.out.println("�� �̿� ����� "+(TAXI_PRICE+(price*100))+"�� �̰�, �պ� �̿��� "+((TAXI_PRICE+(price*100))*2)+
									"���̸�, �Ѵ� 20�� ���� ������ �� : "+((TAXI_PRICE+(price*100))*2*20)+"�� �Դϴ�.");
			}
		}
		
		else if (args[2].equals("����")) {
				System.out.println(args[2]+"�̸� �Ÿ��� "+args[3]+"Ű�� �Դϴ�.");
		}
		
		else {
			System.out.println("�߸��� ������� �Դϴ�.");
		}
		            
	}//main

}//class
