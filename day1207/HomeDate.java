package day1207;

//import java.util.Calendar;
//import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * main method�� arguments�� ��¥�� ������ �Է¹޾� �Է¹��� ��¥�� ������ �����ϰ� ����ϴ� method�� �ۼ��ϼ���
 * �� java Test 4 12 30 32 35 15 4
 * ���)
 * 4 ȭ
 * 12 ��
 * 15 ��
 * 30 ��
 */

public class HomeDate {

	public void dateDay(int[] day) {
		//1. ����
		Map<Integer, String> dayofweek = new HashMap<Integer,String>();
		//Calendar c = Calendar.getInstance();
		//Calendar c1 = new GregorianCalendar();
		//int day_of_week = c.get(Calendar.DAY_OF_WEEK);
		//c1.set(Calendar.DAY_OF_MONTH, 5);
		//String[] weekTitle = {"��", "��", "ȭ", "��", "��", "��", "��"};
		
		for(int i=0; i<day.length; i++) {
			dayofweek.put(day[i],"ȭ");
			if(dayofweek.containsKey(day[i])) {
				String value = dayofweek.get(day[i]);
				System.out.println(dayofweek+" "+value);
			}
		}
		
		
//		Set<Integer> allKeys = dayofweek.keySet();
//		System.out.println(allKeys);
//		
//		Iterator<Integer> ita = allKeys.iterator();
//		String value = "";
//		
//		for(int i =0; i<allKeys.size(); i++) {
//			
//			while(ita.hasNext()) {
//				value = dayofweek.get(ita.next());
//				System.out.println(value);
//				break;
//			}
//			
//		}

		return;
	}
	
	public static void main(String[] args) {
		HomeDate hd = new HomeDate();
		int[] day = {3,8,3,7,9,15,27,37};
		hd.dateDay(day);
	}

}
