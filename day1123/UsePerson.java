package day1123;

/**
 * ����� �߻�ȭ �Ͽ� ���� person Ŭ������ ����ϴ� Ŭ����
 * @author owner
 */
public class UsePerson {

	public static void main(String[] args) {
		//��ü ���� :heap�� �����ǰ� instance ������ �ڵ� �ʱ�ȭ�� �ȴ�.
		Person soyoung = new Person();
		
		//������ ���������� Person�� heap�� �ּҸ� ������ �ִ�.
		System.out.println("��ü�� ����ϸ� �ּҰ� ��� "+soyoung);		
		soyoung.setName("�ڼҿ�");
//		2018-11-26 �ڵ� �߰� - �⺻������ �����ϸ� �ڵ带 �߰�. setter ���̵� �⺻�����ڸ� �����Ͽ� 2,1,1 ��� ��ü ȣ�� ����!		
//		soyoung.setEye(2);
//		soyoung.setNose(1);
//		soyoung.setMouth(1);
		
		
		System.out.format("������ ��� ��ü ���� ��[%d], ��[%d], ��[%d], �̸�[%s]\n",
							soyoung.getEye(), soyoung.getNose(), soyoung.getMouth(), soyoung.getName());
		
		//������ ��ü���� ���ǵ� ���� ���
		System.out.println(soyoung.eat());
		System.out.println(soyoung.eat("��ȸ�����",8000));
		
		
		Person jinban = new Person(3,1,1);
//		2018-11-26 �ڵ� �߰� - ������ �����ϸ� �ڵ带 �߰�. setter ���̵� �����ִ� �����ڸ� �����Ͽ� 3,1,1 ��� ��ü ȣ�� ����!(������)
//		��üȭ�ϸ� �ȿ� �ٷ� ���ڰ��� �־��ش�!
		jinban.setName("õ����");
//		jinban.setEye(3);
//		jinban.setNose(1);
//		jinban.setMouth(1);
		
		System.out.format("������ ��� ��ü ���� ��[%d], ��[%d], ��[%d], �̸�[%s]\n",
				jinban.getEye(), jinban.getNose(), jinban.getMouth(), jinban.getName());
		
		System.out.println(jinban.eat());
		System.out.println(jinban.eat("����", 1));
		
		
		
		
		
		

	}//main
	
}//class