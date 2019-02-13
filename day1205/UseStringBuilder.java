package day1205;

/**
 * String Buffer, StringBuilder(JDK1.5)
 * ���ڿ��� heap�� ���� �����ϰ� ����ϴ� Ŭ����
 * @author owner
 */
public class UseStringBuilder {
	
	public void useStringBuffer() {
		//1. Ŭ��������
		StringBuffer sb = new StringBuffer();
		//2. ��(����, �Ǽ�, ����, �Ҹ�, ���ڿ� . . .) �߰�
		sb.append("������   ");//���ڿ�
		sb.append(12);//����
		sb.append("�� 5��").append("������ �Դϴ�."); //method chain
		System.out.println(sb);
		
		//3. �� ����
		//append�� �ڷ� ���ٿ����°�. ��� �߰��� ����
		//insert(�����ε���, ��)
		//������ 12�� 5�� �������Դϴ�.
		//0 1 2 34
		sb.insert(4, "2018��");
		System.out.println(sb);
		
		//4. �� ���� : delete(�����ε���, ���ε���+1)
		//������ 2018�� 12�� 5�� �������Դϴ�.
		sb.delete(0, 3);
		System.out.println(sb);
		sb.reverse(); //������
		System.out.println(sb);
		
	}
	
	//���ۿ� �״��!! �Ȱ��� ���ȴ�.
	public void useStringBuilder() {
		//1. Ŭ��������
		StringBuilder sb = new StringBuilder();
	
		//2. ��(����, �Ǽ�, ����, �Ҹ�, ���ڿ� . . .) �߰�
		sb.append("������   ");//���ڿ�
		sb.append(12);//����
		sb.append("�� 5��").append("������ �Դϴ�."); //method chain
		System.out.println(sb);
				
		//3. �� ����
		//append�� �ڷ� ���ٿ����°�.
		//������ 12�� 5�� �������Դϴ�.
		//0 1 2 34
		sb.insert(4, "2018��");
		System.out.println(sb);
				
		//4. �� ���� : delete(�����ε���, ���ε���+1)
		//������ 2018�� 12�� 5�� �������Դϴ�.
		sb.delete(0, 3);
		System.out.println(sb);
		sb.reverse(); //������
		System.out.println(sb);
	}

	public static void main(String[] args) {
		UseStringBuilder usb = new UseStringBuilder();
		usb.useStringBuffer();
		System.out.println("==============================");
		usb.useStringBuilder();
		
		String str = "�ȳ��ϼ���?"; //ª�� ���ڿ��� String�� �����Ѵ�.
		System.out.println(str);
		
		String str1 = "��"; //���ڿ��� +�� �پ �� ���ڿ�
		System.out.println(str1+"��"+"��"+"��"+"��?");
		//new StringBuffer().append(str1).append("��").append("��")...
		
	}

}
