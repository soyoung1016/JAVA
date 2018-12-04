package day1115;
/*
	대입연산자
	=,
	+=, -=, *=, /=, %=
	<<=, >>=, >>>=
	&=, |=, ^=
*/

class Operator7 {
	public static void main(String[] args) {
		
		int i = 3; //대입
		//산술대입
		i += 2; // i = i+2;, 5
		i -= 1; // i = i-1;, 4
		i *= 2; // i = i*2;, 8
		i /= 3; // i i/2;, 참고로 자바에서는 정수/정수 = 정수
		i %= 3; // i = i%3;

		//쉬프트 대입
		i <<=4; // i = i <<4
		// 0000 0100
		//0000 0010 0000
		i >>=1; //i = i >> 1;
//		System.out.println(i);	//bug 목적, method 개발시 값 확인용
		//실행중인 코드에 출력 코드가 존재하면 속도 저하
		i >>>=2; // i = i >>>2; 


		//비트논리 대입
		i &= 12; // i = i & 12;
		i |= 11; // i = i||11; 
		i ^= 5; // 1 = i ^ 5;

		System.out.println(i);
	}
}
