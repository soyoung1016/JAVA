package day1120;

/**
 * for : 시작과 긑을 알 때 사용하는 반복문<br>
 * 문법 : for (초기값; 끝값; 증가.감소식) {<br>
 * 			반복수행문장; <br>
 * 		}
 * @author owner
 */
public class TestFor {

	public static void main(String[] args) {
		//0~에서부터 10보다 작을 때까지 반복수행하는 for
		
		for (int i =0; i<10; i++) {
			System.out.println(i+"번 안녕");
		}//end for
		
		System.out.println("=======================================");
		//1에서부터 1씩 증가하며 100까지 반복 수행 for
		
		//가급적이면 반복문에서는 작거나 같다를 사용하지 않는다. 작은지 같은지 두번씩 물어보기 때문에!
		for (int i = 1; i<101; i++) {
			System.out.println(i+"번째 반복");
		}
		
		//1에서부터 100까지 짝수만 옆으로 출력 for
		//증.감소식은 변수에 값을 변화시키고 유지 시킬수있는 모든 연산자를 사용할 수 있다.
		//for (int i = 1; i<101; i+=2) 이런식으로도 가능 => 반복 수행 횟수를 줄일 수 있다. 이렇게 해도 같은 결과지만 수행 횟수는 절반으로 준다.
		for (int i = 1; i<101; i++) {
			
			if (i%2==0) {
				System.out.print(i);
			}
		}
		
		//몇번 반복했는지 확인하는 for
		int cnt=0;
		for (int i = 1; i<101; i++) {
			cnt++;
			//if (i%2==0) {
				//System.out.print(i);
			//}
		}
		System.out.println("\n"+cnt+"번");
		
		
		
		//1~100까지 출력하기 3의 배수마다 숫자대신 "짝"을 출력하는 for
		//
		for(int i=1; i<101; i++) {
			if(i%3==0) {
				System.out.print("짝 ");
			} else {
			System.out.print(i+" ");
			}
		}
		
		System.out.println(" ");

		//1~100까지의 합 출력하는 for, 출력 : 1에서부터 100까지의 합은 5050
		int sum=0;
		for(int i=1; i<101; i++) {
			sum=i+sum;
		}
		System.out.println(sum);
		
		
		System.out.println(" ");
		
		//알파벳 A ~ Z 까지 출력하는 for
		for (char c='A'; c<='Z'; c++) {
			System.out.print(c);
		}
		
		System.out.println(" ");
		
		for(char c=65; c<91; c++) {
			System.out.print((char)c);
		}
		
		System.out.println(" ");
		
		//구구단 2단 for
		for (int i=1; i<10; i++){
			System.out.println(2+" * "+i+" = "+2*i);
		}

		
	}//main

}//class
