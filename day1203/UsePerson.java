package day1203;

import java.util.Arrays;

public class UsePerson {

	public static void main(String[] args) {
		HongGilDong gd = new HongGilDong();
		gd.setName("홍길동"); //부모의 method 사용
		System.out.println("눈 : "+gd.getEye()+", 코 : "+gd.getNose()+", 입 : "+gd.getMouth());
		System.out.println(gd.eat());
		System.out.println(gd.eat("국밥",1));
		//자신만의 특징
		System.out.println(gd.fight(6)); //7에서 8
		System.out.println(gd.fight(7)); //8에서 9
		System.out.println(gd.fight(9)); //비김
		System.out.println(gd.fight(10)); //졌다. 레벨 9에서 8로 하락
		System.out.println(gd.fight(9)); //졌다. 레벨 8에서 7로 하락
		System.out.println(gd.toString());
		
		System.out.println("===================================");
		Clark superman = new Clark(); //자식이 생성되면 부모클래스가 먼저 생성 된 후 자식이 생성된다.
		//자식의 객체로 부모클래스의 자원(변수, method)를 자식의 것처럼 사용할 수 있다.
		superman.setName("클락");
		//코드의 재사용성
		System.out.println("눈 : "+superman.getEye()+", 코 : "+superman.getNose()+
							", 입 : "+superman.getMouth()+", 이름 : "+superman.getName());
		
		System.out.println(superman.eat());
		System.out.println(superman.eat("스테이크", 10));
		
		//자식의 method
		String stone = "짱돌";
		System.out.println(stone+"을(를) 맞은 결과 " +superman.power(stone)+", 힘의 변화 : "+superman.power);
		
		stone = "클립토나이트";
		System.out.println(stone+"을(를) 맞은 결과 " +superman.power(stone)+", 힘의 변화 : "+superman.power);
		
		stone = "다이아몬드";
		System.out.println(stone+"을(를) 맞은 결과 " +superman.power(stone)+", 힘의 변화 : "+superman.power);
		
		
		System.out.println("======================================================");
		String[] clackLang = superman.language("외계어");
		clackLang = superman.language("영어");
		clackLang = superman.language("불어");
		clackLang = superman.language("독일어");
		clackLang = superman.language("이태리어");
		
		System.out.println(Arrays.toString(clackLang));
		
		String[] HongLang = gd.language("한국어");
		HongLang = gd.language("중국어");
		HongLang = gd.language("수화");
		
		
		System.out.println(Arrays.toString(HongLang));
		
		System.out.println("=============================================");
		//Clark은 interface를 구현하였으므로 비행 가능
		System.out.println(superman.speed("빠르"));
		System.out.println(superman.height("높"));
		
	}

}
