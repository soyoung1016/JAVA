package day1211;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class UseItemListener22 extends Frame{
	
	public UseItemListener22() {
		super("수업시간 예제");
		
		Label SouthName = new Label("이름 : ");
		Label SouthAge = new Label("나이 : ");
		TextField sn = new TextField(5);
		TextField sa = new TextField(5);
		
		List list = new List();
		list.add("이재찬  / 27");
		list.add("정택성  / 26");
		list.add("공선의 / 25");
		list.add("박소영  / 24");
		
		Panel South = new Panel();
		South.add(SouthName);
		South.add(sn);
		South.add(SouthAge);
		South.add(sa);
		
		setLayout(new BorderLayout());
		
		add("South", South);
		add("Center", list);
		
		setBounds(200,150,400,250);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent we) {
				dispose();
			}
		});
		
	}

	public static void main(String[] args) {
		new UseItemListener22();
	}

}
