package day1206;

import java.util.Random;

/**
 * Random : 다양한 난수를 얻기위한 객체
 * @author owner
 */
public class UseRandom {
	
	public UseRandom() {
		//1. 생성
		Random r = new Random();
		//실수 난수
		double d = r.nextDouble();
		System.out.println(d);
		System.out.println(d*5);
		System.out.println((int)(d*5)); // 0~4까지
		
		System.out.println("-------------------------------");
		
		//정수 난수
		int i = r.nextInt(); //매개변수 없는 nextInt
		System.out.println(i); //음수 혹은 양수
		System.out.println(i%5); //얘는 음수도 나옴. 난 양수만 필요하므로 아래 메소드를 사용해준다.
		System.out.println(Math.abs(i%5));
		
		System.out.println("-------------------------------");
		int j = r.nextInt(5); //매개변수 있는 nextInt, 범위 0~4, 음수가 나오지 않는다.
		System.out.println(j);
		
		System.out.println("-------------------------------");
		//불린 난수
		boolean b = r.nextBoolean();
		System.out.println(b); //true or false
		
		
		
	}
	
	public static void main(String[] args) {
		new UseRandom();
	}

}
