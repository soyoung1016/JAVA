package day1203;

/**
 * default method : �������̽����� ����(�ڹ��ڵ�)�� ����� �� �ִ� method<br>
 * default method�� ȣ���Ϸ��� ���� Ŭ������ is a ������ ��üȭ�� �ؾ߸� �Ѵ�.
 * @author owner
 */
public interface UseDefault {
	public void test();
	
	public default void temp() {
		System.out.println("����ó�� �ڵ� ����");
	}
}
