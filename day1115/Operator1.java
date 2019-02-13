package day1115;
/*
	단항연산자(Unary)
	~, !, +, -, ++, --
*/

class Operator1 {
	public static void main(String[] args) {
		
		//---------------- ~(tilde) : 1의 보수연산 시작---------------------
		//~양수 : 부호변경 1증가
		int i = 11;
		int j = -11;
		System.out.println("~"+i+" = "+ ~i); // 11 => -12, +와 틸드 사이에 띄어쓰기 꼭 해야한다.	
		System.out.println("~"+j+" = "+ ~j); // -11 => 10
		//---------------------tilde 끝---------------------


		//---------------------!(NOT) : true->false, false->true 시작 ---------------------
		boolean b = true;
		boolean c = false;
		System.out.println("!"+b+" = "+ !b); //false
		System.out.println("!"+c+" = "+ !c); //true
		//System.out.println(!11>15); //ERROR
		System.out.println(!(11>15)); //이렇게 사용해야 한다.
		//! 끝, 그리고 !은 boolean에만 사용이 가능하다.


		// + : 형식적제공	시작
		System.out.println("+"+i+" = "+ +i); //11
		System.out.println("+"+j+" = "+ +j); //-11
		// + 끝


		// - : 2의보수연산, 부호바꿈연산	시작
		System.out.println("-"+i+" = "+ -i); // -11
		System.out.println("-"+j+" = "+ -j); // 11
		// - 끝


		//++ : 증가연산(대상체의 값을 1씩 증가)		시작
		i=0;
		j=10;
		//전위연산 : 연산자 대상체;
		++i; //0 -> 1
		--j; //10 ->9
		System.out.println("전위연산 후 : i ="+i+", j = "+j);
		//후위연산 : 대상차 연산자;
		i++; // 1 -> 2
		j--; // 9 -> 8
		System.out.println("후위연산 후 : i ="+i+", j = "+j);

		//증가연산자와 감소연산자는 대입연산자와 함께 사용되면 전위와 후위가 다른 값을 대입한다.
		j=0; i=5;
		//전위 : 내것 먼저
		j = ++i;	
		System.out.println("전위연산 후 : i ="+i+", 대입 j = "+j);
		//후위 : 남의 것 먼저
		j=0; i=5;
		j = i++;
		System.out.println("후위연산 후 : i ="+i+", 대입 j = "+j);



	}// main
}//class
