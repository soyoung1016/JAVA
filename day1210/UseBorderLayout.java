package day1210;

import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * 일반컴포넌트와 LayoutManager의 사용
 * @author owner
 */

//1. Window Component 상속(사용자에게 보여지는 일)
@SuppressWarnings("serial")
public class UseBorderLayout extends Frame {
	
	public UseBorderLayout() {//title바에 원하는 메세지를 입력 가능
		super("BorderLayout 연습");
		//2. 사용할 일반 컴포넌트를 생성
		TextField tfNorth = new TextField("North"); //한 줄에 입력을 받을 수 있는 컴포넌트 생성
		Label lblEast = new Label("East");
		TextArea taCenter = new TextArea("Center");
		Label lblWest = new Label("West");
		Choice choSouth = new Choice();
		choSouth.add("South");
		
		//3. 배치관리자 설정 : Window Component인 Frame, Dialog는 BorderLayout 기본 설정
		setLayout(new BorderLayout()); //기본 레이아웃이라 쓴다고 해서 달라지는것은 없다.
		
		//4. 컴포넌트의 배치관리자를 사용하여 배치
		//add("배치위치", 컴포넌트);, add(상수, 컴포넌트);
		add("North", tfNorth);
		add("Center",taCenter);
		//Constant(Field)를 사용하여 배치
		add(BorderLayout.WEST,lblWest);
		add(BorderLayout.EAST,lblEast);
		add(BorderLayout.SOUTH,choSouth);
		
		//Center만 배치하면 테두리인 North, West, South, East 자리가 사라진다.
		
		//5. 윈도우 크기 설정
		setSize(400,400);
		
		//6. 사용자에게 보여주기
		setVisible(true);
		//종료
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent we) {
				dispose();
			}
		});
		
		//7.
		
		
	}
	
	public static void main(String[] args) {
		new UseBorderLayout();

	}

}
