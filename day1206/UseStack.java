package day1206;

import java.util.Stack;

/**
 * Stack : LIFO(Last Input First Output)을 구현한 클래스
 * @author owner
 */
public class UseStack {
	
	public UseStack() {
		//생성
		Stack<String> stk = new Stack<String>();
		
		//값 할당
//		stk.add("부모");//stack꺼가 아니라 부모꺼 //부모클래스가 제공하는 기능은 사용하지 않는다. 출력만!
		stk.push("하셨습니다.");//1
		stk.push("수고");//2
		stk.push("오늘도");//3
		System.out.println(stk);
		System.out.println("크기 : "+stk.size());//stack은 size가 없다. 부모의 method를 끌어다 쓰는것.
		
		//부모클래스가 제공하는 기능을 사용하면 스택의 고유기능을 사용할 수 없게된다.
//		for(int i =0; i<stk.size(); i++) {
//			System.out.println(stk.get(i));
//		}
		
//		System.out.println(stk.pop());
//		System.out.println(stk.pop());
//		System.out.println(stk.pop());
//		System.out.println(stk.pop()); //stack에 담긴것보다 더 출력하게되면 ERROR.
		System.out.println(stk.empty());
		
		while(!stk.empty()) {
			System.out.println(stk.pop()); //스택에서 데이터를 꺼내면 다음번엔 그 데이터를 사용할 수 없다.
		}
		
		
		
	}
	

	public static void main(String[] args) {
		new UseStack();
	}

}
