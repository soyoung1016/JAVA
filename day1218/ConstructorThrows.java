package day1218;

/**
 * �����ڿ��� ���� ������ ���
 * @author owner
 */
public class ConstructorThrows {

	public ConstructorThrows() throws ClassNotFoundException {
		Class.forName("java.lang.Object");
		System.out.println("��ü����");
		
	}
	
	public static void main(String[] args) {
		try {
			ConstructorThrows ct = new ConstructorThrows();
			System.out.println("��üȭ ����" + ct);
		} catch (ClassNotFoundException cnfe) {
			System.out.println("��üȭ�� ���� �߻�");
		}
	}

}
