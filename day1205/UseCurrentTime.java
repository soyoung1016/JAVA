package day1205;

/**
 * 1970년 01월 01일 00:00:00초로부터 현재 날짜의 시간을
 * ms로 얻어내는 System.currentTimeMillis() 사용
 * @author owner
 */
public class UseCurrentTime {

	public void test() {
		long sum = 0;
			for(int i = 0; i < 5000; i++) {
				sum = sum+i;
				System.out.println(i);
			}
	}
	
	public static void main(String[] args) {
		UseCurrentTime uct = new UseCurrentTime();
		long[] avgTime = new long[17];
		
//			for(int i = 0; i<avgTime.length; i++) {
//				st=System.currentTimeMillis();
//				uct.test();
//				
//			}
		
		long st = System.currentTimeMillis();
		uct.test();
		long et = System.currentTimeMillis();
		System.out.println((et-st)+"ms"); //현재
		
	}
}
