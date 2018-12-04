package day1129;
/*
 * �Է°�
 * 1, ������, ����� ������ ���ﵿ, 28,����
2, ������, ����� ���빮�� ��ʸ���, 27,����
3, ������, ������ ���뱸 ���뵿, 26,����
4, ���ü�, ����� ���α� ���ε�,27, ����
5, ���ü�, ����� ���۱� �󵵵�,29,����
6, �����, ��⵵ ��õ�� ��õ��,26,����
7, �����, ����� ������ �����絿,27,����
 ����� ������ x��
 ���� �� x��
 �ְ���� "���ü�(����)"
 
 1. ���ǰ��� �迭�� �Է��ϴ� method�� �ۼ��Ұ�.
2. �迭�� �Էµ� ���� ����ϴ� method �� �ۼ��Ұ�.
   2�� method ���� ����ÿ� ��� �ִ� �ο����� ��� �Ұ�.
   2�� method ���� ������ ���� ��� �Ұ�.
   2�� method ���� ���� ���̰� ���� ����� �̸��� ��� �� ��.
 */
public class Homework_1129 {
	public Homework_1129() {
		HwHuman[] humanArr = null;
		humanArr = new HwHuman[7];

		humanArr[0] = new HwHuman("������", "����� ������ ���ﵿ", 28, "����");
		humanArr[1] = new HwHuman("������", "����� ���빮�� ��ʸ���", 27, "����");
		humanArr[2] = new HwHuman("������", "������ ���뱸 ���뵿", 26, "����");
		humanArr[3] = new HwHuman("���ü�", "����� ���α� ���ε�", 27, "����");
		humanArr[4] = new HwHuman("���ü�", "����� ���۱� �󵵵�", 29, "����");
		humanArr[5] = new HwHuman("�����", "��⵵ ��õ�� ��õ��", 26, "����");
		humanArr[6] = new HwHuman("�����", "����� ������ �����絿", 27, "����");
		
		HwHuman temphuman = null;
		int seoulcount = 0; //���� ������ ��
		int totalAge = 0; // ������ ��
		int maxAge = 0; //�ְ��
		String topAge = "";
		String topAgeGender = "";
		for (int i = 0; i<humanArr.length; i++) {
			temphuman=humanArr[i];
			System.out.println(temphuman.getName()+" / " + temphuman.getAdd()+" / "+
					temphuman.getAge()+" / "+temphuman.getGender());
			
			totalAge += humanArr[i].getAge();
			
			if(maxAge<humanArr[i].getAge()) {
				maxAge=humanArr[i].getAge();
			}
			
			if(temphuman.getAdd().startsWith("����")) {
				seoulcount++;
			}
			
			if(maxAge==humanArr[i].getAge()) {
				topAge=humanArr[i].getName();
				topAgeGender=humanArr[i].getGender();
			}
			
		}//end for
		

		System.out.println("����� �����ڴ� "+seoulcount+"�� �Դϴ�.");
		System.out.println("������ �� ���� "+totalAge+"�Դϴ�.");
		System.out.println("�ְ���ڴ� "+topAge+"("+topAgeGender+")"+"�Դϴ�.");

		
	}//end Homework_1129


	
	public static void main(String[] args) {
		new Homework_1129();
	}//main

}//class
