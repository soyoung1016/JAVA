package day1205;

import java.util.Date;
import java.util.Locale;
import java.text.SimpleDateFormat;

/**
 * 형식이 있는 날짜 정보를 얻을 때
 * 형식 - java.text.SimpleDateFoarmat
 * @author owner
 */
public class UseDate {
	
	public UseDate() {
		Date date = new Date();
		System.out.println(date);
//		System.out.println(1900+date.getYear()); //비추천 . method가 많다.
		
		//Locale - 다른 나라의 날짜 형식으로 변경하여 제공할 때!
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년MM월dd일 a EEEE HH시(hh,kk):mm:ss",Locale.CHINESE);
		String formatDate = sdf.format(date);
		System.out.println(formatDate);
		
	}

	public static void main(String[] args) {
		new UseDate();
	}

}

