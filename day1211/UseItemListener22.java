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
		super("�����ð� ����");
		
		Label SouthName = new Label("�̸� : ");
		Label SouthAge = new Label("���� : ");
		TextField sn = new TextField(5);
		TextField sa = new TextField(5);
		
		List list = new List();
		list.add("������  / 27");
		list.add("���ü�  / 26");
		list.add("������ / 25");
		list.add("�ڼҿ�  / 24");
		
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
