package day1203;

/**
 * 구현 클래스(자식클래스)에서 반드시 구현해야하는 일의 목록만 정의하는 interface 사용법<br>
 * 구현의 강제성
 * @author owner
 */
public interface SuperInterface extends InterA, InterB {
	//constant : 변수를 상수처럼 사용
	//int i; 변수는 작성할 수 없다. ERROR
	public static final int FLAG_VELU2 = 12;
	
	//추상 method 구성
	//일반 method는 가질 수 없다. ERROR
//	public void test() {
//	}
	
	//인터페이스간 상속에는 추상 method를 Override하지 않는다.
//	@Override
//	public String msg();
	
	//abstract를 사용하지 않아도 된다.
	public void methodA();
	//abstract를 사용해도 된다.
	public abstract void methodB(int i);
	
	
	
}
