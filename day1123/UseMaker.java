package day1123;

/**
 * ��ī���� ������ Ŭ������ ����ϴ� Ŭ����.<br>
 * 4. ��ü����<br>
 * 5. ������ ��ü ���
 * @author owner
 */
public class UseMaker {

	public static void main(String[] args) {
		//������ ��Ŀ�� 1�� ����
		Marker black = new Marker();
//		black.setColor("������");
//		black.setCap(1);
//		black.setBody(1);
//		2018-11-26 �ڵ� �߰� - ������ �����ϸ� �ڵ带 �߰�. setter ���̵� �⺻�����ڸ� �����Ͽ� ������ ��ī ȣ�� ����!
				
		System.out.printf("������ ��ī�� �� [%s], �Ѳ�[%d], ��ü[%d]\n", black.getColor(), black.getCap(), black.getBody());
		//������ ��ü�� ���
		System.out.println(black.write("�ȳ��ϼ���?"));
		System.out.println("-----------------------------------");
		
		Marker red = new Marker("������", 5, 5);
//		2018-11-26 �ڵ� �߰� - �⺻������ �����ϸ� �ڵ带 �߰�. setter ���̵� �����ִ� �����ڸ� �����Ͽ� ������ ��ī ȣ�� ����!(������)
//		��üȭ�ϸ� �ȿ� �ٷ� ���ڰ��� �־��ش�!
//		red.setColor=("���");//���������ڰ� public�̶�� �ܺο��� ���� ���� �����Ҽ� �����Ƿ� �߸��� ���� �Էµ� �� �ִ�.
//		red.setColor("������");
//		red.setCap(5);
//		red.setBody(5);
		
		
		System.out.printf("������ ��ī�� �� [%s], �Ѳ�[%d], ��ü[%d]", red.getColor(), red.getCap(), red.getBody());
		//������ ��ü�� ���
		System.out.println(black.write("������"));

	}//main

}//class
