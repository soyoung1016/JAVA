package day1210;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class AutoHome extends Frame{

	public AutoHome() {
		super("1210 ���� �ڵ���ġ");
		
		Label lblCenter1_1 = new Label("�̸�");
		Label lblCenter1_2 = new Label("����");
		Label lblCenter1_3 = new Label("��ȭ��ȣ");
		Label lblCenter1_4 = new Label("����");
		
		TextField lblCenterName = new TextField();
		TextField lblCenterAge = new TextField();
		TextField lblCenterNum = new TextField();
		
		CheckboxGroup cg = new CheckboxGroup();
		Checkbox rb1 = new Checkbox("��", true, cg);
		Checkbox rb2 = new Checkbox("��", false, cg);
		
		TextArea lblCenter2 = new TextArea();

		
		Button btnAdd = new Button("�߰�");
		Button btnUpdate = new Button("����");
		Button btnDelete = new Button("����");
		Button btnExit = new Button("����");
		
		
		Panel panelNorth = new Panel();
		Label lblNorth = new Label("�� �� �� ��");
		panelNorth.add(lblNorth);
		
		Panel panelSouth = new Panel();
		Label lblSouth = new Label();
		panelSouth.add(lblSouth);
		panelSouth.add(btnAdd);
		panelSouth.add(btnUpdate);
		panelSouth.add(btnDelete);
		panelSouth.add(btnExit);
		
		Panel panelCenter = new Panel();
		Panel panelCenter_1 = new Panel();
		Panel panelCenter_1_2 = new Panel();
		panelCenter.setLayout(new GridLayout(1,2));
		panelCenter.add(panelCenter_1);
		panelCenter.add(lblCenter2);
		
		panelCenter_1.setLayout(new GridLayout(4,2));
		panelCenter_1.add(lblCenter1_1);
		panelCenter_1.add(lblCenterName);
		panelCenter_1.add(lblCenter1_2);
		panelCenter_1.add(lblCenterAge);
		panelCenter_1.add(lblCenter1_3);
		panelCenter_1.add(lblCenterNum);
		panelCenter_1.add(lblCenter1_4);
		panelCenter_1.add(panelCenter_1_2);
		
		panelCenter_1_2.setLayout(new GridLayout(1,2));
		panelCenter_1_2.add(rb1);
		panelCenter_1_2.add(rb2);
		
		
		
		
		
		
		
		setLayout(new BorderLayout());
		
		add("North", panelNorth);
		add("Center", panelCenter);
		add("South", panelSouth);
		
		
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
		new AutoHome();
	}

}
