package day1218;

/**
 * 사용자정의 예외처리 클래스
 * @author owner
 */
//1. Exception이나 RuntimeException을 상속 받는다.
@SuppressWarnings("serial")
public class TobaccoException extends RuntimeException{ //여기서 Runtime예외를 쓰면 TestThorw.java에서 try catch를 쓰지 않아도 ERROR가 안남.
	
	public TobaccoException() {
		this("담배예외-폐암의 원인 흡연! 그래도 피우시겠습니까?");
	}
	
	public TobaccoException(String msg) {
		super(msg);
	}
	
}
