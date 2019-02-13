package day1213;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
//1. Dialog 상속
public class DialogIsA extends Dialog implements ActionListener {
	
	//2. 이벤트와 관련있는 컴포넌트를 선언
	private Button btn;
	
	//현재 다이얼로그의 부모가 될 객체와 has a 관계
	//생성자 쪽은 has a, 상속? 쪽은 is a....뭘까..
	public DialogIsA(UseDialogIsA uda) {
		super(uda, "다이얼로그", true);
		
		//컴포넌트 생성
		Label lbl = new Label("오늘은 목요일입니다.");
		
		btn = new Button("종료");
		
		add("Center", lbl);
		add("South", btn);
		
		btn.addActionListener(this);
		//윈도우의 dispose, 다이얼로그에 들어가있으면 다이얼로그의 dispose - d.~~~
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		
		//다이얼로그의 위치를 부모프레임 안쪽에서 띄우기 //설정안하면 부모프레임이 어디로 가있든간에 같은 위치에서 다이얼로그가 뜸
		System.out.println("부모 x "+uda.getX()+", 부모 y "+uda.getY());
		setBounds(uda.getX()+100, uda.getY()+100, 300, 300);
		setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		dispose();
	}

}
