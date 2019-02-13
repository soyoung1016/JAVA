package day1213;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * Swing�� ����� Window Application
 * @author owner
 */
//1. JFrame ���
@SuppressWarnings("serial")
public class HelloSwing extends JFrame implements ActionListener {

	public HelloSwing() {
		super("��������");
		
		//������Ʈ ����
		JButton jb = new JButton("�ȳ� �� �����̶����");
		//��ġ
		add("Center", jb);
		//�̺�Ʈ ���
		jb.addActionListener(this);
		//ũ�� ����
		setBounds(100,100,300,200);
		//����ȭ
		setVisible(true);
		//������ ���� ó��
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		dispose();
	}
	
	public static void main(String[] args) {
		new HelloSwing();
	}

}
