package day1115;
/*
숙제
1. 변수에 할당된 값이 양수일때만 2진수로 출력하고 음수라면 ~를 사용하여
    양수로 변경하고 입력된 그대로의 10진수로 출력.
    출력 예)  "양수 인경우"  10 은(는)  1010
                 "음수 인경우"  -10 은(는) 10

2. 2147483647의 값에서 상위 2byte와 하위 2byte 값을 분리하여 출력해보세요. 
    출력 예) 상위 2byte -> 32767
                하위 2byte -> 65535

3. ||를 사용했을 때 전항이 true라면 후항을 연산하지 않는 것을 증명할 수 있는
     코드를 작성하세요.


4. 책을 읽으세요. 
*/

class homework_1115 {
	public static void main(String[] args) {
		
		//숙제 1번
		int a = 18;
		System.out.println(a+" = "+(a>=0? Integer.toBinaryString(a):(~a+1)));

		int q = -2;
		System.out.println(q+" = "+(q>=0? Integer.toBinaryString(q):(~q+1)));


		//숙제 2번
		//2147483647의 값에서 상위 2byte와 하위 2byte 값을 분리하여 출력해보세요. 
		//출력 예) 상위 2byte -> 32767
                //하위 2byte -> 65535
		System.out.println(Integer.MAX_VALUE>>16);
		System.out.println(Integer.MAX_VALUE>>15);
		//왼쪽 두칸이 상위 2byte, 오른쪽 두칸이 하위 2byte
		//i & 0x0000FFFF가 하위 2byte 구하는 방법...뭔소린지는 모르겠지만...


		//숙제 3번

		boolean flag1=true, flag2=false, result=false;

		int b=5;
		int c=10;
		int d=0;

		flag1=false;
		flag2=false;
		result=false;

		result=(flag1=b<c) || (flag2=b>c);
		System.out.println("판정 :" + result);
		
	}
}
