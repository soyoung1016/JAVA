package day1126;

/**
 * this를 사용한 생성자 호출
 * @author owner
 */
public class ThisCountructor {
	
	public ThisCountructor() {
		//this(); 본인만 계속 부르고 다시 제자리로 오기때문에 재귀호출. ERROR. 한 번 들어오면 밖으로 나갈 수가 없음
		//this(25);
		System.out.println("기본 생성자");
	}
	
	public ThisCountructor(int i) {
		this();
		System.out.println("인자있는 생성자 : "+i);
//		this(); 무조건 생성자의 첫번째 줄에서만 사용할 수 있다.
	}
	
	public static void main(String[] args) {
		//new ThisCountructor();
		new ThisCountructor(22);
		//생성된 객체를 여러번에 걸쳐서 쓰기 위해 객체명을 변수에 저장한 것인데
		//변수도없고 method도 없기 때문에 객체를 저장해서 사용할 일이 없음.
		//그래서 변수에 저장하지 않는다.
	}//main

}//class
