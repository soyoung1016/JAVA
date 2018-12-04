package day1115;
/*
	논리연산자
	1. 일반논리
		1.1 &&(AND) : 전항과 후항이 모두 true일 때만 true 반환
		1.2 ||(OR) : 전항과 후항이 모두 false 일 때만 false 반환
	2. 비트논리
		2.1 &(AND) : 상위 비트와 하위비트 모두 1인 경우 1내림
		2.2 |(OR) : 상위 비트와 하위비트 모두 0인 경우 0내림
		2.3 ^(XOR) - Exclusive OR : 상위 비트와 하위비트 둘 중 하나만 1인 경우 1내림
*/
class Operator5 {
	public static void main(String[] args) {

		boolean flag1=true, flag2=false, flag3=true, flag4=false;
		int i = 0, j = 0;

		System.out.println("-----------------&&------------------");
		System.out.println(flag1+" && "+flag3+" = " + (flag1 && flag3)); //true
		System.out.println(flag1+" && "+flag2+" = " + (flag1 && flag2)); //false
		//전항이 false이면 후항을 계산하지 않고 false인 결과를 만든다.
		System.out.println(flag2+" && "+flag3+" = " + (flag2 && flag3)); //false
		System.out.println(flag2+" && "+flag4+" = " + (flag2 && flag4)); //false


		System.out.println("-----------------||------------------");
		System.out.println(flag1+" || "+flag3+" = " + (flag1 || flag3)); //true
		System.out.println(flag1+" || "+flag2+" = " + (flag1 || flag2)); //true
		//전항이 true이면 후항을 계산하지 않고 true인 결과를 만든다.
		System.out.println(flag2+" || "+flag3+" = " + (flag2 || flag3)); //true
		System.out.println(flag2+" || "+flag4+" = " + (flag2 || flag4)); //false

		System.out.println("-------------------------------------");

		flag1=false;
		flag2=false;
		flag3=false;

		flag3=(flag1=3>4) && (flag2=5>4);
		System.out.println("전항 : "+flag1+", 후항 : "+flag2+", 판정 :" + flag3);


		System.out.println("-------------------------------------");
		//변수선언은 위에
		
		i=28;
		j=48;
		System.out.println(i+" & "+j+" = " + (i&j));
		//28은 0001 1100
		//48은 0011 0000
		//결과  0001 0000 = 16 
		i=16;
		j=3;
		System.out.println(i+" | "+j+" = " + (i|j));
		//16은 0001 0000
		//3은  0000 0011
		//결과  0001 0011 = 16 + 1 + 2 = 19
		i=10;
		j=12;
		System.out.println(i+" ^ "+j+" = " + (i^j));
		//10은 0000 1010
		//12는 0000 1100
		//결과  0000 0110 = 6

	}//main
}//class
