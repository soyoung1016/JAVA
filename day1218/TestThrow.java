package day1218;

import java.util.Random;

/**
 * 예외를 강제로 발생
 * @author owner
 */
public class TestThrow {

	public void teacksung() throws Exception {
		String[] grade = {"초등학생","중학생","고등학생"};
		String randomGd = grade[new Random().nextInt(grade.length)];
		
		if(randomGd.equals("초등학생")) {
			throw new Exception(randomGd+" 행님들 금연해야하는 부분 아니겠습니까? ㅇㅈ? ㅇㅇㅈ");
		} else {
			System.out.println(randomGd+"이 담배를 피우면 모른척 지나간다.");
		}
		
	}
	
	/**
	 * 길을 가다가 담배를 피우는 학생을 보면 정의사회를 구현한다.
	 * @throws Exception 
	 */
	public void teacksung2() {
		String[] grade = {"초등학생","중학생","고등학생"};
		String randomGd = grade[new Random().nextInt(grade.length)];
		
		if(randomGd.equals("초등학생")) {
				throw new TobaccoException(/*randomGd+" 행님들 금연해야하는 부분 아니겠습니까? ㅇㅈ? ㅇㅇㅈ"*/);
		} else {
			System.out.println(randomGd+"이 담배를 피우면 모른척 지나간다.");
		}
		
	}
	
	public static void main(String[] args) {
		TestThrow tt = new TestThrow();
		try {
			tt.teacksung();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("-----------------");
		try {
			tt.teacksung2();
		} catch (TobaccoException e) {
			e.printStackTrace();
		}
		
	}

}
