package day1130;

/**
 * TestSuper�� �ڽ� Ŭ����
 * @author owner
 */
public class TestSub extends TestSuper{
	int p_j;
	
	@Override
	public void method() {
		p_i=400; //�ڵ��� ���뼺
		p_j=500; //���� �̸��� ������ �����ϸ� �ڽ��� ���� ���
		System.out.println("�ڽ��� Method : "+this.p_i+" / "+this.p_j);
		super.method();
		
		System.out.println(this);
//		System.out.println(super); //super�� �ּҴ� ����� �� ����.
		
	}
	
	
	public static void main(String[] args) {
		TestSub ts = new TestSub();
		ts.method();
	}//main

}//class

