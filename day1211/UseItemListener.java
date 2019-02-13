package day1211;

import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * ItemEvent�� ó���ϴ� ItemListener�� ���
 * @author owner
 */
@SuppressWarnings("serial")
//1. Frame ���, �̺�Ʈ�� ó���� �� �ִ� ItemListener ����
public class UseItemListener extends Frame implements ItemListener {
	private List list;
	private Label lblResult;

	public UseItemListener() {
		list = new List();
		list.add("���ü�/26");
		list.add("������/26");
		list.add("������/27");
		list.add("������/30");
		list.add("������/27");
		list.add("�谳����/120");
		list.add("�ֽ��/6");
		list.add("�̺���������ȭ��/98876");
		list.add("������/1");

		lblResult = new Label("�̸� :                     ���� : ");

		list.addItemListener(this);

		add("Center", list);
		add("South", lblResult);
		
		//�̺�Ʈ ���
		list.addItemListener(this);

		setBounds(200, 200, 400, 300);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});

	}


	public static void main(String[] args) {
		new UseItemListener();
	}


	@Override
	public void itemStateChanged(ItemEvent e) {
		//����Ʈ�� �������� ���õǸ� ������ �������� �����ͼ� �󺧿� ���� �ִ´�(�����Ѵ�)
		
		String[] redItem = list.getSelectedItem().split("/");
		String name = redItem[0];
		String age = redItem[1];
		
		StringBuilder viewData = new StringBuilder();
		viewData.append("�̸� : ").append(name).append("     ���� : ").append(age);
		lblResult.setText(viewData.toString());
	}

}
