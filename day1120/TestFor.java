package day1120;

/**
 * for : ���۰� �P�� �� �� ����ϴ� �ݺ���<br>
 * ���� : for (�ʱⰪ; ����; ����.���ҽ�) {<br>
 * 			�ݺ����๮��; <br>
 * 		}
 * @author owner
 */
public class TestFor {

	public static void main(String[] args) {
		//0~�������� 10���� ���� ������ �ݺ������ϴ� for
		
		for (int i =0; i<10; i++) {
			System.out.println(i+"�� �ȳ�");
		}//end for
		
		System.out.println("=======================================");
		//1�������� 1�� �����ϸ� 100���� �ݺ� ���� for
		
		//�������̸� �ݺ��������� �۰ų� ���ٸ� ������� �ʴ´�. ������ ������ �ι��� ����� ������!
		for (int i = 1; i<101; i++) {
			System.out.println(i+"��° �ݺ�");
		}
		
		//1�������� 100���� ¦���� ������ ��� for
		//��.���ҽ��� ������ ���� ��ȭ��Ű�� ���� ��ų���ִ� ��� �����ڸ� ����� �� �ִ�.
		//for (int i = 1; i<101; i+=2) �̷������ε� ���� => �ݺ� ���� Ƚ���� ���� �� �ִ�. �̷��� �ص� ���� ������� ���� Ƚ���� �������� �ش�.
		for (int i = 1; i<101; i++) {
			
			if (i%2==0) {
				System.out.print(i);
			}
		}
		
		//��� �ݺ��ߴ��� Ȯ���ϴ� for
		int cnt=0;
		for (int i = 1; i<101; i++) {
			cnt++;
			//if (i%2==0) {
				//System.out.print(i);
			//}
		}
		System.out.println("\n"+cnt+"��");
		
		
		
		//1~100���� ����ϱ� 3�� ������� ���ڴ�� "¦"�� ����ϴ� for
		//
		for(int i=1; i<101; i++) {
			if(i%3==0) {
				System.out.print("¦ ");
			} else {
			System.out.print(i+" ");
			}
		}
		
		System.out.println(" ");

		//1~100������ �� ����ϴ� for, ��� : 1�������� 100������ ���� 5050
		int sum=0;
		for(int i=1; i<101; i++) {
			sum=i+sum;
		}
		System.out.println(sum);
		
		
		System.out.println(" ");
		
		//���ĺ� A ~ Z ���� ����ϴ� for
		for (char c='A'; c<='Z'; c++) {
			System.out.print(c);
		}
		
		System.out.println(" ");
		
		for(char c=65; c<91; c++) {
			System.out.print((char)c);
		}
		
		System.out.println(" ");
		
		//������ 2�� for
		for (int i=1; i<10; i++){
			System.out.println(2+" * "+i+" = "+2*i);
		}

		
	}//main

}//class
