package day1211;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * XxxAdapter class�� ���Ǿ�� �ϴ� ����
 * @author owner
 */
@SuppressWarnings("serial")
public class UseWindowEvent extends Frame {

	public UseWindowEvent() {
		super("������ �̺�Ʈ ����");
		
		setBounds(100,100,400,400);
		setVisible(true);
		
		UseWindowEvent.WindowImpl wi = this.new WindowImpl();
		addWindowListener(wi);
		
	}
	
	
	public static void main(String[] args) {
		new UseWindowEvent();
	}

	//WindowAdapter class�� ��ӹ����� �ʿ��� method�� Override �ϸ�ȴ�.

	public class WindowImpl extends WindowAdapter {

		@Override
		public void windowClosing(WindowEvent e) {
			System.out.println("windowClosing");
			dispose();
		}

	} // inner class ����
}
