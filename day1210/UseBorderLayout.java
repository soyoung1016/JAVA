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
 * �Ϲ�������Ʈ�� LayoutManager�� ���
 * @author owner
 */

//1. Window Component ���(����ڿ��� �������� ��)
@SuppressWarnings("serial")
public class UseBorderLayout extends Frame {
	
	public UseBorderLayout() {//title�ٿ� ���ϴ� �޼����� �Է� ����
		super("BorderLayout ����");
		//2. ����� �Ϲ� ������Ʈ�� ����
		TextField tfNorth = new TextField("North"); //�� �ٿ� �Է��� ���� �� �ִ� ������Ʈ ����
		Label lblEast = new Label("East");
		TextArea taCenter = new TextArea("Center");
		Label lblWest = new Label("West");
		Choice choSouth = new Choice();
		choSouth.add("South");
		
		//3. ��ġ������ ���� : Window Component�� Frame, Dialog�� BorderLayout �⺻ ����
		setLayout(new BorderLayout()); //�⺻ ���̾ƿ��̶� ���ٰ� �ؼ� �޶����°��� ����.
		
		//4. ������Ʈ�� ��ġ�����ڸ� ����Ͽ� ��ġ
		//add("��ġ��ġ", ������Ʈ);, add(���, ������Ʈ);
		add("North", tfNorth);
		add("Center",taCenter);
		//Constant(Field)�� ����Ͽ� ��ġ
		add(BorderLayout.WEST,lblWest);
		add(BorderLayout.EAST,lblEast);
		add(BorderLayout.SOUTH,choSouth);
		
		//Center�� ��ġ�ϸ� �׵θ��� North, West, South, East �ڸ��� �������.
		
		//5. ������ ũ�� ����
		setSize(400,400);
		
		//6. ����ڿ��� �����ֱ�
		setVisible(true);
		//����
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
