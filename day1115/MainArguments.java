package day1115;
/*
	Java 프로그램 외부에서 Java 프로그램 내부로 값을 전달할 때
	main method의 Arguments를 사용한다.

	env.bat으로 새 path?를 잡아줬다.

	실행방법)
		java 클래스파일명(bytecode명) 값 값 값
*/

class MainArguments {
	public static void main(String[] args) {

		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[0]+args[1]);
		//System.out.println(args[0]*args[1]); //문자열끼리 연산은 안되므로 ERROR

		//문자열을 정수로 변환
		//Integer.parseInt(문자열)을 이용하여 변환한다
		//문자열을 구분하여 int형으로 변환한 후 그 값을 반환하는 일
		int i = Integer.parseInt(args[0]);
		int j = Integer.parseInt(args[1]);

		System.out.println(i+j); //변환 후엔 연산 가능
		System.out.println(args[2]+"님 안녕하세요");


	}//main
}//class
