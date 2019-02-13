package day1210;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * GridLayout : ��� ���� �����Ǹ�, ��� ������Ʈ�� ũ�Ⱑ �����ؾ��� ��.
 * @author owner
 */
//1. Window Component ���
@SuppressWarnings("serial")
public class UseGridLayout extends Frame{
	
	public UseGridLayout() {
		super("GridLayout����");
		
		//2. ������Ʈ ����
		Button btn1 = new Button("��ư1");
		Button btn2 = new Button("��ư2");
		Button btn3 = new Button("��ư3");
		Button btn4 = new Button("��ư4");
		Button btn5 = new Button("��ư5");
		Button btn6 = new Button("��ư6");
		Button btn7 = new Button("��ư7");
		Button btn8 = new Button("��ư8");
		Button btn9 = new Button("��ư9");
		
		//3. ��ġ������ ���� : BorderLayout - > GridLayout
		setLayout(new GridLayout(3,3));
		
		//4. ��ġ(L->R)
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btn5);
		add(btn6);
		add(btn7);
		add(btn8);
		add(btn9);
		
		//5. ������ ũ�� ����
		setSize(300,400);
		
		//6.����ڿ��� �����ֱ�
		setVisible(true);

		//���� ó��
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent we) {
				dispose();
			}
		});
	}
	
	public static void main(String[] args) {
		new UseGridLayout();
	}

}
