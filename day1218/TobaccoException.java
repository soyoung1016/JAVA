package day1218;

/**
 * ��������� ����ó�� Ŭ����
 * @author owner
 */
//1. Exception�̳� RuntimeException�� ��� �޴´�.
@SuppressWarnings("serial")
public class TobaccoException extends RuntimeException{ //���⼭ Runtime���ܸ� ���� TestThorw.java���� try catch�� ���� �ʾƵ� ERROR�� �ȳ�.
	
	public TobaccoException() {
		this("��迹��-����� ���� ��! �׷��� �ǿ�ðڽ��ϱ�?");
	}
	
	public TobaccoException(String msg) {
		super(msg);
	}
	
}
