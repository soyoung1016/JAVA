package day1203;

import java.util.Arrays;

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
		
		
		System.out.println("======================================================");
		String[] clackLang = superman.language("�ܰ��");
		clackLang = superman.language("����");
		clackLang = superman.language("�Ҿ�");
		clackLang = superman.language("���Ͼ�");
		clackLang = superman.language("���¸���");
		
		System.out.println(Arrays.toString(clackLang));
		
		String[] HongLang = gd.language("�ѱ���");
		HongLang = gd.language("�߱���");
		HongLang = gd.language("��ȭ");
		
		
		System.out.println(Arrays.toString(HongLang));
		
		System.out.println("=============================================");
		//Clark�� interface�� �����Ͽ����Ƿ� ���� ����
		System.out.println(superman.speed("����"));
		System.out.println(superman.height("��"));
		
	}

}
