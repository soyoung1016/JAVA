package day1130;

public class SubConstr extends SuperConstr {	//����Ѵ�.
	int i;
	
//	public SubConstr() {
//		super(100);	//super�� �����־ ��ӵǾ��� ������ �θ� ���� ������ �ڽ��� ���´�.
//		System.out.println("�ڽ� �⺻ ������");
//	}
//	
//	public SubConstr(int i) {
//		super(200);	//���⵵ ��������
//		System.out.println("�ڽ� ���� ������ "+i);
//	}
	public SubConstr() {
//		this(200);//1��
		super();
		System.out.println("�ڽ� �⺻ ������");
	}
	
	public SubConstr(int i) {
//		super(300);//1��
		this();
		System.out.println("�ڽ� ���� ������ "+i);
	}

}
