package day1113;
//지역변수 선언 사용
class UseLocalVariable {
	public static void main(String[] args){
	
	//1. 지역변수 선언 : 데이터형 변수명;
	int i;
	int j = 11; //변수의 초기화 : 변수를 선언하면서 값할당

	//2. 값할당 : 변수명 = 값;
	i = 100; //초기화 하지 않은 변수를 사용하면 error
	
	//3. 값 사용 : 출력, 연산, 재할당
	System.out.println(i);
	System.out.println(j);

	// int i = 200; 같은 변수명은 작성할 수 없음

	// 변수명은 한글로 가능하나 한글을 사용하지 않아야함
	int 변수 = 300;

	long l = 3000000000L;
	System.out.println(변수);
	System.out.println(변수);
	System.out.println(l);
	
	} // main

} //class