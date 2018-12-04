package day1128;


/**
 * 4강의장 학생들의 성적처리 프로그램<br>
 * 
 * 최고, 최하 구하는 원리<br>
 * 처음방의 값을 변수에 저장하고 옆방의 값과 비교하여(if) 변수값이 작다면(조건) 옆방의 값으로 변수의 값을 변경하고<br>
 * 변경된 변수의 값으로 그 다음 방의 값을 비교하여 변경하는 작업을 끝까지 수행한다.(반복)<br>
 * 
 * 오름차순, 내림차순 정렬(버블정렬)<br>
 * 처음방의 값과 옆방의 값을 비교하여 앞방의 값이 뒷방의 값보다 작다면 앞방의 값과 뒷방의 값을 바꾼다.<br>
 * 이 작업이 끝 방까지~
 * @author owner
 */
	public class ScoreProcess {
	
		public ScoreProcess() {
		String[] nameArr= {"이재찬", "정택성", "이재현", "김건우", "공선의"};
		int[] scoreArr= {89,76,99,64,50};
		int totalScore = 0; //총점 누적 합
		int maxScore = 0; //최고점
		int minScore = 101; //최하점
		int temp = 0; //정렬할 값을 임시로 저장할 변수
		
		System.out.println("번호\t이름\t점수");
		System.out.println("---------------------------");
		
		
		
		for(int i = 0; i <nameArr.length; i++) {
			System.out.printf("%d\t%s\t%d\n",i,nameArr[i],scoreArr[i]);
			totalScore += scoreArr[i]; //totalScore = totalScore+scoreArr[i]
			
			//최하점수가 현재 순환중인 방의 값보다 작다면
			if(maxScore<scoreArr[i]) {//최하점 구하기
				//현재 순환중인 방의 값으로 최하점수를 변경해준다.
				maxScore=scoreArr[i];
			}
			
			//최저점수가 현재 순환중인 방의 값보다 크다면
			if(minScore>scoreArr[i]) {//최저점 구하기
				//현재 순환중인 방의 값으로 최저점수를 변경해준다.
				minScore=scoreArr[i];
			}
		}
		
		System.out.println("---------------------------");
		System.out.println("응시인원 : "+nameArr.length+"명 입니다.");
		System.out.printf("총점 [%5d] 평균 [%.2f]\n",totalScore, (double)(totalScore/nameArr.length));
		//정수 나누기 정수여서 실수로 표현할 수 없다. ERROR 난다. 캐스팅하자!
		System.out.printf("최고점 [%3d], 최저점[%d]\n",maxScore,minScore);
		
		for(int i = 0; i < scoreArr.length-1; i++) {
			for(int j = i+1; j < scoreArr.length; j++) {
				if(scoreArr[i] < scoreArr[j]) { //앞방의 값이 뒷방보다 작다면 내림차순, 크다면 오름차순
					temp = scoreArr[i];
					scoreArr[i]=scoreArr[j];
					scoreArr[j]=temp;
					
				}//end if
			}//end for-j
		}//end for-i
		
		for(int i = 0; i < scoreArr.length; i++) {
			System.out.printf("%-4d", scoreArr[i]);
		}
	}
		
	
	
	public static void main(String[] args) {
		new ScoreProcess();
		System.out.println("=======================================");
		//숙제 띠 간단하게 구하기
		int birth=1995;
		String[] zodiac = {"원숭이", "닭", "개", "돼지", "쥐", "소", "호랑이", "토끼", "용", "뱀", "말", "양"};
		System.out.println(zodiac[birth%12]);

	}//main

}//class
