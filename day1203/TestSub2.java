package day1203;

public class TestSub2 extends TestSuper {
	int i;
	public TestSub2() {
		super();
		System.out.println("자식의 생성자222222");
	}
	
	public void subMethod() {
		System.out.println("자식의 subMethod222222");
	}
	
	@Override
	public void printl() {
		System.out.println("자식222222222이 Override한 method "+this.i+", 부모의 i = "+super.i);
	}

	public static void main(String[] args) {

	}

}
