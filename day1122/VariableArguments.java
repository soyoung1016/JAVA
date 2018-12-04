package day1122;


/**
 * Variable Arguments
 * 매개변수는 하나인데 인수를 여러개 넣을 수 있는 기능<br>
 * method 내에서는 배열로 처리된다.<br>
 * 정의 ) "데이터형 . . . 파라메터형" 형식으로 정의
 * @author owner
 */
public class VariableArguments {
	
	/**
	 * 동일 데이터형으로 된 입력 값을 여러개 출력 할 때.
	 * @param param 가변 인자형
	 */
	public void test(int ... param) {
		for(int val : param) {
			System.out.println(val);
		} //end for
		System.out.println("test method called!");
	}//test
	
	
	/**
	 * 가변 인수를 받기위한 매개변수는 가장 마지막에만 쓸 수 있다.
	 * @param i 첫번째
	 * @param d 두번째
	 * @param j 세번째
	 */
	public void test1 (int i, double d, int ... j) {
		System.out.println("처음 매개변수 : " + i);
		System.out.println("두번째 매개변수 : " + d);
		System.out.println("세번째 매개변수 : " + j);//j는 참조형이기 때문에 for문을 주지 않으면 주소값만 나옴.
		for (int idx=0; idx < j.length; idx++) { //얘는 j를 위함!! 배열로 찍어내야 int값으로 넣은 ~~부터 j까지의 값이 나오는것.
			System.out.println(j[idx]);
		}//end for
		
	}
	
	//문자열을 입력받을 수 있는 매개변수를 선언
	public void printName(String name) {
		System.out.println(name+"님 안녕하세요");
	}//printName
	
	public static void main(String[] args) {
		VariableArguments va = new VariableArguments();
		//va.test(1,2,3,4,5,6,7,8);
		va.test();
		va.test1(1,3.14,10,20,30,40,50,60);
		
		
		String name = "박소영";
		va.printName(name);
		
		System.out.println("\"안녕\"");
		
	}//main

}//class
