package day1206;

import java.text.DecimalFormat;

/**
 * DecimalFormat
 * ���ڸ� ������ ���ڿ��� ����
 * @author owner
 */
public class UseDecimalFormat {

	public UseDecimalFormat() {
		int temp = 20181206;
		System.out.println(temp);
		//�������� ���� �޸��� �ְ�ʹ�!
		DecimalFormat df = new DecimalFormat("0,000");
		DecimalFormat df1 = new DecimalFormat("#,###");
		//���Ϻ��� ������ �ڸ����� �� Ŭ ��� java�� �˾Ƽ� ���� �������� ���ڸ� ���� ������ش�.
		
		System.out.println("0��� : " + df.format(temp));
		System.out.println("#��� : " + df1.format(temp));
		
		System.out.println("-------------------------------");
		
		DecimalFormat df2 = new DecimalFormat("#,###.##");
		//�Ǽ��ڸ����� ����ϸ� ������ ���ڸ��� ���� �ݿø� ����̶�� �ݿø��� ����� �����ش�.
		System.out.println("�Ҽ��ڸ��� ǥ�� : " + df2.format(201812.066));
		System.out.println("�Ҽ��ڸ��� ǥ�� : " + df2.format(201812.064));
		
		
	}
	
	public static void main(String[] args) {
		new UseDecimalFormat();
	}

}
