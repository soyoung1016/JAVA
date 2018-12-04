package day1122;

/**
 * method의 4가지형태
 * @author owner
 */
public class MethodType {
	
	/**
	 * 반환형 없고 매개변수 없는형 - 고정 일
	 */
	public void typeA() {
		System.out.println("안녕하세요?");
		
	}//typeA
	
	/**
	 * 반환형 없고, 매개변수 있는 형 - 가변 일
	 * @param i 출력하고 싶은 값
	 */
	public void typeB(int i) {
		System.out.println(i+"번 안녕");
	}//typeB
	
	/**
	 * 반환형 있고, 매개변수 없는 형 - 고정 값
	 * 값을 받아 사용하는 코드가 필요
	 * @return 년, 월을 실수형으로 반환
	 */
	public double typeC() {
		//int i = 11;
		//int로 선언을 하면 int로만 나갈 수 있기 때문에 다른 데이터형은 ERROR
		return 2018.11;	//return 아래에는 아무것도 못옴, 위는 된다.		
		//System.out.println("");
	}
	
/*
	public float typeF() {
		return 2018.11F;
		//return (float)2018.11;
	}
	//형명시 또는 캐스팅을 하면 된다. 밑에 예시를 보자!(쟤네는 double)
*/
	/**
	 * 반환형 있고, 매개변수 있는 형 - 가변 값
	 * @param d 정수로 만들고 싶은 실수 값
	 * @return 정수로 변환된 값
	 */
	public int typeD(double d) {
		int i = (int)d; //캐스팅의 단점인 값 손실 발생
		return i;
	}

	
	public static void main(String[] args) {
		MethodType mt=new MethodType();
		//1. 고정 일 method 호출
		mt.typeA();
		
		//2. 가변 일 method 호출
		mt.typeB(5);
		mt.typeB(10);
		mt.typeB(2);
		
		//3. 고정 값 method 호출 - 반환형과 일치하는 변수를 만들어서 값을 저장
		double i = mt.typeC()+1;
		System.out.println("고정값 "+i);
		
		//4. 가변 값 method 호출 - 반환형과 일치하는 변수를 만들어서 값을 저장
		int j= mt.typeD(300.003);
		System.out.println("가변값 "+j);

	}//main

}//class
