package day1130;

public class SuperConstr {
	int i;
	
//	public SuperConstr() {
//		super();
//		System.out.println("�θ� �⺻ ������");
//	}
//	
//	public SuperConstr(int i) {
//		super();
//		this.i=i;
//		System.out.println("�θ� ���� ������"+i);
//	}
	
	public SuperConstr() {
//		super();//1��
		this(100);
		System.out.println("�θ� �⺻ ������");
	}
	
	public SuperConstr(int i) {
//		this(); //1��
		super();
		this.i=i;
		System.out.println("�θ� ���� ������ "+i);
	}
}
