package day1205;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Calendar : 단일 날짜 정보를 얻을 때
 * @author owner
 */
public class UseCalendar {

	public UseCalendar() {
		//Calendar 클래스의 인스턴스 얻기~!
		//1. getInstance 사용
//		Calendar cal = new Calendar();
		Calendar cal = Calendar.getInstance();

		//2. is a 관계의 객체화
		Calendar cal1 = new GregorianCalendar();
		
		//3. 자식만으로 객체
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println(cal);
		System.out.println(cal1);
		System.out.println(gc);
		
		int year = cal.get(Calendar.YEAR); 
//		int year = cal.get(1); // 1의 의미를 1만봐서는 모르니까.. 가독성 향상을 위해 상수를 넣는다.
		int month = cal.get(Calendar.MONTH)+1; 
		int day = cal.get(Calendar.DAY_OF_MONTH); 
		
		int day_of_year = cal.get(Calendar.DAY_OF_YEAR); 
		//요일 : 일-1, 월-2, 화-3, 수-4, 목-5, 금-6, 토-7
		int day_of_week = cal.get(Calendar.DAY_OF_WEEK); 
		
		//java에서는 월의 시작이 0월, 그래서 12월인데도 11월로 표시된다.
		System.out.printf("%d-%d-%d 오늘은 올해의 %d번째 날 입니다.\n",year,month,day,day_of_year);
		
//		String week="";
//		switch(day_of_week) {
//		case Calendar.SUNDAY :
//			week="일요일";
//			break;
//		case Calendar.MONDAY:
//			week="월요일";
//			break;
//		case Calendar.TUESDAY:
//			week="화요일";
//			break;
//		case Calendar.WEDNESDAY:
//			week="수요일";
//			break;
//		case Calendar.THURSDAY:
//			week="목요일";
//			break;
//		case Calendar.FRIDAY:
//			week="금요일";
//			break;
//		case Calendar.SATURDAY:
//			week="토요일";
//			
//		}
		
		String[] weekTitle = {"일", "월", "화", "수", "목", "금", "토"};
		
		System.out.printf("%d요일 %s",day_of_week, weekTitle[day_of_week-1]); //배열이라서! weekTitle[4]="목"
		
		int am_pm = cal.get(Calendar.AM_PM);
		
//		switch (am_pm) {
//		case Calendar.AM :
//
//			break;
//		
//		case Calendar.PM :
//			
//			break;
//		}
		
		System.out.printf("%d ",am_pm); // Calendar.AM_PM은 오전은 0, 오후는 1으로 출력된다.
		
		System.out.printf("%d, %s ",am_pm, am_pm==Calendar.AM?"오전":"오후"); 
		
		int hour=cal.get(Calendar.HOUR);
		int hour24=cal.get(Calendar.HOUR_OF_DAY);
		int minute=cal.get(Calendar.MINUTE);
		int second=cal.get(Calendar.SECOND);
		System.out.printf("%d(%d):%d:%d\n",hour,hour24, minute,second);
		
		System.out.println("-----------------------------------------");
		System.out.printf("설정 전 %d-%d-%d %s요일\n",cal1.get(Calendar.YEAR), cal1.get(Calendar.MONTH)+1,
							cal1.get(Calendar.DAY_OF_MONTH),"일,월,화,수,목,금,토".split(",")[cal1.get(Calendar.DAY_OF_WEEK)-1]);
		//split : 문자열 중 특정 문자열로 구분하여 배열로 생성하는 method
		
		//년
		cal1.set(Calendar.YEAR, 2019); //2019-12-06
		//월 : 사람이 생각하는 월보다 1 적게 설정
		cal1.set(Calendar.MONTH, 4); //2019-05-06
		//일 : 해당 월에 존재하지 않는 일자(28일 혹은 30일, 31일 이후의 날짜)가 설정되면 자동으로 다음달 1일로 설정되어 하루씩 +된다.
		cal1.set(Calendar.DAY_OF_MONTH, 32); //2019-05-15
		
		
		System.out.printf("설정 후 %d-%d-%d %s요일\n",cal1.get(Calendar.YEAR), cal1.get(Calendar.MONTH)+1,
				cal1.get(Calendar.DAY_OF_MONTH),"일,월,화,수,목,금,토".split(",")[cal1.get(Calendar.DAY_OF_WEEK)-1]);
		
		//getActualMaximum을 이용한 이번달의 마지막날 출력
		System.out.println("이번달의 마지막날 : "+cal.getActualMaximum(Calendar.DATE));
		
	}
	
	public static void main(String[] args) {
		new UseCalendar();
	}

}
