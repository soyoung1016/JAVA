package day1205;

/**
 * 1970�� 01�� 01�� 00:00:00�ʷκ��� ���� ��¥�� �ð���
 * ms�� ���� System.currentTimeMillis() ���
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
		System.out.println((et-st)+"ms"); //����
		
	}
}
