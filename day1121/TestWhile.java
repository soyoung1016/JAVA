package day1121;

/**
 * while : 시작과 끝을 모를때 사용하는 반복문<br>
 * 			최소 0번 수행, 최대 조건까지 수행<br>
 * 문법)
 * 	while (조건식) { <br>
 * 		반복수행문장;<br>
 * 	}
 * @author owner
 */
public class TestWhile {

	public static void main(String[] args) {
		int i=0; //초기값
		
		while(i<10) { //조건식
			System.out.println("i="+i); //반복수행 문장
			i++; //증가식
		}//end while
		
		System.out.println("------------------------------------");
		
		
		//단을 입력받아 2~9단 사이라면 구구단 출력
		int a = Integer.parseInt(args[0]);
		int j = 1;
		
		while(0<a&&a<10) {
			System.out.println(a+" * "+j+" = "+a*j);
			j++;
			if(j>9) {
				break;
			}
		}
		
		//무한 loop
		i=0;
		while(true) {
			System.out.println("무한 loop");
			if(i==5) {
				break;
			}
			i++;
		}
		
	}//main

}//class
