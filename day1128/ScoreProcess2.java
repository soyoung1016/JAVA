package day1128;

/**
 * �л��� Oracle, java, JDBC ���� ������ ó���ϴ� ���α׷�
 * @author owner
 */
public class ScoreProcess2 {
	
	private int total;
	private double avgtotal;
	
	public ScoreProcess2() {
		total=0;
	}
	
	/**
	 * ������ ���� �� ��Ų��.
	 * @param score
	 */
	public void addTotal(int score) {
		total += score;
	}//setTotal

	/**
	 * ������ ��� ���� ��.
	 * @return
	 */
	public int getTotal() {
		return total;
	}
	
	/**
	 * ������ ��� ���� ��.
	 * @return
	 */
	public void avgTotal(int total) {
		avgtotal = total/3;
	}
	
	
	
	/**
	 * ��� ������ ��� ���� ��
	 * @return
	 */
	public double resultAvg() {
		return avgtotal;
	}
	
	/**
	 * ��� ������ �ʱ�ȭ
	 */
	public void resetAvg() {
		avgtotal=0;
	}//resetTotal
	
	/**
	 * ���� ������ �ʱ�ȭ
	 */
	public void resetTotal() {
		total=0;
	}//resetTotal
	
	public String[] namesData() {
		String[] name = {"������", "������", "���ü�", "������", "������", "�����"};
		return name;
	}
	
	public int[][] scoreData() {
		int[][] score = {{85,86,81}, {95,91,100}, {89,71,59}, {97,96,91}, {78,74,77}, {100,95,68}};
		return score;
	}
	
	public void printScore(String[] name, int[][] score) {
//		int total = 0;
		/*
		 * 11/28 ����
		 * ���� 1.
		 * ��� ���� �մ��� �Ű������� ��ȯ���� ����Ͽ� method�� �����Ͽ� ȣ���Ͽ� ����Ѵ�
		 * 1-1. �� �л��� ����� ���Ͽ� ���.(����� �Ҽ� ���� ���ڸ� ������ ���)
		 */
		System.out.println("��ȣ\t�̸�\tOracle\tJava\tJDBC\t����\t���");
		System.out.println("============================================================");
		
		for(int i = 0; i<name.length; i++) { //��
			System.out.printf("%d\t%s\t",i+1,name[i]);
			for(int j = 0; j < score[i].length; j++) { //��
			//	System.out.printf("%d\t&d",score[i][j],);
				//total +=score[i][j]; //����Ʈ��� �������� ���� ����. �� �޼ҵ�� ����~~!
				addTotal(score[i][j]);
			//	avgTotal();
			}//end for-��
//			System.out.println(total);
			System.out.println(getTotal());
			System.out.println(resultAvg());
			resetTotal();
			resetAvg();
		}//end for-��
		System.out.println("============================================================");
		/*
		 * 1-2. �� ����� ������ ������ ����
		 */
		System.out.println("��������=======================================================");
		
		/*
		 * 1-3. �� ����� ��հ� ��ü ���(��ü����� �Ҽ����� ���ڸ����� ���)
		 */
		System.out.println("�������=======================================================");
		
		/*
		 * 1-4. �� ����� �ְ������� ���
		 */
		System.out.println("�ְ� ����-����Ŭ[] �ڹ�[] JDBC[]===================================");
				
		/*
		 * 1-5. �ϵ� �л��� �̸��� ����, ��ȣ
		 */
		System.out.println("TOP ��ȣ[] �̸�[] ����[]=========================================");
		
		/*
		 * 1-6. �ڹ������� �������� �����Ͽ� ���.
		 */
		System.out.println("TOP ��ȣ[] �̸�[] ����[]=========================================");
				
	}
	
	/*
	 * ����2.
	 * 2���� �迭�� ������ �������� ����� �Ʒ��� ���� ���� �־� ����ϴ� method �ۼ�
	 * 1 1 1 1 1 1 1 1 1
	 * 1 0 0 0 0 0 0 0 1
	 * 1 0 0 0 0 0 0 0 1
	 * 1 0 0 0 0 0 0 0 1
	 * 1 0 0 0 0 0 0 0 1
	 * 1 1 1 1 1 1 1 1 1
	 */
	
	//int[][] a = new int[5][5]
	//for(int i=0; i<a.length; i++) { //��
//		for(int j=0; j<a[i].length; j++) { //��
//			a[i][j] = i==0||i==a.length-1?
//		}
	//}
	
	
	public static void main(String[] args) {
		ScoreProcess2 sp2 = new ScoreProcess2();
		//ó���� ������ �ޱ�
		String[] name = sp2.namesData();
		int[][] score = sp2.scoreData();
		//ó��
		sp2.printScore(name,score);
	}//main

}//class
