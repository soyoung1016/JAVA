package day1123;

/**
 * 사람을 추상화 하여 만든 person 클래스를 사용하는 클래스
 * @author owner
 */
public class UsePerson {

	public static void main(String[] args) {
		//객체 생성 :heap에 생서되고 instance 변수는 자동 초기화가 된다.
		Person soyoung = new Person();
		
		//참조형 데이터형인 Person은 heap의 주소를 가지고 있다.
		System.out.println("객체를 출력하면 주소가 출력 "+soyoung);		
		soyoung.setName("박소영");
//		2018-11-26 코드 추가 - 기본생성자 수업하며 코드를 추가. setter 없이도 기본생성자를 생성하여 2,1,1 사람 객체 호출 가능!		
//		soyoung.setEye(2);
//		soyoung.setNose(1);
//		soyoung.setMouth(1);
		
		
		System.out.format("생성된 사람 객체 정보 눈[%d], 코[%d], 입[%d], 이름[%s]\n",
							soyoung.getEye(), soyoung.getNose(), soyoung.getMouth(), soyoung.getName());
		
		//생성된 객체에서 정의된 일을 사용
		System.out.println(soyoung.eat());
		System.out.println(soyoung.eat("육회비빔밥",8000));
		
		
		Person jinban = new Person(3,1,1);
//		2018-11-26 코드 추가 - 생성자 수업하며 코드를 추가. setter 없이도 인자있는 생성자를 생성하여 3,1,1 사람 객체 호출 가능!(다형성)
//		객체화하며 안에 바로 인자값을 넣어준다!
		jinban.setName("천진반");
//		jinban.setEye(3);
//		jinban.setNose(1);
//		jinban.setMouth(1);
		
		System.out.format("생성된 사람 객체 정보 눈[%d], 코[%d], 입[%d], 이름[%s]\n",
				jinban.getEye(), jinban.getNose(), jinban.getMouth(), jinban.getName());
		
		System.out.println(jinban.eat());
		System.out.println(jinban.eat("선두", 1));
		
		
		
		
		
		

	}//main
	
}//class