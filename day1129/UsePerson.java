package day1129;

import java.util.Date;

public class UsePerson {

	public static void main(String[] args) {
		HongGilDong gd = new HongGilDong();
		gd.setName("ȫ�浿"); //�θ��� method ���
		System.out.println("�� : "+gd.getEye()+", �� : "+gd.getNose()+", �� : "+gd.getMouth());
		System.out.println(gd.eat());
		System.out.println(gd.eat("����",1));
		//�ڽŸ��� Ư¡
		System.out.println(gd.fight(6)); //7���� 8
		System.out.println(gd.fight(7)); //8���� 9
		System.out.println(gd.fight(9)); //���
		System.out.println(gd.fight(10)); //����. ���� 9���� 8�� �϶�
		System.out.println(gd.fight(9)); //����. ���� 8���� 7�� �϶�
		System.out.println(gd.toString());
		
		System.out.println("===================================");
		Clark superman = new Clark(); //�ڽ��� �����Ǹ� �θ�Ŭ������ ���� ���� �� �� �ڽ��� �����ȴ�.
		//�ڽ��� ��ü�� �θ�Ŭ������ �ڿ�(����, method)�� �ڽ��� ��ó�� ����� �� �ִ�.
		superman.setName("Ŭ��");
		//�ڵ��� ���뼺
		System.out.println("�� : "+superman.getEye()+", �� : "+superman.getNose()+
							", �� : "+superman.getMouth()+", �̸� : "+superman.getName());
		
		System.out.println(superman.eat());
		System.out.println(superman.eat("������ũ", 10));
		
		//�ڽ��� method
		String stone = "¯��";
		System.out.println(stone+"��(��) ���� ��� " +superman.power(stone)+", ���� ��ȭ : "+superman.power);
		
		stone = "Ŭ���䳪��Ʈ";
		System.out.println(stone+"��(��) ���� ��� " +superman.power(stone)+", ���� ��ȭ : "+superman.power);
		
		stone = "���̾Ƹ��";
		System.out.println(stone+"��(��) ���� ��� " +superman.power(stone)+", ���� ��ȭ : "+superman.power);
		
		
		//�ڽ��� method 2ź, ����
		System.out.println("===================================");
		Soyoung me = new Soyoung();
		me.setName("�ҿ�");
		
		String drink = "���ް�";
		System.out.println("�� : "+me.getEye()+", �� : "+me.getNose()+
				", �� : "+me.getMouth()+", �̸� : "+me.getName());
		
		String s = new String("������ �ݿ���");
		System.out.println(s.toString());//overriding, �ּ� ���� ���� ��������ʹ�! 
		
		Date d = new Date();
		System.out.println(d.getYear());
		

		
	}

}
