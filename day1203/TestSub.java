package day1203;

public class TestSub extends TestSuper {
	int i;
	public TestSub() {
		super();
		System.out.println("�ڽ��� ������");
	}
	
	public void subMethod() {
		System.out.println("�ڽ��� subMethod");
	}
	
	@Override
	public void printl() {
		System.out.println("�ڽ��� Override�� method "+this.i+", �θ��� i = "+super.i);
	}

	public static void main(String[] args) {

	}

}
