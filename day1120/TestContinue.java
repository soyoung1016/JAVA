package day1120;

/**
 * Continue : �ݺ��� ���� �ݺ������ڵ��� ������ �ǳ� �ٴ���
 * 
 * @author owner
 */
public class TestContinue {

	public static void main(String[] args) {
		//0 ~ 100���� Ȧ���� ���
		for(int i=0; i<100; i++) {
			if (i%2==0) {
				continue;				
			}//end if
			System.out.println("i = "+i);
		}//end for
		
	}//main
}//class
