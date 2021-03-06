package day1114;
/*
1. 아래의 값을 저장할 변수를 만들고 출력해 보세요.

   이니셜 : 'K', 나이 : 자신의나이, 왼눈시력 : 1.5, 오른눈 시력 : 0.8

   출력 : 나의 이니셜은 'K'이고, xx살입니다. 시력은 왼눈 xx, 오른눈 xx입니다.

2. 기본형 데이터형에 대응되는 클래스를 Wrapper Class라고 한다. 
   Java Document에서 Wrapper클래스의 상수가 존재하는지 찾아보고 
   그에 대한 최소값과 최대값을 출력 한다. 
 
   출력 :  byte의 최소값 :  -128  최대값 : 127 
*/


class Homework_1114 {
	public static void main(String[] args) 
	{
		//1번 시작
		char initial = 'K';
		int age = 24;
		double left = 1.5;
		double right = 0.8;

		System.out.println("나의 이니셜은 "+initial+"이고, "+age+"살입니다. 시력은 왼눈 "+left+", 오른눈 "+right+"입니다.");
		//1번 끝

		//2번시작
		System.out.println("byte의 최소값 : "+ Byte.MAX_VALUE+" / 최대값 : "+Byte.MIN_VALUE);
		System.out.println("short의 최소값 : "+ Short.MAX_VALUE+" / 최대값 : "+Short.MIN_VALUE);
		System.out.println("int의 최소값 : "+ Integer.MAX_VALUE+" / 최대값 : "+Integer.MIN_VALUE);
		System.out.println("long의 최소값 : "+ Long.MAX_VALUE+" / 최대값 : "+Long.MIN_VALUE);
		System.out.println("float의 최소값 : "+ Float.MAX_VALUE+" / 최대값 : "+Float.MIN_VALUE);
		System.out.println("double의 최소값 : "+ Double.MAX_VALUE+" / 최대값 : "+Double.MIN_VALUE);
		
		//2번 끝, boolean은 최대 최소 X, Char도 X

		int deci = 15; //10진수
		int octal = 017; //8진수
		int hex = 0xf; //16진수

		//int tel=0101238;

		System.out.println(deci+octal+hex);
		//System.out.println(tel);

	}
}
