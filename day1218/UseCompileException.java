package day1218;

/**
 * Compile Exception : byte code�� ���������� �����ϱ� ���� ��
 * �����ڰ� �ݵ�� ����ó���ؾ��ϴ� ����
 * @author owner
 */
public class UseCompileException {

	public static void main(String[] args) {
		
		try {
//			Object obj = Class.forName("java.lang.String");
			Object obj = Class.forName("day1217.UseRuntimeException");
			System.out.println("�ε��� Ŭ����"+obj); //new�� ���� �ʾƵ� ��ü�� �� �� �� �ִ�.
		} catch (ClassNotFoundException cnfe) {
			System.err.println("�˼��մϴ�.");
			System.err.println("���� �޼��� ��� : "+cnfe.getMessage());
			System.err.println("����ó�� ��ü�� �޼��� : "+cnfe);
			cnfe.printStackTrace();
			//println�� ���̾��� �� �Ǵ� ����, ������ ���϶��� �ִ�.
//			System.out.println("--------"); //
			//println�� printStackTrace���� ���� ���
		} finally {
			System.out.println("������ּż� �����մϴ�.");
		}
		
		
		
		
	}//main

}//class
