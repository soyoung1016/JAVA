package day1213;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Frame Ŭ�������� is a �� ������ DialogŬ������ ���
 * @author owner
 */
@SuppressWarnings("serial")
public class UseDialogIsA extends Frame implements ActionListener {
	
	private Button btn1/* Frame�� ��ġ */, btn2/* Dialog */;
	private Dialog d;
	
	public UseDialogIsA() {
		super("���̾�α� ���");
		
		btn1 = new Button("���̾�α� ���");
		
		Panel panel = new Panel();
		panel.add(btn1);
		
		add("Center", panel);
		
		btn1.addActionListener(this);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		
		setBounds(100,100,300,300);
		setVisible(true);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		createDialog();
	}
	
	public void createDialog() {
		new DialogIsA(this); //this�� UseDialogIsA()
	}
	
	public static void main(String[] args) {
		new UseDialogIsA();
	}

}
