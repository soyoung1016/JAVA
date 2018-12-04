package day1114;
/*
	쉬프트연산자
	<< (left shift) : 비트를 왼쪽으로 밀고 밀어서 빈칸을 항상 0으로 채운다.
	>> (right shift) : 비트를 오른쪽으로 밀고 밀어서 빈칸을 최상위 부호 비트에 따라 양수면 0을, 음수면 1을 채운다. 
	>>> (unsigned right shift) : 비트를 오른쪽으로 밀고 밀어서 빈칸을 항상 0으로 채운다.
*/

class Operator3 {
	public static void main(String[] args) {
		
		//method : static method 사용
		//클래스명.method명(값)
		int i = 11;
		System.out.println(Integer.toBinaryString(i)); //1011
		System.out.println(Integer.toOctalString(i)); //13
		System.out.println(Integer.toHexString(i)); //0xb

		i=9;
		System.out.println(i+" << 3 = "+ (i << 3));
		//0000 1001 원래것
		//0100 1000 밀린것
		//8 + 64 = 72 답

		i=36;
		System.out.println(i+" >> 3 = "+ (i >> 3));
		//0010 0100 원래것
		//0000 0100	100 밀린것, 100은 버린다
		//답은 4

		i=120;
		System.out.println(i+" >>> 4 = "+ (i >>> 4));
		//0111 1000 원래것
		//0000 0111 1000 밀린것, 000은 버린다
		//답은 4+2+1 = 7

		i=1;
		System.out.println(i << 31); //-2147483648 //최상위 부호비트 변경
		System.out.println(i << 32); //1이 나온다. 다시 앞으로 돌아옴.
	
		i=-1;
		System.out.println(i >> 100); //-1 //최상위 부호비트 유지
		System.out.println(i >>> 1); // 0111 11111????, 2147483647 //최상위 부호비트 0으로 변경




	}//main
}//class
