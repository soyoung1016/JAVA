package day1129;


/**
 * 면, 행, 열로 구성된 배열
 * @author owner
 */
public class UseArray3 {
	
	public UseArray3() {
		//3차원 배열의 참조형 형식의 사용
		//1. 선언 : 데이터형[][][] 배열명 = null;
		int[][][] arr=null;
		
		//2. 생성 : 배열명 = new 데이터형[면의 수][행의 수][열의 수]
		arr = new int[3][4][5];
		
		//1+2) 데이터형[][][] 배열명 = new 데이터형[면][행][열];
		int[][][] arr1 = new int[3][4][5];
		
		
		//3. 값할당 배열명[면의 번호][행의 번호][열의 번호] = 값;
		arr[0][0][0]=10;
		arr[1][2][3]=1000;
		
		
		//4. 값 사용) 배열명[면번호][행번호[열번호]
		System.out.println(arr[0][0][0]+" / "+arr[0][0][1]+" / "+ arr[0][0][2]);	
		
		System.out.println("arr배열의 면의 수 : "+arr.length+", 행의 수 : "+arr[0].length+", 열의 수 : "+arr[0][0].length);	
		System.out.println("arr1배열의 면의 수 : "+arr1.length+", 행의 수 : "+arr1[0].length+", 열의 수 : "+arr1[0][0].length);	
		
		//모든 방의 값 출력(일괄처리)
		for(int i = 0; i < arr.length; i++) {	//면
			System.out.println(i+"면 시작");
				for(int j = 0; j < arr[i].length; j++) {	//행
					System.out.println(i+"면 "+j+"행 시작");
					for(int k=0; k<arr[i][j].length; k++) {	//열
						System.out.print(arr[i][j][k]+"\t");
					}
					System.out.println("\n"+i+"면 "+j+"행 끝");
				}
			System.out.println(i+"면 끝");
			
		}
		
		System.out.println("========================================");
		
		//향상된 for로 일괄처리
		//3차원 배열의 한 면은 2차원 배열로 이루어져있다.
		for(int[][] arr2 : arr1) {
			//2차원 배열의 한 행은 1차원 배열로 이루어져있다.
			for(int[] arr0 : arr2) {
				//1차원 배열의 한 열은 단일 데이터형으로 이루어져있다.
				for(int val : arr0) {
					System.out.print(val+"\t");
				}
				System.out.println("\n행 끝");
			}
			System.out.println("\n면 끝");
		}
	}
	
	public void priType() {
		//기본형 형식으로 3차원 배열선언
		//데이터형[][][] 배열명 = {{{값,,,},{,,}}, {{,,},{,,,,,}}};
		int[][][] arr = {{{1,2,3},{4,5,6}}/*0면*/,
						{{7,8,9},{10,11,12}}/*1면*/};
		
		System.out.println("면의 수 : "+arr.length+", 행의 수 : "+arr[0].length+", 열의 수 : "+arr[0][0].length);
		
		for(int i =0; i < arr.length; i++) {//면
			for(int j=0; j < arr[i].length; j++) {//행
				for(int k=0; k<arr[i][j].length; k++) {//열
					System.out.print(arr[i][j][k]+"\t");
				}
				System.out.println();
			}
			System.out.println();
		}
		
		
		
	}
	
	public static void main(String[] args) {
		new UseArray3().priType();	//.찍어서 메소드 계속 부르는것 = method chain
	}//main

}//class
