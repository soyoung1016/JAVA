package day1129;


/**
 * ��, ��, ���� ������ �迭
 * @author owner
 */
public class UseArray3 {
	
	public UseArray3() {
		//3���� �迭�� ������ ������ ���
		//1. ���� : ��������[][][] �迭�� = null;
		int[][][] arr=null;
		
		//2. ���� : �迭�� = new ��������[���� ��][���� ��][���� ��]
		arr = new int[3][4][5];
		
		//1+2) ��������[][][] �迭�� = new ��������[��][��][��];
		int[][][] arr1 = new int[3][4][5];
		
		
		//3. ���Ҵ� �迭��[���� ��ȣ][���� ��ȣ][���� ��ȣ] = ��;
		arr[0][0][0]=10;
		arr[1][2][3]=1000;
		
		
		//4. �� ���) �迭��[���ȣ][���ȣ[����ȣ]
		System.out.println(arr[0][0][0]+" / "+arr[0][0][1]+" / "+ arr[0][0][2]);	
		
		System.out.println("arr�迭�� ���� �� : "+arr.length+", ���� �� : "+arr[0].length+", ���� �� : "+arr[0][0].length);	
		System.out.println("arr1�迭�� ���� �� : "+arr1.length+", ���� �� : "+arr1[0].length+", ���� �� : "+arr1[0][0].length);	
		
		//��� ���� �� ���(�ϰ�ó��)
		for(int i = 0; i < arr.length; i++) {	//��
			System.out.println(i+"�� ����");
				for(int j = 0; j < arr[i].length; j++) {	//��
					System.out.println(i+"�� "+j+"�� ����");
					for(int k=0; k<arr[i][j].length; k++) {	//��
						System.out.print(arr[i][j][k]+"\t");
					}
					System.out.println("\n"+i+"�� "+j+"�� ��");
				}
			System.out.println(i+"�� ��");
			
		}
		
		System.out.println("========================================");
		
		//���� for�� �ϰ�ó��
		//3���� �迭�� �� ���� 2���� �迭�� �̷�����ִ�.
		for(int[][] arr2 : arr1) {
			//2���� �迭�� �� ���� 1���� �迭�� �̷�����ִ�.
			for(int[] arr0 : arr2) {
				//1���� �迭�� �� ���� ���� ������������ �̷�����ִ�.
				for(int val : arr0) {
					System.out.print(val+"\t");
				}
				System.out.println("\n�� ��");
			}
			System.out.println("\n�� ��");
		}
	}
	
	public void priType() {
		//�⺻�� �������� 3���� �迭����
		//��������[][][] �迭�� = {{{��,,,},{,,}}, {{,,},{,,,,,}}};
		int[][][] arr = {{{1,2,3},{4,5,6}}/*0��*/,
						{{7,8,9},{10,11,12}}/*1��*/};
		
		System.out.println("���� �� : "+arr.length+", ���� �� : "+arr[0].length+", ���� �� : "+arr[0][0].length);
		
		for(int i =0; i < arr.length; i++) {//��
			for(int j=0; j < arr[i].length; j++) {//��
				for(int k=0; k<arr[i][j].length; k++) {//��
					System.out.print(arr[i][j][k]+"\t");
				}
				System.out.println();
			}
			System.out.println();
		}
		
		
		
	}
	
	public static void main(String[] args) {
		new UseArray3().priType();	//.�� �޼ҵ� ��� �θ��°� = method chain
	}//main

}//class
