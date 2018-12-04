package day1127;

/*
 �ֹι�ȣ�� �Է� �޾� ó���ϴ� ���α׷� �ۼ�
�� �۾��� method�� �����ϰ� ȣ���Ͽ� ����� �޾Ƽ� ó��
1-1. �����ڴ� �ֹι�ȣ�� �޾� instance ������ �Ҵ��Ѵ�.
- �ν��Ͻ� ������ �� ���
1-2 �ֹι�ȣ�� ����üũ�Ͽ� 14�ڰ� �ƴϸ� false ��ȯ
1-3. �ֹι�ȣ�� 6��° �ڸ��� '-'�� �ƴϸ� false ��ȯ
1-4. �ֹι�ȣ�� ��ȿ�������Ͽ� ��ȿ�ϸ� true/false��ȯ
'�� �ڸ��� 2 3 4 5 6 7 8 9 2 3 4 5�� ���� ���� ���Ͽ� 11�� ���� ������ ���� ���
11���� �� ���� ���� 10���� ���� �������� �ֹι�ȣ�� ���ڸ��� ���ٸ� true/ �ƴϸ� false'

1-5. ������� ��ȯ�ϴ� �� '1988-11-11'
1-6. ���̸� ��ȯ�ϴ� ��
1-7. ������ ��ȯ (��, ��)
1-8 ������/�ܱ��� ��ȯ
	�������� 0,1,2,3,4,9 �ܱ����� 5,6,7,8
1-9. �츦 ��ȯ "���"
 */
public class HomeworkSsn {
	
	//1-1
	private String ssn;
	public HomeworkSsn(String ssn) {
		this.ssn = ssn;
	}
	
	//1-2
	private boolean checklength() {
		boolean flag=false;
		
		if(ssn.length()==14) {
			flag=true;
		}
		return flag;
	}
	
	//1-3
	private boolean check_6() {
		boolean flag=false;
		
		if(ssn.charAt(6)=='-') {
			flag=true;
		}
		return flag;
	}
	
	//1-4
	private boolean validssn() {
		boolean flag=false;
		int ssnSum = 0;
		int[] arrssn = new int[13];
		
		//�� �ڸ��� ���ڸ� ���ϱ� ���� �迭�� �������
		for(int i =0; i<arrssn.length; i++) {
			arrssn[i]=Integer.valueOf(ssn.charAt(i)-'0');
		}
		
		for(int i = 0; i<10; i++) {
			if(i<=7) {
				arrssn[i] = arrssn[i]*(i+2);
			} else if(i>=8) {
				i=2;
				arrssn[i+6] = arrssn[i+6]*i;
				if (i==5) {
					break;
				}
			}
			ssnSum += arrssn[i];
		}
		
		if(arrssn[13]==(11-(ssnSum%11))%10) {
			flag=true;
		}
		return flag;
	}
	
	

	public static void main(String[] args) {
		
		String ssn = "121212-1234567";
		HomeworkSsn checkssn = new HomeworkSsn(ssn);
		
		System.out.println(checkssn.ssn);
		
		if(checkssn.checklength()) {
			if(checkssn.check_6()) {
				if(checkssn.validssn()) {
					System.out.println(checkssn.validssn());
//					System.out.println("���̹�ȯ");
//					System.out.println("������ȯ");
//					System.out.println("��/�ܱ��ι�ȯ");
//					System.out.println("�� ��ȯ");				
				} else {
					System.out.println("�߸��� �ֹι�ȣ �Դϴ�.");
				}
			} else {
				System.out.println("'-'�� ��ġ�� �߸��Ǿ����ϴ�.");
			}
		} else {
			System.out.println("�߸��� �ֹι�ȣ �Դϴ�.");
		}

	}//main

}//class
