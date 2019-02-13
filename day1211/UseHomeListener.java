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
//1. ������ ������Ʈ ���
public class UseHomeListener extends Frame implements ItemListener{
//	private List list;
	private Label lblResult;
	private Choice cholist;
	
	public UseHomeListener() {
		//2. ������Ʈ ����
		lblResult = new Label("������ ȭ����");
		cholist = new Choice();
		
		
		
		//�����̳� ������Ʈ
		Panel all = new Panel();
		//������ �����̳� ������Ʈ�� �Ϲ� ������Ʈ ��ġ
		all.setLayout(new GridLayout(1, 2));
		all.add(lblResult);
		all.add(cholist);
		
		cholist.add("�� ����");
		cholist.add("������");
		cholist.add("�Ķ���");
		cholist.add("������");
		cholist.add("���");
		cholist.add("�����");
		
//		list = new List();
//		list.add("������");
//		list.add("�Ķ���");
//		list.add("������");
//		list.add("���");
//		list.add("�����");
		
		//3. ��ġ������ ����
		setLayout(new BorderLayout());

		//4. ��ġ
		add("Center", all);
		
		//�̺�Ʈ ���
		cholist.addItemListener(this);
		
		//������ ũ�� ����
		setBounds(200,200,400,300);
		
		//����ڿ��� �����ֱ�
		setVisible(true);
		
		//������ ���� �̺�Ʈ ó��
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
