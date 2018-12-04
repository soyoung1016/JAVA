package day1204;

/**
 * 인터페이스가 method의 매개변수일때 간단하게 사용하는 방법<br>
 * @author owner
 */
public class TestAnony {
	
	public void useAnonInter(AnonyInter ai) {
		System.out.println(ai.getMsg()+" "+ai.getName());
	}

	public static void main(String[] args) {
//		AnonyInter ai = new AnonyInter(); //ERROR, 인터페이스는 객체화 할 수 없다.
		//인터페이스에 들어갈 수 있는것은 상수, 추상메소드
		//클래스에 들어갈 수 있는 것 변수, 메소드
		
		//인터페이스가 매개변수로 있을 때는
		//1. 인터페이스를 구현한 클래스를 생성(AnonyInter를 인터페이스 파일로 생성)
		//2. 구현클래스로 객체를 생성
		AnonyImpl ai = new AnonyImpl(); //is a 
		//3. 매개변수를 가진 method를 호출하기 위해 객체생성
		TestAnony ta = new TestAnony();
		//4. method 호출
		ta.useAnonInter(ai); //자식이므로 호출 가능
		
		//메소드 하나 호출하겠다고 과정이 너무 길다!!
		
		System.out.println("=============anonymous innerclass===============");
		//anonymous inner class를 사용하면 클래스를 따로 만들 필요가 없다.
		
		ta.useAnonInter(new AnonyInter() {
			
			@Override
			public String getName() {
				return "공선의"+test();
			}
			
			@Override
			public String getMsg() {
				return "온뇨쇼";
			}
			
			public String test() {
				return "자식 method";
			}
			
		});//anonymous inner class
		//또하고싶으면 같은코드 반복되어야한다. 한번밖에 사용이 안됨.
		
	}

}
