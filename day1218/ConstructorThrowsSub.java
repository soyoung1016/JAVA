package day1218;

public class ConstructorThrowsSub extends ConstructorThrows{
	
	//부모클래스의 생성자가 컴파일 예외를 날리면 자식클래스의 생성자에서도 예외를 날려 Error를 없애야 한다.
	public ConstructorThrowsSub() throws ClassNotFoundException{
		super();
		//error를 없애려고 try~catch를 쓰면 생성자의 가장 첫줄에 와야하는 super가 그러지 못하게 되는 경우가 생긴다.
		//부모클래스의 생성자가 Compile Exception을 throws로 날리면
		//생성자를 호출하는 자식 클래스에서는 반드시 예외를 처리해야하는 문법상 Error가 발생한다.
	}
	
	public static void main(String[] args) {

	}

}
