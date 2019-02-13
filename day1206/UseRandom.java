package day1206;

import java.util.Random;

/**
 * Random : �پ��� ������ ������� ��ü
 * @author owner
 */
public class UseRandom {
	
	public UseRandom() {
		//1. ����
		Random r = new Random();
		//�Ǽ� ����
		double d = r.nextDouble();
		System.out.println(d);
		System.out.println(d*5);
		System.out.println((int)(d*5)); // 0~4����
		
		System.out.println("-------------------------------");
		
		//���� ����
		int i = r.nextInt(); //�Ű����� ���� nextInt
		System.out.println(i); //���� Ȥ�� ���
		System.out.println(i%5); //��� ������ ����. �� ����� �ʿ��ϹǷ� �Ʒ� �޼ҵ带 ������ش�.
		System.out.println(Math.abs(i%5));
		
		System.out.println("-------------------------------");
		int j = r.nextInt(5); //�Ű����� �ִ� nextInt, ���� 0~4, ������ ������ �ʴ´�.
		System.out.println(j);
		
		System.out.println("-------------------------------");
		//�Ҹ� ����
		boolean b = r.nextBoolean();
		System.out.println(b); //true or false
		
		
		
	}
	
	public static void main(String[] args) {
		new UseRandom();
	}

}
