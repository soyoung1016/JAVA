package day1120;

public class Homework {

	public static void main(String[] args) {
		
		//1번시작
		for (int i=1; i<10; i++ ) {
			for(int j=2; j<10; j++) {
				System.out.print(j+" * "+i+" = "+i*j+" ");			
			}//end for
			System.out.println("");
		}//end for
		//1번 끝
		
		System.out.println("===================================");
		
		//2번시작
		//0 0
		//  1 0 1 1
		//    2 0 2 1 2 2
		//      3 0 3 1 3 2 3 3
		
		for(int i=0; i<4; i++) {
			for (int j=0; j<=i; j++) {
				System.out.print(i+" "+j+" ");
			}
			System.out.println(" ");
			
			for (int j=0; j<=i; j++) {
			System.out.print(" "+" ");
			}
		}
		//2번 끝

	}//main

}//class
