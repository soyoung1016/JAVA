package day1123;

/**
 * ����� �߻�ȭ �Ͽ� ���� ramen Ŭ������ ����ϴ� Ŭ����
 * @author owner
 */
public class UseRamen {

	public static void main(String[] args) {
		Ramen bogul = new Ramen();
		bogul.setName("��¡��«��");
//		bogul.setMake("�ҿ�");
//		bogul.setPrice(780);
//		bogul.setKcal(512);
		
		
		System.out.format("������ ��� ��ü ������ �̸�[%s], ������[%s], ����[%d], Į�θ�[%d]\n",
							bogul.getName(), bogul.getMake(), bogul.getPrice(), bogul.getKcal());
		
		System.out.println("------------------------------------------");
		
		Ramen shin = new Ramen(900,410,"���");
		System.out.format("������ ��� ��ü ������ ������[%s], ����[%d], Į�θ�[%d]\n",
				shin.getMake(), shin.getPrice(), shin.getKcal());

		System.out.println(bogul.eat());
		System.out.println(bogul.eat("��"));
		
		
	}

}
