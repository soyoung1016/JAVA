package day1206;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
1. �Ʒ��� �����͸� ó���ϴ� ���α׷��� �ۼ��ϼ���.
  ������,�̺���,������,���ü�,������,������ �� �����Ͱ� �����ϰ�,
 ������ 0~100�� ���̷� �߻��Ҽ��ֽ��ϴ�.

 ���α׷��� ����Ǹ� ���� ����߿� 2���̻� ����ó�� ����� �̰� 
 n���� �̸��� ������ �����Ͽ� ����ϴ� ���� �ϴ� ���α׷� �ۼ�.
 �ߺ��̸��� �� �� ����.

��� �� )
 ������ 89
 ���ü� 77
 ������ 90
  ����   xx��
 */
public class GradeHome {

	public void Student() {
		//����
		List<String> name = new ArrayList<String>(6);
		
		//�� �߰�
		name.add("������");
		name.add("�̺���");
		name.add("������");
		name.add("���ü�");
		name.add("������");
		name.add("������");
		
		System.out.println(name);
		String[] names = new String[name.size()];
		name.toArray(names);
		
		//���� ����
//		Random r = new Random();
//		
//		//�̸��� ���ڸ� �ο�. ����.
//		int name = r.nextInt(stu.length);
//		
//		//�̸��� �ο��� ���ڸ� �ε����� ��� �̸��� �ҷ���.
//		String names = String.valueOf(name);
//		System.out.println(names.charAt(names));
//		
//		int grade = r.nextInt(101);
//		System.out.println(grade);
		
		
		return;
	}
	
	public static void main(String[] args) {
		GradeHome gh = new GradeHome();
		gh.Student();
	}

}
