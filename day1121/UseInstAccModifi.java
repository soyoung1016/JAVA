package day1121;

/**
 * ���� ��Ű���� �����ϴ� �ٸ� Ŭ������ �ν��Ͻ����� ���
 * ���������ڰ� public, protected, default �ΰ͸� ��� ����
 * @author owner
 */
public class UseInstAccModifi {

	public static void main(String[] args) {
		InstAccModifi ivam=new InstAccModifi();
		
		System.out.println("public : "+ivam.pub_i);
		System.out.println("protected : "+ivam.pro_i);
		System.out.println("default : "+ivam.def_i);
		//System.out.println("private : "+ivam.pri_i); //���Ұ�
	}//main

}//class
