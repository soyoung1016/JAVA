package day1122;
/*
 숙제 
아래의 업무를 처리하는 method를 type에 알맞게 작성하고 API주석을
 설정한 후 호출하여 결과를 본 후 Java Doc을 생성해보세요.
- API주석은 어떤 형태의 method인지를 주석으로 기술할것.

1. 자신의 이름을 반환하는 method작성.
2. 나이를 입력받아 태어난 해를 반환하는  method 작성.
3. 문자를 입력받아 해당 문자의 유니코드 값을 반환하는 method 작성.
4. 숫자를 입력받아 숫자가  영문자, 숫자의 범위에 있을 때 해당 숫자의
    문자를  출력하는 일을 하는 method  작성
5. 호출하면 자신의 주소를 출력하는  method 작성.
6. 친구의 이름을 입력받아 출력하는  method 작성(친구는 n명 입니다.) 

일은 그 로직을 수행하여 보여줄 뿐이지만 값은 리턴값이 메소드 그 자체에 대치되는것.
 */


public class Homework1122 {

	//1번시작
	/**
	 * 고정값, 반환형 있고 매개변수 없는 method<br>
	 * 출력을 하지 않음.<br>
	 * @return 자신의 이름
	 */
	public String myname() {
		return "박소영";
	}
	//1번끝
	
	//2번시작
	/**
	 * 가변값, 반환형 없고 매개변수 있는 method
	 * @param age 태어난 해
	 */
	public int birth(int age) {
		System.out.println("태어난 해는 "+(2018-age+1)+"년 입니다.");
		return 2018-age+1;
	}
	//2번끝
	
	//3번시작

	/**
	 * 가변값, 반환형 있고 매개변수 있는 method
	 * @param three 유니코드 값
	 */
	public int uni(char three) {
		System.out.println((int)three);
		return (int)three;
	}
	//3번끝
	
	//4번시작
	/**
	 * 가변일, 반환형 없고 배개변수 있는 method
	 * @param uniuni 해당 숫자의 유니코드 문자
	 */
	public void number(int uniuni) {
		char unitwo;
		unitwo = (char)uniuni;
		if(('A' <= unitwo && unitwo <= 'Z') || ('0' <= unitwo && unitwo <='9') || ('a' <= unitwo && unitwo <= 'z')) {
			System.out.println(unitwo);
		} else {
			System.out.println("잘못된 입력입니다.");
		}
	}
	//4번끝
	
	//5번시작
	public void add(int ... p) {
		System.out.println(p);
	}
	//5번끝
	
	//6번시작
	/**
	 * 동일 데이터형으로 입력된 여러 값을 출력하는 method
	 * @param param 몇명
	 */
	public void friend(String ... param) {
		System.out.println(param.length);
		
		int cnt = 0 ;
		System.out.println("-------------------");
		
		//이름출력
		for (String val : param) {
			System.out.print(val + " ");
			cnt++;
		} // end for
		
		System.out.println(cnt);
	}
	//6번끝
	
	public static void main(String[] args) {
		Homework1122 one = new Homework1122();

		one.myname();//1번호출
		one.birth(24); //2번호출
		one.uni('B'); //3번호출
		one.number(66);//4번호출
		one.add();
		one.friend("박소영","AA","BB","cc");//6번호출
		
	}
	

}
