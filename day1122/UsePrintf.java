package day1122;

/**
 * 출력 method
 * @author owner
 */
public class UsePrintf {

	public static void main(String[] args) {
//		System.out.printf("정수%d",11);
//		System.out.format("정수%d",11);
		//format이든 printf든 줄이 바뀌지 않음. 뒤에 따로 \n을 사용하여 줄을 바꿔주어야 한다.
		
		System.out.printf("정수[%d][%5d][%-5d]\n", 123,123,123);
		System.out.printf("문자[%c][%5c][%-5c]\n", 'A','B','C');
		System.out.printf("문자열[%s][%10s][%-10s]\n", "A","B","C");
		System.out.printf("실수[%.2f][%5.2f][%-5.2f]\n", 3.141592, 3.141592, 3.141592);
		
		System.out.printf("오늘은 %d년%d월%d일 %s요일 시력은 %.2f 입니다.",2018,11,22,"목",1.5);//자릿수가 모자라면 0으로 채워져서 나옴
		
	}//main

}//class
