package day1129;

import java.util.Arrays;

public class UseSecureArray {

	public static void main(String[] args) {
		SecureArray sa = new SecureArray();
		int[] tempArr = sa.getArr();
		
		//�迭 ���� ���� �ս��� ��� �Ϸ��� Aarray Ŭ���� ���
		tempArr[0]=190;
		System.out.println(Arrays.toString(tempArr));
		
		int[] tempArr1 = sa.getArr();
		System.out.println(Arrays.toString(tempArr1));
		
	}//main

}//class
