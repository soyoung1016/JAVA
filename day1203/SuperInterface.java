package day1203;

/**
 * ���� Ŭ����(�ڽ�Ŭ����)���� �ݵ�� �����ؾ��ϴ� ���� ��ϸ� �����ϴ� interface ����<br>
 * ������ ������
 * @author owner
 */
public interface SuperInterface extends InterA, InterB {
	//constant : ������ ���ó�� ���
	//int i; ������ �ۼ��� �� ����. ERROR
	public static final int FLAG_VELU2 = 12;
	
	//�߻� method ����
	//�Ϲ� method�� ���� �� ����. ERROR
//	public void test() {
//	}
	
	//�������̽��� ��ӿ��� �߻� method�� Override���� �ʴ´�.
//	@Override
//	public String msg();
	
	//abstract�� ������� �ʾƵ� �ȴ�.
	public void methodA();
	//abstract�� ����ص� �ȴ�.
	public abstract void methodB(int i);
	
	
	
}
