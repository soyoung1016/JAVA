package day1127;

/*
 주민번호를 입력 받아 처리하는 프로그램 작성
각 작업은 method로 정의하고 호출하여 결과를 받아서 처리
1-1. 생성자는 주민번호를 받아 instance 변수에 할당한다.
- 인스턴스 변수의 값 사용
1-2 주민번호의 길이체크하여 14자가 아니면 false 반환
1-3. 주민번호의 6번째 자리가 '-'이 아니면 false 반환
1-4. 주민번호의 유효성검증하여 유효하면 true/false반환
'각 자리에 2 3 4 5 6 7 8 9 2 3 4 5를 곱한 값을 더하여 11로 나눈 나머지 값을 얻고
11에서 그 값을 빼고 10으로 나눈 나머지가 주민번호의 끝자리와 같다면 true/ 아니면 false'

1-5. 생년월일 반환하는 일 '1988-11-11'
1-6. 나이를 반환하는 일
1-7. 성별을 반환 (남, 여)
1-8 내국인/외국인 반환
	내국인은 0,1,2,3,4,9 외국인은 5,6,7,8
1-9. 띠를 반환 "양띠"
 */
public class HomeworkSsn {
	
	//1-1
	private String ssn;
	public HomeworkSsn(String ssn) {
		this.ssn = ssn;
	}
	
	//1-2
	private boolean checklength() {
		boolean flag=false;
		
		if(ssn.length()==14) {
			flag=true;
		}
		return flag;
	}
	
	//1-3
	private boolean check_6() {
		boolean flag=false;
		
		if(ssn.charAt(6)=='-') {
			flag=true;
		}
		return flag;
	}
	
	//1-4
	private boolean validssn() {
		boolean flag=false;
		int ssnSum = 0;
		int[] arrssn = new int[13];
		
		//각 자리에 숫자를 곱하기 위해 배열을 만들어줌
		for(int i =0; i<arrssn.length; i++) {
			arrssn[i]=Integer.valueOf(ssn.charAt(i)-'0');
		}
		
		for(int i = 0; i<10; i++) {
			if(i<=7) {
				arrssn[i] = arrssn[i]*(i+2);
			} else if(i>=8) {
				i=2;
				arrssn[i+6] = arrssn[i+6]*i;
				if (i==5) {
					break;
				}
			}
			ssnSum += arrssn[i];
		}
		
		if(arrssn[13]==(11-(ssnSum%11))%10) {
			flag=true;
		}
		return flag;
	}
	
	

	public static void main(String[] args) {
		
		String ssn = "121212-1234567";
		HomeworkSsn checkssn = new HomeworkSsn(ssn);
		
		System.out.println(checkssn.ssn);
		
		if(checkssn.checklength()) {
			if(checkssn.check_6()) {
				if(checkssn.validssn()) {
					System.out.println(checkssn.validssn());
//					System.out.println("나이반환");
//					System.out.println("성별반환");
//					System.out.println("내/외국인반환");
//					System.out.println("띠 반환");				
				} else {
					System.out.println("잘못된 주민번호 입니다.");
				}
			} else {
				System.out.println("'-'의 위치가 잘못되었습니다.");
			}
		} else {
			System.out.println("잘못된 주민번호 입니다.");
		}

	}//main

}//class
