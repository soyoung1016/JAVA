package day1114;
/*
강제형변환
변수의 데이터형을 일시적으로 변환하여 사용하는 것
*/

class UseCasting {
	public static void main(String[] args) {
		byte b1 = 10, b2 = 20; //자동형변환
		//int result = b1 + b2; //연산의 결과가 int로 자동형변환, 밑은 다른방법
		//byte result = (byte)b1 + b2; //error..괄호는 +보다 연산이 빠르기 때문
		byte result = (byte)(b1 + b2); //*는 결과가 다름..
		//연산의 결과가 int로 자동형변환 되는 것을 byte로 강제형변환

		System.out.println(b1 +" + "+b2+" = "+result);


		double d = 11.14;
		float f = (float)d;
		//float f = dF; //얘는 error, 이렇게는 사용 못함
		System.out.println("double : "+d+", float : "+f);


		float f1 = (float)2018.11; //상수에 사용가능
		System.out.println("float : "+f1);

		//long l = (long)2147483648; //값의 범위자체를 넘어선 값은 강제형변환을 하여도 소용이 없음
									//상수값이 literal보다 크다면 casting을 실행하기 전에 error발생


		int i = (int)f1; //값손실 발생(실수부의 값이 모두 사라져서 할당)
		System.out.println("int : "+i+", float : "+f1);


		char c = 'A';
		System.out.println(c+"의 unicode(ASCⅱ code)값은 "+(int)c);
		

		//형이 (기본형 <->참조형) 다르면 강제형변환이 되지 않는다.
		//String s = "11";
		//int i = (int)s; //기본형
		//error

		
		//boolean형은 boolean형 끼리만 변환가능
		boolean b = true;
		//i = (int)b; //error
		boolean bc = (boolean)b; //되긴 되지만 의미는 없다.
		System.out.println(bc);


	}//main
}//class
