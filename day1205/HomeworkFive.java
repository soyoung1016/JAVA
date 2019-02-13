package day1205;

import java.util.StringTokenizer;


/*
1. 1~45까지의 사이의 수중에서 무작위로 하나를 뽑아 6개의 세트를 만들어
배열로 반환하는 method를 만들고 호출하여 출력할것
단, 중복된 수는 배열에 입력되지 않아야한다.


2. 아래 제시된 문자열을 구분 문자로 잘라내어 문자열 배열에 저장하고
반환하는 일을 하는 method를 작성하세요.

"이재찬,이재현.공선의,정택성~이재현!최지우.김희철,이재찬,이재찬,정택성.공선의"

출력;
이재찬 이재현 공선의 정택성 이재현 최지우 김희철 이재찬 이재찬 정택성 공선의
 */
public class HomeworkFive {
	
	public int[] randomHome() {
		int[] tempNumber = new int[6];
		
		
		for (int i=0; i < tempNumber.length; i++) {
			tempNumber[i] = (int)((Math.random()*45)+1); //0부터 0.9999~~~~ 에 45를 곱하고 캐스팅하면 0~44가 나오고, +1을 하면 문제 범위 1~45가 나온다
			for (int j=0; j<i; j++) {
				if (tempNumber[i]==tempNumber[j]) {
					i--;
					break;
				}
			}//end for
			System.out.print(tempNumber[i]+" ");
		}//end for
		
		
		return tempNumber;
	}
	
	
	//2번
	public String printName() {
		String names = "이재찬,이재현.공선의,정택성~이재현!최지우.김희철,이재찬,이재찬,정택성.공선의";
		StringTokenizer st = new StringTokenizer(names, ",.~!");
		
		while(st.hasMoreTokens()) {
			System.out.print(st.nextToken()+" ");
			}
		
		
		return "";
	
	}
	
	public static void main(String[] args) {
		HomeworkFive hf = new HomeworkFive();
		hf.printName();
		System.out.println(" ");
		hf.randomHome();
	}

}
