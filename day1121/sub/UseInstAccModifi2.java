package day1121.sub;

import day1121.InstAccModifi;

/**
 * �ٸ� ��Ű���� �����ϴ� Ŭ������ �ν��Ͻ����� ���
 * ��Ӱ��迡 �ִٸ� �ڽ�Ŭ������ �����Ͽ� �θ� Ŭ������ ���� �ν��Ͻ�������
 * ���������ڰ� public, protected �ΰ͸� ��� ����
 * @author owner
 */
public class UseInstAccModifi2 extends InstAccModifi{

	public static void main(String[] args) {
		UseInstAccModifi2 ivam=new UseInstAccModifi2();
		
		System.out.println("public : "+ivam.pub_i);
		System.out.println("protected : "+ivam.pro_i);
		//System.out.println("default : "+ivam.def_i);//���Ұ�
		//System.out.println("private : "+ivam.pri_i); //���Ұ�
	}//main

}//class
