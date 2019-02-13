package day1206;

import java.util.Stack;

/**
 * Stack : LIFO(Last Input First Output)�� ������ Ŭ����
 * @author owner
 */
public class UseStack {
	
	public UseStack() {
		//����
		Stack<String> stk = new Stack<String>();
		
		//�� �Ҵ�
//		stk.add("�θ�");//stack���� �ƴ϶� �θ� //�θ�Ŭ������ �����ϴ� ����� ������� �ʴ´�. ��¸�!
		stk.push("�ϼ̽��ϴ�.");//1
		stk.push("����");//2
		stk.push("���õ�");//3
		System.out.println(stk);
		System.out.println("ũ�� : "+stk.size());//stack�� size�� ����. �θ��� method�� ����� ���°�.
		
		//�θ�Ŭ������ �����ϴ� ����� ����ϸ� ������ ��������� ����� �� ���Եȴ�.
//		for(int i =0; i<stk.size(); i++) {
//			System.out.println(stk.get(i));
//		}
		
//		System.out.println(stk.pop());
//		System.out.println(stk.pop());
//		System.out.println(stk.pop());
//		System.out.println(stk.pop()); //stack�� ���ͺ��� �� ����ϰԵǸ� ERROR.
		System.out.println(stk.empty());
		
		while(!stk.empty()) {
			System.out.println(stk.pop()); //���ÿ��� �����͸� ������ �������� �� �����͸� ����� �� ����.
		}
		
		
		
	}
	

	public static void main(String[] args) {
		new UseStack();
	}

}
