package day1218;

import java.util.Random;

/**
 * ���ܸ� ������ �߻�
 * @author owner
 */
public class TestThrow {

	public void teacksung() throws Exception {
		String[] grade = {"�ʵ��л�","���л�","����л�"};
		String randomGd = grade[new Random().nextInt(grade.length)];
		
		if(randomGd.equals("�ʵ��л�")) {
			throw new Exception(randomGd+" ��Ե� �ݿ��ؾ��ϴ� �κ� �ƴϰڽ��ϱ�? ����? ������");
		} else {
			System.out.println(randomGd+"�� ��踦 �ǿ�� ��ô ��������.");
		}
		
	}
	
	/**
	 * ���� ���ٰ� ��踦 �ǿ�� �л��� ���� ���ǻ�ȸ�� �����Ѵ�.
	 * @throws Exception 
	 */
	public void teacksung2() {
		String[] grade = {"�ʵ��л�","���л�","����л�"};
		String randomGd = grade[new Random().nextInt(grade.length)];
		
		if(randomGd.equals("�ʵ��л�")) {
				throw new TobaccoException(/*randomGd+" ��Ե� �ݿ��ؾ��ϴ� �κ� �ƴϰڽ��ϱ�? ����? ������"*/);
		} else {
			System.out.println(randomGd+"�� ��踦 �ǿ�� ��ô ��������.");
		}
		
	}
	
	public static void main(String[] args) {
		TestThrow tt = new TestThrow();
		try {
			tt.teacksung();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("-----------------");
		try {
			tt.teacksung2();
		} catch (TobaccoException e) {
			e.printStackTrace();
		}
		
	}

}
