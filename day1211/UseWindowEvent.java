package day1211;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * XxxAdapter class가 사용되어야 하는 이유
 * @author owner
 */
@SuppressWarnings("serial")
public class UseWindowEvent extends Frame {

	public UseWindowEvent() {
		super("윈도우 이벤트 연습");
		
		setBounds(100,100,400,400);
		setVisible(true);
		
		UseWindowEvent.WindowImpl wi = this.new WindowImpl();
		addWindowListener(wi);
		
	}
	
	
	public static void main(String[] args) {
		new UseWindowEvent();
	}

	//WindowAdapter class를 상속받으면 필요한 method만 Override 하면된다.

	public class WindowImpl extends WindowAdapter {

		@Override
		public void windowClosing(WindowEvent e) {
			System.out.println("windowClosing");
			dispose();
		}

	} // inner class 종료
}
