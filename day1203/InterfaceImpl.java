package day1203;

/**
 * interface를 구현하는 class(자식클래스이고 interface 내 모든 추상 method를 Override 하는 클래스<br>
 * 구현 interface가 부모 interface를 가진다면 최종적인 자식클래스에서는 모든 추상method를 구현해야한다.
 * @author owner
 */
public class InterfaceImpl implements SuperInterface{
	
	public String msg() {
		return "오늘은 화요일";
	}
	
	public String msgB() {
		return "오늘은 월요일";
	}
	
	@Override
	public void methodA() {
		
	}
	
	@Override
	public void methodB(int i) { //SuperInterface
		System.out.println("methodB");
	}
	
	public void test() {
		
	}
	
	// InterfaceImpl extends object이 존재
	public static void main(String[] args) {
		//자식 클래스로 객체화 : 모든 method를 호출할 수 있다.
		//ii.msg(), ii.msgB(), ii.methodA(), ii.methodB(), ii.test()
		InterfaceImpl ii = new InterfaceImpl();
		ii.methodB(12);
		
		//is a 관계의 객체화
		//SuperInterface로 객체화를 하면 Override된 method만 호출
		//부모의 method도 모두 호출 가능
		//1. InterA, 2.InterB, 3.SuperInterface, 4. 모두 다 //정답은 모두 다~!
		//si.msg(), si.msgB(), si.methodA(), si.methodB()
		SuperInterface si = new InterfaceImpl();
		System.out.println(si.msg());
		
		//InterA로 객체화하면 : ia.msg()만 호출 가능
		InterA ia = new InterfaceImpl();
		System.out.println(ia.msg());
		
		//InterB로 객체화하면 : ib.msgB()만 호출 가능
		InterB ib = new InterfaceImpl();
		System.out.println(ib.msgB());
		
		//Object o = new InterfaceImpl
		//interface는 객체화되지 않는다.
		//InterA ia1 = new InterA(); //ERROR
		//SuperInterface si1 = new SuperInterface(); //마찬가지로 ERROR
		//자식을 통해서만 객체가 전달된다!!!!!!
		
		
	}
}
