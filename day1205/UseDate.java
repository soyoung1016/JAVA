package day1205;

import java.util.Date;
import java.util.Locale;
import java.text.SimpleDateFormat;

/**
 * ������ �ִ� ��¥ ������ ���� ��
 * ���� - java.text.SimpleDateFoarmat
 * @author owner
 */
public class UseDate {
	
	public UseDate() {
		Date date = new Date();
		System.out.println(date);
//		System.out.println(1900+date.getYear()); //����õ . method�� ����.
		
		//Locale - �ٸ� ������ ��¥ �������� �����Ͽ� ������ ��!
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd�� a EEEE HH��(hh,kk):mm:ss",Locale.CHINESE);
		String formatDate = sdf.format(date);
		System.out.println(formatDate);
		
	}

	public static void main(String[] args) {
		new UseDate();
	}

}

