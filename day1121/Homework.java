package day1121;

/**
 * ����
 *1.  while�� ����Ͽ� ������ ��ü ���� ����ϴ�  instance method��
 *�ۼ��ϰ�, ȣ���ϼ���.
 *
 *2.  do~while�� ����Ͽ� �Ʒ��� ������  *�� ����ϴ�  static method��
 *�ۼ��Ͽ� ȣ���ϼ���.
 * *
 * **
 * ***
 * ****
 *
 * @author owner
 */
public class Homework {

	//1������
	//instance method
	public void googoodan() {
		int i=2;
//		int j=1;
		
		
		
		while(i<10) {
			//System.out.println(j);
			int j=1;
			while(j<10) {				
				System.out.println(i+" x "+j+" = "+i*j);		
				j++;
			}//end while			
			i++;
		} // end while
	} // end googoodan
	//1�� ��
	
	//2�� ����
	public static void star() {
//		int a=0;
//		do {
//			System.out.println("*");
//			a++;
//			for() {
//				
//			}
//		} while(a<4);
		for(int a=0; a<4; a++) {
			for(int b=0; b<=a; b++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		int a=0;
		do {
			int b=0;
			do {
				System.out.print("*");
				b++;
			} while(b<=a);
			System.out.println("");
			a++;
		} while(a<4);
		
	}
	

	public static void main(String[] args) {
			Homework googoo = new Homework();
			googoo.googoodan(); //instance method ȣ��
			
			Homework.star();
			
			
	} // main

} // class

