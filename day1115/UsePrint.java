package day1115;
//표준 출력 method 사용
class UsePrint{
	public static void main(String[] args){
		/*
		System.out.print("안녕");
		System.out.print("하세요");
		*/

		System.out.println(11); //정수상수
		System.out.println(11.13); //실수상수
		System.out.println('A'); //문자상수, 홀따옴표는 한 글자만 가능
		System.out.println("ABC 안녕"); //문자열상수

		int i = 11; //변수
		String s="오늘은 화요일";  //변수

		System.out.println(i); //기본형 데이터형 변수
		System.out.println(s);//참조형 데이터형 변수

		System.out.println(11+13); //연산식, 연산된 결과만 출력
		//메세지 여산식
		System.out.println("11+13="+(11+13));

	}//main method

} //class