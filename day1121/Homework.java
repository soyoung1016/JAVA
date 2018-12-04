package day1121;

/**
 * 숙제
 *1.  while을 사용하여 구구단 전체 단을 출력하는  instance method를
 *작성하고, 호출하세요.
 *
 *2.  do~while을 사용하여 아래의 형태의  *을 출력하는  static method를
 *작성하여 호출하세요.
 * *
 * **
 * ***
 * ****
 *
 * @author owner
 */
public class Homework {

	//1번시작
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
	//1번 끝
	
	//2번 시작
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
			googoo.googoodan(); //instance method 호출
			
			Homework.star();
			
			
	} // main

} // class

