package day1204;

import java.util.Date;
import java.util.List;
//import java.awt.List; //ERROR, ��Ű���� �ٸ��� �̸��� ���� Ŭ������ �� �� �ϳ��� import ���� �� �ִ�.
import java.util.Random;
//import java.util.*; //��Ű�� ���� ��� class(interface)�� �� ���� ����� �� �ִ�. 


/**
 * import : �ٸ� ��Ű���� Ŭ������ �����Ͽ� ����� ��
 * @author owner
 */
public class TestImport {

	public static void main(String[] args) {
		Random r = new Random();
		Random r1 = new Random();
		Random r2 = new Random();
		//���� import�� ����̵� �� �� �ִ�.
		
		Date d = new Date();
		
		/*
		 * ���� �̸��� Ŭ����(interface)�� �� �� ���� ���Ǵ� ���� import�� ó���ϰ�
		 * ���� ���Ǵ� ���� full path�� ó���Ѵ�.
		 */
		java.awt.List list = null;//awt.List
		List list1 = null;//util.List
		
	}

}
