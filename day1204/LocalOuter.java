package day1204;

/**
 * method안에 클래스를 정의하는 지역class의 사용<br>
 * 생성된 객체를 지역변수처럼 사용하는 클래스
 * @author owner
 */
public class LocalOuter {
	
	int i;
	
	public LocalOuter() {
		System.out.println("바깥 클래스의 생성자");
	}
	
	public void method(int param_i, final int param_j) {
		//parameter(param)는 곧 지역변수나 마찬가지이다. 메소드 안에서 선언되고 사용되어지는 변수이기 때문에.
		int local_i = 0; //변수의 분류상 지역변수. = int param_i
		final int local_j = 0; //변수의 분류상 지역변수. = final int param_i
		
		///////////////////////////지역클래스 시작//////////////////////////////
		/*
		 * method안에서 method는 만들지 못하지만 class는 만들 수 있다.그것이 지역클래스~!
		 * instance화를 하지 않으면 밖에 나갈수도 없으므로 쓰지도 않을 것들 왜만들었냐고 워닝뜨는것.
		 */
		class Local{
			int loc_i;
			
			public Local() {
				System.out.println("지역클래스의 생성자");
			}
			
			public void locMethod() {
				System.out.println("지역클래스의 method "+loc_i);
				System.out.println("바깥클래스의 인스턴스변수 i = "+i);
				//final이 붙은 매개변수만 사용할 수 있었다.
				//원래는 쓰지 못했지만 JDK 1.8부터 쓸 수 있게 바뀌었다.
				System.out.println("매개변수(Parameter) param_i = "+ param_i+", param_j = "+param_j);
				//final이 붙은 지역변수만 사용할 수 있었다.
				//원래는 쓰지 못했지만 JDK 1.8부터 쓸 수 있게 바뀌었다.
				System.out.println("지역변수 local_i = "+local_i+", local_j = "+local_j);
				
				//final의 특징 : 값변경 불가
//				local_i = 2018; //JDK1.8부터는 출력은 가능하지만 값 할당은 할 수 없다.
			}
			
		}
		///////////////////////////지역클래스 끝///////////////////////////////
		
		//지역클래스의 객체화
		Local lo = new Local();
		//생성된 객체로 클래스 내의 자원을 사용할 수 있다.
//		loc_i = 100; //눈에 보여도 직접 사용 불가, lo를 붙여야한다.
		lo.loc_i = 100;
		lo.locMethod();
		
		System.out.println("바깥 클래스의 method 호출");
		
	}
	
	public static void main(String[] args) {
		//static영역인 main에서 지역클래스 안의 메소드를 호출
		//바깥클래스 인스턴스화
		LocalOuter lo = new LocalOuter();
		lo.method(12, 4); //메소드를 불렀다고 지역클래스의 생성자가 호출되지는 않는다.
		//지역클래스를 쓰려면 지역클래스가 있는 메소드 안에서 지역클래스를 객체화 해야한다.
		
	}//main

}//class
