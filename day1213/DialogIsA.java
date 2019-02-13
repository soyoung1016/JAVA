package day1213;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
//1. Dialog ���
public class DialogIsA extends Dialog implements ActionListener {
	
	//2. �̺�Ʈ�� �����ִ� ������Ʈ�� ����
	private Button btn;
	
	//���� ���̾�α��� �θ� �� ��ü�� has a ����
	//������ ���� has a, ���? ���� is a....����..
	public DialogIsA(UseDialogIsA uda) {
		super(uda, "���̾�α�", true);
		
		//������Ʈ ����
		Label lbl = new Label("������ ������Դϴ�.");
		
		btn = new Button("����");
		
		add("Center", lbl);
		add("South", btn);
		
		btn.addActionListener(this);
		//�������� dispose, ���̾�α׿� �������� ���̾�α��� dispose - d.~~~
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		
		//���̾�α��� ��ġ�� �θ������� ���ʿ��� ���� //�������ϸ� �θ��������� ���� ���ֵ簣�� ���� ��ġ���� ���̾�αװ� ��
		System.out.println("�θ� x "+uda.getX()+", �θ� y "+uda.getY());
		setBounds(uda.getX()+100, uda.getY()+100, 300, 300);
		setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		dispose();
	}

}
