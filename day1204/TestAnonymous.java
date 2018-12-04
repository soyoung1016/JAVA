package day1204;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class TestAnonymous extends Frame {
	
	public TestAnonymous() {
		super("Anonymous inner class ����");
		Button btn = new Button("Ŭ��");
		add(btn);
		setSize(300, 300);
		setVisible(true);
		
		//Anonymous inner class ����
		addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent we) {
				dispose();
			}
			
		});
		//Anonymous inner class ��
	}

	public static void main(String[] args) {
		new TestAnonymous();
	}

}
