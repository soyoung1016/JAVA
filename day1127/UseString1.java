package day1127;

public class UseString1 {
	//�̸����� �Է¹޾� �̸����� ��ȿ���� �����Ͽ� boolean������ ����� ����� ��ȯ�ϴ� ���� �ϴ�
	//method�� ����� ȣ���Ͽ� ����غ�����
	private boolean validEmail(String email) {
	//�Ҹ������� ����Ƿ�
		boolean flag=false;
		//1��
		if((email.indexOf(".")!=-1)&&(email.indexOf("@")!=-1)&&(email.length()>=5)) {
			flag=true;
		}
		return flag; 
		//2��
//		flag= email.indexOf(".")!=-1&&email.indexOf("@")!=-1&&email.length()>=5;
//		flag�� true�� ��.
//		return flag;
		//3��
//		flag= email.contains(".")&&email.contains("@")&&email.length()>=5;
//		return flag;		
	}
	public static void main(String[] args) {
		UseString1 us1 = new UseString1();
		String email="ruro@daum.net";
		if(us1.validEmail(email)) {
			System.out.println(email + " ��ȿ");
		} else {
			System.out.println(email + " ��ȿ");
		}
		
		
		
	}//main

}//class
