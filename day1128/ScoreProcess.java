package day1128;


/**
 * 4������ �л����� ����ó�� ���α׷�<br>
 * 
 * �ְ�, ���� ���ϴ� ����<br>
 * ó������ ���� ������ �����ϰ� ������ ���� ���Ͽ�(if) �������� �۴ٸ�(����) ������ ������ ������ ���� �����ϰ�<br>
 * ����� ������ ������ �� ���� ���� ���� ���Ͽ� �����ϴ� �۾��� ������ �����Ѵ�.(�ݺ�)<br>
 * 
 * ��������, �������� ����(��������)<br>
 * ó������ ���� ������ ���� ���Ͽ� �չ��� ���� �޹��� ������ �۴ٸ� �չ��� ���� �޹��� ���� �ٲ۴�.<br>
 * �� �۾��� �� �����~
 * @author owner
 */
	public class ScoreProcess {
	
		public ScoreProcess() {
		String[] nameArr= {"������", "���ü�", "������", "��ǿ�", "������"};
		int[] scoreArr= {89,76,99,64,50};
		int totalScore = 0; //���� ���� ��
		int maxScore = 0; //�ְ���
		int minScore = 101; //������
		int temp = 0; //������ ���� �ӽ÷� ������ ����
		
		System.out.println("��ȣ\t�̸�\t����");
		System.out.println("---------------------------");
		
		
		
		for(int i = 0; i <nameArr.length; i++) {
			System.out.printf("%d\t%s\t%d\n",i,nameArr[i],scoreArr[i]);
			totalScore += scoreArr[i]; //totalScore = totalScore+scoreArr[i]
			
			//���������� ���� ��ȯ���� ���� ������ �۴ٸ�
			if(maxScore<scoreArr[i]) {//������ ���ϱ�
				//���� ��ȯ���� ���� ������ ���������� �������ش�.
				maxScore=scoreArr[i];
			}
			
			//���������� ���� ��ȯ���� ���� ������ ũ�ٸ�
			if(minScore>scoreArr[i]) {//������ ���ϱ�
				//���� ��ȯ���� ���� ������ ���������� �������ش�.
				minScore=scoreArr[i];
			}
		}
		
		System.out.println("---------------------------");
		System.out.println("�����ο� : "+nameArr.length+"�� �Դϴ�.");
		System.out.printf("���� [%5d] ��� [%.2f]\n",totalScore, (double)(totalScore/nameArr.length));
		//���� ������ �������� �Ǽ��� ǥ���� �� ����. ERROR ����. ĳ��������!
		System.out.printf("�ְ��� [%3d], ������[%d]\n",maxScore,minScore);
		
		for(int i = 0; i < scoreArr.length-1; i++) {
			for(int j = i+1; j < scoreArr.length; j++) {
				if(scoreArr[i] < scoreArr[j]) { //�չ��� ���� �޹溸�� �۴ٸ� ��������, ũ�ٸ� ��������
					temp = scoreArr[i];
					scoreArr[i]=scoreArr[j];
					scoreArr[j]=temp;
					
				}//end if
			}//end for-j
		}//end for-i
		
		for(int i = 0; i < scoreArr.length; i++) {
			System.out.printf("%-4d", scoreArr[i]);
		}
	}
		
	
	
	public static void main(String[] args) {
		new ScoreProcess();
		System.out.println("=======================================");
		//���� �� �����ϰ� ���ϱ�
		int birth=1995;
		String[] zodiac = {"������", "��", "��", "����", "��", "��", "ȣ����", "�䳢", "��", "��", "��", "��"};
		System.out.println(zodiac[birth%12]);

	}//main

}//class
