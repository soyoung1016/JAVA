package day1214;

import java.awt.Cursor;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import kr.co.sist.memo.view.JavaMemo;

@SuppressWarnings("serial")
public class UseTitledBorder extends JFrame implements ActionListener {
	
	private JTextField jtfld;
	private JPasswordField jpfPass;
	private JLabel jlOutput;
	
	public UseTitledBorder() {
		super("border ���");
		
		jtfld = new JTextField();
		jpfPass= new JPasswordField();
		jlOutput = new JLabel("��� : ");
		
		jtfld.setBorder(new TitledBorder("���̵�"));
		jpfPass.setBorder(new TitledBorder("��й�ȣ"));
		jlOutput.setBorder(new TitledBorder("���â"));
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(3, 1));
		
		//�����̳� ������Ʈ
		panel.setBorder(new TitledBorder("�α���"));
		
		panel.add(jtfld);
		panel.add(jpfPass);
		panel.add(jlOutput);
		
		jtfld.addActionListener(this);
		jpfPass.addActionListener(this);
		
		add("Center", panel);
		
		setBounds(100,100,250,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	} 

	@Override
	public void actionPerformed(ActionEvent ae) {
		String id = jtfld.getText().trim();
		if(ae.getSource()==jtfld) {	//���̵𿡼� �̺�Ʈ�� �߻��ϸ�
			//���̵� ���� ����ִٸ� Ŀ���� ��й�ȣ�� �̵�
			if(!id.equals("")) {
				jpfPass.requestFocus();
//				jpfPass.requestFocus(); //Ŀ�� �̵��ϱ�
			}
		}
		
		if(ae.getSource()==jpfPass) {	//��й�ȣ���� �̺�Ʈ�� �߻��ϸ�
			//���̵� ���� ���ٸ� Ŀ���� ���̵�� �̵�
			if(id.equals("")) {
				jtfld.requestFocus(); //Ŀ�� �̵��ϱ�
				jlOutput.setText("���̵� �Է����ּ���");
				return; //��ȯ���� void�� method���� �ڵ��� ������ ���߰� ȣ���� ������ ���ư���!
			}
			
			//��й�ȣ�� ���� ���ٸ� ���â�� "��й�ȣ �Է�"�� �����ְ� Ŀ���� ��й�ȣ�� �̵�
			String pass = new String(jpfPass.getPassword()); //password�� ��ȯ���� �迭�̶� Ŭ������ �ٲ��ش�.
			if(pass.trim().equals("")) {
				jlOutput.setText("��й�ȣ�� �Է����ּ���");
				return;
			}
			
			//��й�ȣ�� ���� �ִٸ� ���̵� admin, ��й�ȣ�� 123�� ������ ���Ͽ�
			//���ٸ� �ڹٸ޸��� Ŭ������ ����
			if(id.equals("admin")&&pass.equals("123")) {
//				new JavaMemo(); //Ŭ������ ����
			} else {
				jlOutput.setText("���̵� Ȥ�� ��й�ȣ�� Ȯ���� �ּ���");
			}
			
		}
	}

	public static void main(String[] args) {
		new UseTitledBorder();
	}

}
