package day1122;

/**
 * 다형성 : method Overload<br>
 * - 하나의 클래스에서 같은 이름의 method를 여러개 작성하는것<br>
 * 규칙)
 * 	1. 접근지정자, 반환형, method명은 동일하게 만들고 매개변수만 다르게 작성
 * @author owner
 */
public class TestOverload {
	
	/**
	 * ★을 하나 출력하는 일
	 */
	public void printStar() {
		System.out.println("★");
	}//printStar 

	/**
	 * 입력되는 값에 따라 ★을 여러개 출력하는 일
	 * @param count 출력할 별의 갯수
	 */
	public void printStar(int count) {
		for(int i=0; i < count; i++) {
			System.out.print("☆");
		}//end for
	}//printStar 
	
	public void googoodan() {
		int i = 3;
		for (int j=1; j<10; j++) {
		System.out.println(i+" x "+j+" = "+i+j);
		}
	}
	
	public void googoodan(int a) {
		if (1<a&&a<10) {
			while (a<10) {
				for (int b=1; b<10; b++) {
					System.out.print(a+" x "+b+" = "+a*b+" ");
				}//end for
				a++;
				System.out.println(" ");
			}
		}//end if
	}//googoodan
	
	public static void main(String[] args) {
		TestOverload to = new TestOverload();
		//별을 1개 출력
		to.printStar();//첫번째꺼
		//별을 여러개 출력
		to.printStar(5);//두번째꺼
		
		System.out.println(" ");
		
		//구구단 3단을 출력하는 method
		TestOverload dan = new TestOverload();
		dan.googoodan();
		
		//입력하는 단이 2~9단 사이일때 해당 단부터 9단까지를 출력하는 method
		dan.googoodan(7);
		

	}//main

}//class
