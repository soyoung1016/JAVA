package day1130;

public class SubConstr extends SuperConstr {	//상속한다.
	int i;
	
//	public SubConstr() {
//		super(100);	//super가 숨어있어서 상속되었기 때문에 부모가 먼저 나오고 자식이 나온다.
//		System.out.println("자식 기본 생성자");
//	}
//	
//	public SubConstr(int i) {
//		super(200);	//여기도 마찬가지
//		System.out.println("자식 인자 생성자 "+i);
//	}
	public SubConstr() {
//		this(200);//1번
		super();
		System.out.println("자식 기본 생성자");
	}
	
	public SubConstr(int i) {
//		super(300);//1번
		this();
		System.out.println("자식 인자 생성자 "+i);
	}

}
