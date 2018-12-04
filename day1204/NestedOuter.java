package day1204;

/**
 * 내부클래스를 static 변수처럼 사용할 수 있는 중첩클래스
 * @author owner
 */
public class NestedOuter {
	//바깥 클래스의 변수 시작
	int i;
	static int j;
	//바깥 클래스의 변수 끝
	
	//바깥 클래스의 메소드 시작
	public NestedOuter() {
		System.out.println("바깥 클래스의 생성자");
	}
	
	public void outInstMethod() {
		System.out.println("바깥 클래스의 instance method");
	}
	
	public static void outStatMethod() {
		System.out.println("바깥 클래스의 static method");
	}
	//바깥 클래스의 메소드 끝
	
	//////////////////////////Nested class 시작//////////////////////////////
	static class NestedInner { //static이라고 쓴다고 해서 안쪽의 영역이 static은 아니다
//		int in_i; //static변수가 아니다. instance 변수
		static int in_j; //static 변수
		
//		public NestedInner() {
//		}
		/*
		 * 위의 인스턴스 변수와 생성자를 생성을 할 수는 있는데 권장하지 않는다.
		 */
		
		public void inMethod() {
			System.out.println("안쪽 클래스의 instance method");
		}
		
		public static void inStatMethod() { //static영역
			System.out.println("안쪽 클래스의 static method");
//			System.out.println("바깥 클래스의 자원 사용. i = "+i); 
			//ERROR. 아무리 안쪽 클래스라고 할지라도 객체화 없이는 instance 변수를 데리고 올 수 없다.
			System.out.println("바깥 클래스의 자원 사용. j = "+j); //j는 static변수이므로 호출 가능
			System.out.println("바깥 클래스의 자원 사용. j = "+NestedOuter.j); //이렇게 써도 된다. 이것을 더 권장
			
//			outInstMethod(); //ERROR, instance영역의 method이므로 사용할 수 없다.
			outStatMethod(); //사용가능. static영역의 method이다.
			NestedOuter.outStatMethod(); //요렇게 쓰자
			
		}
		
	}
	//////////////////////////Nested class 끝///////////////////////////////
	
	
	public static void main(String[] args) { //static영역
		//static 영역을 사용할 때에는 객체화없이 클래스명.변수명, 클래스명.method명으로 사용한다.
		NestedInner.inStatMethod();
		//static영역에서 instance를 부를땐 반드시 객체화를 해야하지만(다른 영역일때)
		//static영역에서 static을 부를 땐 객체화 없이 호출할 수 있다.

	}//main

}//class
