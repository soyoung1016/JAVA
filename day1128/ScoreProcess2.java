package day1128;

/**
 * 학생의 Oracle, java, JDBC 과목 점수를 처리하는 프로그램
 * @author owner
 */
public class ScoreProcess2 {
	
	private int total;
	private double avgtotal;
	
	public ScoreProcess2() {
		total=0;
	}
	
	/**
	 * 점수를 누적 합 시킨다.
	 * @param score
	 */
	public void addTotal(int score) {
		total += score;
	}//setTotal

	/**
	 * 점수를 얻는 일을 함.
	 * @return
	 */
	public int getTotal() {
		return total;
	}
	
	/**
	 * 점수를 얻는 일을 함.
	 * @return
	 */
	public void avgTotal(int total) {
		avgtotal = total/3;
	}
	
	
	
	/**
	 * 평균 점수를 얻는 일을 함
	 * @return
	 */
	public double resultAvg() {
		return avgtotal;
	}
	
	/**
	 * 평균 점수를 초기화
	 */
	public void resetAvg() {
		avgtotal=0;
	}//resetTotal
	
	/**
	 * 총합 점수를 초기화
	 */
	public void resetTotal() {
		total=0;
	}//resetTotal
	
	public String[] namesData() {
		String[] name = {"김정운", "이재현", "정택성", "노진경", "최지우", "김건하"};
		return name;
	}
	
	public int[][] scoreData() {
		int[][] score = {{85,86,81}, {95,91,100}, {89,71,59}, {97,96,91}, {78,74,77}, {100,95,68}};
		return score;
	}
	
	public void printScore(String[] name, int[][] score) {
//		int total = 0;
		/*
		 * 11/28 숙제
		 * 숙제 1.
		 * 모든 일은 합당한 매개변수와 반환형을 사용하여 method로 정의하여 호출하여 사용한다
		 * 1-1. 각 학생의 평균을 구하여 출력.(출력은 소수 이하 한자리 까지만 출력)
		 */
		System.out.println("번호\t이름\tOracle\tJava\tJDBC\t총점\t평균");
		System.out.println("============================================================");
		
		for(int i = 0; i<name.length; i++) { //행
			System.out.printf("%d\t%s\t",i+1,name[i]);
			for(int j = 0; j < score[i].length; j++) { //열
			//	System.out.printf("%d\t&d",score[i][j],);
				//total +=score[i][j]; //프린트라는 업무에는 맞지 않음. 다 메소드로 넣쟈~~!
				addTotal(score[i][j]);
			//	avgTotal();
			}//end for-열
//			System.out.println(total);
			System.out.println(getTotal());
			System.out.println(resultAvg());
			resetTotal();
			resetAvg();
		}//end for-행
		System.out.println("============================================================");
		/*
		 * 1-2. 각 과목당 총점과 총점의 총점
		 */
		System.out.println("과목총점=======================================================");
		
		/*
		 * 1-3. 각 과목당 평균과 전체 평균(전체평균은 소수이하 두자리까지 출력)
		 */
		System.out.println("과목평균=======================================================");
		
		/*
		 * 1-4. 각 과목당 최고점수를 출력
		 */
		System.out.println("최고 점수-오라클[] 자바[] JDBC[]===================================");
				
		/*
		 * 1-5. 일등 학생의 이름과 총점, 번호
		 */
		System.out.println("TOP 번호[] 이름[] 총점[]=========================================");
		
		/*
		 * 1-6. 자바점수만 오름차순 정렬하여 출력.
		 */
		System.out.println("TOP 번호[] 이름[] 총점[]=========================================");
				
	}
	
	/*
	 * 숙제2.
	 * 2차원 배열을 참조형 형식으로 만들고 아래와 같이 값을 넣어 출력하는 method 작성
	 * 1 1 1 1 1 1 1 1 1
	 * 1 0 0 0 0 0 0 0 1
	 * 1 0 0 0 0 0 0 0 1
	 * 1 0 0 0 0 0 0 0 1
	 * 1 0 0 0 0 0 0 0 1
	 * 1 1 1 1 1 1 1 1 1
	 */
	
	//int[][] a = new int[5][5]
	//for(int i=0; i<a.length; i++) { //행
//		for(int j=0; j<a[i].length; j++) { //열
//			a[i][j] = i==0||i==a.length-1?
//		}
	//}
	
	
	public static void main(String[] args) {
		ScoreProcess2 sp2 = new ScoreProcess2();
		//처리할 데이터 받기
		String[] name = sp2.namesData();
		int[][] score = sp2.scoreData();
		//처리
		sp2.printScore(name,score);
	}//main

}//class
