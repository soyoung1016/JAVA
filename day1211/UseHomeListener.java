package day1211;

import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
//import java.awt.List;
import java.awt.Panel;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
//1. 윈도우 컴포넌트 상속
public class UseHomeListener extends Frame implements ItemListener{
//	private List list;
	private Label lblResult;
	private Choice cholist;
	
	public UseHomeListener() {
		//2. 컴포넌트 생성
		lblResult = new Label("오늘은 화요일");
		cholist = new Choice();
		
		
		
		//컨테이너 컴포넌트
		Panel all = new Panel();
		//생성된 컨테이너 컴포넌트에 일반 컴포넌트 배치
		all.setLayout(new GridLayout(1, 2));
		all.add(lblResult);
		all.add(cholist);
		
		cholist.add("색 선택");
		cholist.add("검은색");
		cholist.add("파란색");
		cholist.add("빨간색");
		cholist.add("녹색");
		cholist.add("노란색");
		
//		list = new List();
//		list.add("검은색");
//		list.add("파란색");
//		list.add("빨간색");
//		list.add("녹색");
//		list.add("노란색");
		
		//3. 배치관리자 설정
		setLayout(new BorderLayout());

		//4. 배치
		add("Center", all);
		
		//이벤트 등록
		cholist.addItemListener(this);
		
		//윈도우 크기 설정
		setBounds(200,200,400,300);
		
		//사용자에게 보여주기
		setVisible(true);
		
		//윈도우 종료 이벤트 처리
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent we) {
				dispose();
			}
		});
		
	}
	
	public static void main(String[] args) {
		new UseHomeListener();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		
		switch(cholist.getSelectedIndex()) {
		case 1 : lblResult.setForeground(Color.BLACK); break;
		case 2 : lblResult.setForeground(Color.BLUE); break;
		case 3 : lblResult.setForeground(Color.RED); break;
		case 4 : lblResult.setForeground(Color.GREEN); break;
		case 5 : lblResult.setForeground(Color.YELLOW); break;
		}

	}

}
