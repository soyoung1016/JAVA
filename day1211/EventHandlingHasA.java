package day1211;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Has a 관계로 이벤트 처리<br>
 * 나중에 작업할땐 has a 를 가장 많이 사용하게 된다.
 * @author owner
 */

//1. 이벤트 처리 객체를 구현
public class EventHandlingHasA implements ActionListener{
	
	//2. has a 관계로
	//EventHandlingHasA는 Design을 가지고 있다.
	private Design design;
	
	public EventHandlingHasA(Design design) {
		this.design = design;
	}

	@Override
	//3. abstract method Override
	public void actionPerformed(ActionEvent ae) {
		//이벤트가 발생했을때 처리할 코드
		System.out.println("전달받은 Design객체 "+design);
		design.dispose(); //dispose는 window에 있기때문에 has a에서는 단독으로 사용할 수 없다.
	}
	
}
