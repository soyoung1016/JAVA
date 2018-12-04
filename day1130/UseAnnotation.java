package day1130;

import java.util.ArrayList;
import java.util.List;

/**
 * JDK1.5�������� �߰��� annotation�� ���
 * Deprecated, Override, SuppressWarnings
 * @author owner
 */
public class UseAnnotation {
	
	/**
	 * �� �޼Ҵ� �ڶ� ������ �߻���ų�� �ֽ��ϴ�.
	 */
	@Deprecated
	public void test() {
		System.out.println("���Ŀ� ������ �߻��� method");
	}
	
	public String toString() {
		return "���";
	}
	
	//method���� �����ϸ� method ���� ��� ��� ��Ȳ�� �����Ѵ�.
	@SuppressWarnings({"rawtypes","unused"})
	public void temp() {
		//unused ������ ������� ������ ��� ����
//		@SuppressWarnings("unused")
		int i=0;
		
		//rawtypes : Generic�� ������� ���� �� ��� ����
		//�������� �����ϸ� �ٷ� �Ʒ��� �ִ� ������ ��� �����ϰ�
//		@SuppressWarnings({"rawtypes","unused"})
		List l = new ArrayList();
		
		int j=0;
		System.out.println("temp j="+j);
	}

	public static void main(String[] args) {
		UseAnnotation ua = new UseAnnotation();
		ua.test();
		
		System.out.println(ua);
	}//main

}//class
