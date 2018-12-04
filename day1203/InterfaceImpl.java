package day1203;

/**
 * interface�� �����ϴ� class(�ڽ�Ŭ�����̰� interface �� ��� �߻� method�� Override �ϴ� Ŭ����<br>
 * ���� interface�� �θ� interface�� �����ٸ� �������� �ڽ�Ŭ���������� ��� �߻�method�� �����ؾ��Ѵ�.
 * @author owner
 */
public class InterfaceImpl implements SuperInterface{
	
	public String msg() {
		return "������ ȭ����";
	}
	
	public String msgB() {
		return "������ ������";
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
	
	// InterfaceImpl extends object�� ����
	public static void main(String[] args) {
		//�ڽ� Ŭ������ ��üȭ : ��� method�� ȣ���� �� �ִ�.
		//ii.msg(), ii.msgB(), ii.methodA(), ii.methodB(), ii.test()
		InterfaceImpl ii = new InterfaceImpl();
		ii.methodB(12);
		
		//is a ������ ��üȭ
		//SuperInterface�� ��üȭ�� �ϸ� Override�� method�� ȣ��
		//�θ��� method�� ��� ȣ�� ����
		//1. InterA, 2.InterB, 3.SuperInterface, 4. ��� �� //������ ��� ��~!
		//si.msg(), si.msgB(), si.methodA(), si.methodB()
		SuperInterface si = new InterfaceImpl();
		System.out.println(si.msg());
		
		//InterA�� ��üȭ�ϸ� : ia.msg()�� ȣ�� ����
		InterA ia = new InterfaceImpl();
		System.out.println(ia.msg());
		
		//InterB�� ��üȭ�ϸ� : ib.msgB()�� ȣ�� ����
		InterB ib = new InterfaceImpl();
		System.out.println(ib.msgB());
		
		//Object o = new InterfaceImpl
		//interface�� ��üȭ���� �ʴ´�.
		//InterA ia1 = new InterA(); //ERROR
		//SuperInterface si1 = new SuperInterface(); //���������� ERROR
		//�ڽ��� ���ؼ��� ��ü�� ���޵ȴ�!!!!!!
		
		
	}
}
