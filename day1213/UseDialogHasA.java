package day1213;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Frame 클래스에서 Dialog 클래스를 has a 사용
 * @author owner
 */
@SuppressWarnings("serial")
public class UseDialogHasA extends Frame implements ActionListener {
	
	private Button btn1/* Frame에 배치 */, btn2/* Dialog */;
	private Dialog d;
	
	public UseDialogHasA() {
		super("다이얼로그 사용");
		
		btn1 = new Button("다이얼로그 사용");
		
		Panel panel = new Panel();
		panel.add(btn1);
		
		add("Center", panel);
		
		btn1.addActionListener(this);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		
		setBounds(100,100,300,400);
		setVisible(true);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==btn1) {
			createDialog();
		}
		
		if(ae.getSource()==btn2) {
			d.dispose();
		}
	}
	
	public void createDialog() {
		//1. 생성
		d = new Dialog(this, "다이얼로그", true); //true - modal, false - 비modal

		//2. Dialog에 배치될 컴포넌트 생성
		Label lbl = new Label("오늘은 눈오는 목요일 입니다. ^.^");
		btn2 = new Button("닫기");
		
		d.add("Center", lbl);
		d.add("South", btn2);
		btn2.addActionListener(this);
		
		//크기 설정
		d.setBounds(200,200,300,300);
		
		//앞에 d를 붙여준다.
		//Dialog에서는 visible앞에 윈도우 종료이벤트가 와야만 종료가 된다. Frame은 순서 무관
		
		d.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				d.dispose();
			}
		});
		
		//가시화
		d.setVisible(true);
		
		
		
	}
	
	public static void main(String[] args) {
		new UseDialogHasA();
	}

}
