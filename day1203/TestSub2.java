package day1203;

public class TestSub2 extends TestSuper {
	int i;
	public TestSub2() {
		super();
		System.out.println("�ڽ��� ������222222");
	}
	
	public void subMethod() {
		System.out.println("�ڽ��� subMethod222222");
	}
	
	@Override
	public void printl() {
		System.out.println("�ڽ�222222222�� Override�� method "+this.i+", �θ��� i = "+super.i);
	}

	public static void main(String[] args) {

	}

}
