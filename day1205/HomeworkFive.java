package day1205;

import java.util.StringTokenizer;


/*
1. 1~45������ ������ ���߿��� �������� �ϳ��� �̾� 6���� ��Ʈ�� �����
�迭�� ��ȯ�ϴ� method�� ����� ȣ���Ͽ� ����Ұ�
��, �ߺ��� ���� �迭�� �Էµ��� �ʾƾ��Ѵ�.


2. �Ʒ� ���õ� ���ڿ��� ���� ���ڷ� �߶󳻾� ���ڿ� �迭�� �����ϰ�
��ȯ�ϴ� ���� �ϴ� method�� �ۼ��ϼ���.

"������,������.������,���ü�~������!������.����ö,������,������,���ü�.������"

���;
������ ������ ������ ���ü� ������ ������ ����ö ������ ������ ���ü� ������
 */
public class HomeworkFive {
	
	public int[] randomHome() {
		int[] tempNumber = new int[6];
		
		
		for (int i=0; i < tempNumber.length; i++) {
			tempNumber[i] = (int)((Math.random()*45)+1); //0���� 0.9999~~~~ �� 45�� ���ϰ� ĳ�����ϸ� 0~44�� ������, +1�� �ϸ� ���� ���� 1~45�� ���´�
			for (int j=0; j<i; j++) {
				if (tempNumber[i]==tempNumber[j]) {
					i--;
					break;
				}
			}//end for
			System.out.print(tempNumber[i]+" ");
		}//end for
		
		
		return tempNumber;
	}
	
	
	//2��
	public String printName() {
		String names = "������,������.������,���ü�~������!������.����ö,������,������,���ü�.������";
		StringTokenizer st = new StringTokenizer(names, ",.~!");
		
		while(st.hasMoreTokens()) {
			System.out.print(st.nextToken()+" ");
			}
		
		
		return "";
	
	}
	
	public static void main(String[] args) {
		HomeworkFive hf = new HomeworkFive();
		hf.printName();
		System.out.println(" ");
		hf.randomHome();
	}

}
