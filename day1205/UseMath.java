package day1205;

/**
 * Math : ��ü�� �������� �ʰ� ����ϴ� Ŭ����
 * @author owner
 */
public class UseMath {
	
	public UseMath() {
//		Math m = new Math(); //ERROR. ��ü����� Ŭ������ �ƴϾ ����
		int i = -12;
		System.out.println(i+"�� ���밪 : "+Math.abs(i));
		System.out.println(Math.ceil(10.1)); //�ø�, 10.0�� �״�� 10.0
		System.out.println(Math.round(10.1));//�ݿø�
		System.out.println(Math.round(10.5)); //�ݿø�, �Ҽ��� ���� ù�ڸ�����
		System.out.println(Math.floor(10.5)); //����, �Ҽ��� ���� ù�ڸ�����
		
		double d = Math.random();
		System.out.println("�߻��� ���� : "+d);
		System.out.println("������ ������ ���� : "+d*5);
		System.out.println("������ ������ �������� ���� : "+(int)d*5); //����� 0, why? ĳ������ �������� �� ����!
		System.out.println("������ ������ �������� ���� : "+(int)(d*5));
		
		
		
		
		// A(65)-Z(90)�� �ϳ��� ���ڸ� ��ȯ�ϴ� ��
		//������ 26�� �߻����Ѿ� �Ѵ�.???????
		System.out.println((char)((int)(d*26)+65));
		System.out.println("==============================");
		
	}
	
	public char[] createPassword() {
		char[] tempPass = new char[8];
		double w = Math.random();
		//�����ڴ빮��, �ҹ���, ���ڷ� �̷���� ������ ��й�ȣ 8�ڸ��� �����Ͽ� ��ȯ�ϴ� ��
		//�빮�ڴ� 65-90, �ҹ��ڴ� 97-122, ���ڴ� 48-57
		
//		String flag = "ABCDEFGHIJKLMNOPQRSTUVWXYGabcdefghijklmnopqrstuvwxyg0123456789";
//				
//		for(int i = 0; i < tempPass.length; i++) {
//			tempPass[i] = flag.charAt((int)(Math.random()*flag.length()));
//			System.out.print(tempPass[i]);
//		}
		for (int i = 0; i < tempPass.length; i++) {
			tempPass[i] = (char)((int)(w*26)+65);
			System.out.print(tempPass[i]);
		}
		
		return tempPass;

	}
	

	public static void main(String[] args) {
		new UseMath().createPassword();
		
	}

}
