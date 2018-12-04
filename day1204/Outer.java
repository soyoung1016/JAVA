package day1204;

/**
 * @author owner
 */
public class Outer {
	//바깥 클래스의 변수 시작
	int i;
	//바깥 클래스의 변수 끝
	
	//바깥 클래스의 메소드 시작
	public Outer() {
		System.out.println("바깥 클래스의 생성자");
	}
	
	public void outMethod() {
		System.out.println("바깥 클래스의 method i = "+i);
//		System.out.println("안쪽 클래스의 j = "+j);
		
		//안쪽클래스를 객체화
		Outer.Inner in = this.new Inner(); //this를 이용하여 안쪽 클래스를 객체화 하기
		//this를 쓴 이유?
		//자기 자신의 내부에서 나를 참조해야할때 this를 쓴다. 원래 this자리에 out이 들어가야하니까. 나를 불러오려면 this.
		in.j=100;
		in.inMethod();
	}
	//바깥 클래스의 메소드 끝
	
	/////////////////////////안쪽 클래스(Inner class) 시작////////////////////////
	public class Inner {
		//안쪽 클래스의 변수 시작
		int j;
		//안쪽 클래스의 변수 끝
		
		//안쪽 클래스의 메소드 시작
		public Inner() {
			System.out.println("안쪽 클래스의 생성자");
		}
		
		public void inMethod() {
			System.out.println("안쪽 클래스의 method j = "+j+", 바깥 클래스의 자원 i = "+i);
			//바깥클래스의 변수 i를 받아와 쓸 수 있다.
			//outMethod(); //바깥 클래스의 method도 받아올 수 있다.
		}
		//안쪽 클래스의 메소드 끝
		
	}
	/////////////////////////안쪽 클래스(Inner class) 끝/////////////////////////
	
	//main은 바깥클래스의 영역이다.
	public static void main(String[] args) {
		//1. 바깥 클래스의 객체화
		Outer out = new Outer();
		out.i = 10;
		out.outMethod();
//		out.j=100; //ERROR, 안쪽클래스의 자원을 직접 접근하여 사용할 수 없다.
//		out.inMethod(); //ERROR, 위와 마찬가지로 메소드도 못씀.
		//안쪽클래스의 자원을 쓰려면 안쪽클래스를 객체화 해야한다. 그러려면 바깥클래스 먼저 객체화 한 후에 안쪽 클래스를 객체화.
		
		//2. 안쪽 클래스의 객체화 : 바깥클래스명.안쪽클래스명 객체명 = 바깥클래스의 객체명.new 안쪽생성자();
//		Outer.Inner in = out.new Inner(); //이렇게 다 써도 되고
		Inner in = out.new Inner(); //이렇게 바깥 클래스명을 생략하여 객체화 할 수 있다
		//객체화를 한 후에는 바깥 클래스에서 안쪽 클래스의 자원을 사용할 수 있다.
		in.j = 12; //안쪽 클래스의 변수
		in.inMethod(); //안쪽 클래스의 메소드
		
	}//main
}//class
