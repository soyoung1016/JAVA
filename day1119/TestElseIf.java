package day1119;

/**
 * else~if : 연관된 여러 조건을 비교할 때.<br>
 * 문법) if(조건식) {<br>
 * 			조건에 맞을 때 수행 문장;<br>
 * 		} else if(조건식) {
 * 			조건에 맞을 때 수행 문장;<br>
 * 		} else if(조건식 ) {
 * 			조건에 맞을 때 수행 문장;<br>
 * 		} else if(조건식 ) {
 * 			조건에 맞을 때 수행 문장;<br>
 * 			.<br>
 * 			.<br>
 * 		} else {
 * 			모든 조건에 맞지 않을 때 수행 문장;
 * 		}	
 * @author owner
 */
public class TestElseIf {

	public static void main(String[] args) {
		
		int i=Integer.parseInt(args[0]);
		
		System.out.println(i+"는(은)");
		if (i < 0) {
			System.out.println("0보다 작아서 실패");
		} else if (i > 100) {
			System.out.println("100보다 커서 실패");
		} else {
			System.out.println("입력성공");
		}//end else
		
		//이름을 입력 받아 "이재찬" 이면 반장을
		//"이봉현, 박영민, 김정운, 오영근" 이면 조장를
		// 그렇지 않으면 "평민"을 이름 앞에 출력하세요. "직책 이름"
		if (args[1].equals("이재찬")) {
			System.out.print("반장 ");
		} else if (args[1].equals("이봉현")||args[1].equals("박영민")||args[1].equals("김정운")||args[1].equals("오영근")) {
			System.out.print("조장 ");
		}	 else {
			System.out.print("평민 ");
		}//end else
			System.out.println(args[1]+"님 안녕하세요");
			
			
		//태어난 해(를 입력받아 띠(12) 구하기
		//11-양, 10-말, 9-뱀, 8-용, 7-토끼, 6-호랑이, 5-소, 4-쥐, 3-돼지, 2-개, 1-닭, 0-원숭이
			
		int a = (Integer.parseInt(args[2]))%12;
		
			System.out.print(args[2]+"는(은) ");
			if (a==11) {
				System.out.print("양띠 ");
			} else if (a==10) {
				System.out.print("말띠 ");
			} else if (a==9) {
				System.out.print("뱀띠 ");
			} else if (a==8) {
				System.out.print("용띠 ");
			} else if (a==7) {
				System.out.print("토끼띠 ");
			} else if (a==6) {
				System.out.print("호랑이띠 ");
			} else if (a==5) {
				System.out.print("소띠 ");
			} else if (a==4) {
				System.out.print("쥐띠 ");
			} else if (a==3) {
				System.out.print("돼지띠 ");
			} else if (a==2) {
				System.out.print("개띠 ");
			} else if (a==1) {
				System.out.print("닭띠 ");
			} else {
				System.out.print("원숭이띠 ");
			} //end else
				System.out.println("입니다.");
			

	}//main

}//class
