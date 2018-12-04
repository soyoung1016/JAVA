package day1129;

/**
 * 사람의 공통 특징은 Person에서 끌어다쓰고 자신의 강점을 정의한 클래스
 * @author owner
 */

public class Soyoung extends Person {
	
	public int octave;
	
	public Soyoung() {
		octave=10;
	}
	
	public String singing(String drink) {
		String Song = "";
		
		if(drink.equals("날달걀")) {
			octave=30;
			Song = "밤의 여왕 아리아";
		} else if (drink.equals("물")) {
			octave=15;
			Song = "think of me";
		} else if (drink.equals("우유")) {
			octave=1;
			Song = "삑사리";
		} else {
			octave=10;
			Song = "애국가";
		}
		return Song;
	}
		
	
	
	
	
	
}
