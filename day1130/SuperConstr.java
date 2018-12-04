package day1130;

public class SuperConstr {
	int i;
	
//	public SuperConstr() {
//		super();
//		System.out.println("부모 기본 생성자");
//	}
//	
//	public SuperConstr(int i) {
//		super();
//		this.i=i;
//		System.out.println("부모 인자 생성자"+i);
//	}
	
	public SuperConstr() {
//		super();//1번
		this(100);
		System.out.println("부모 기본 생성자");
	}
	
	public SuperConstr(int i) {
//		this(); //1번
		super();
		this.i=i;
		System.out.println("부모 인자 생성자 "+i);
	}
}
