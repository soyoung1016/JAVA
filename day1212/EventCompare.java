package day1212;

import java.awt.Button;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * ���� ������ �̺�Ʈ�� ������ �߻��ϸ�, �� �̺�Ʈ�� ���Ͽ� ó���ϴ� ���<br>
 * �̺�Ʈ�� �߻���Ų �ּҸ� ��, ��� �̺�Ʈ���� ��밡�� : getSource()<br>
 * �̺�Ʈ�� �߻���Ų ��ü�� Label�� �� - ActionEvent������ ��� ���� : getActionCommand()
 * 
 * @author owner
 */
@SuppressWarnings("serial")
//1. ������ ������Ʈ ���
public class EventCompare extends Frame implements ActionListener{
	
	//2. �̺�Ʈ�� �����ִ� ������Ʈ ����
	private Button btnOpen;
	private Button btnSave;
	private Label lblOutput;

	public EventCompare() {
		super("���� ���̾�α� ���");
		
		//3. ����
		btnOpen = new Button("������");
		btnSave = new Button("������");
		lblOutput = new Label("���â : ");
		
		//4. ��ġ
		Panel panel = new Panel(); //�����̳� ������Ʈ
		panel.add(btnOpen);
		panel.add(btnSave);
		
		add("Center", panel);
		add("South", lblOutput);
		
		//5. �̺�Ʈ ���
		btnOpen.addActionListener(this);
		btnSave.addActionListener(this);
		
		//6. ������ ũ�� ����
		setBounds(100,100,500,100);
		
		//7. ����ȭ
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		
		
	}
	
//	@Override
//	public void actionPerformed(ActionEvent ae) {
////		System.out.println("�̺�Ʈ �߻� "+ae);
//		//////////////////////////////�ּҺ�/////////////////////////////////////
//		if(ae.getSource()==btnOpen) {
//			System.out.println("����");
//		}
//		
//		if(ae.getSource()==btnSave) {
//			System.out.println("����");
//		}
//	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
//		System.out.println("�̺�Ʈ �߻� ��ü�� Lable : "+ae.getActionCommand());
		//////////////////////////////�󺧺�/////////////////////////////////////
		String label = ae.getActionCommand();
		
		if(label.equals("������")) {
//			System.out.println("����!!!");
			//������ ������Ʈ �̹Ƿ� �����ߴٰ� ����ڿ��� �������� �ʴ´�. ����ȭ �ؾ���
			//��, ���� ���� ����� ����.
			FileDialog fdOpen = new FileDialog(this, "���� ����", FileDialog.LOAD);
			//����ȭ
			fdOpen.setVisible(true);
			
			String path = fdOpen.getDirectory();
			String name = fdOpen.getFile();
			
			if(name != null) { //��� �������� null�� ���� �ʰ� �ϱ�
				lblOutput.setText("���� ���� : "+path+name);
				//Ÿ��Ʋ���� ���� ����
				setTitle("���� ���̾�α� ��� - ���� : "+name);
			}
		}
		
		if(label.equals("������")) {
//			System.out.println("����!!!");
			//������ ������Ʈ �̹Ƿ� �����ߴٰ� ����ڿ��� �������� �ʴ´�. ����ȭ �ؾ���
			//��, ���� ���� ����� ����
			FileDialog fdSave = new FileDialog(this, "���� ����", FileDialog.SAVE);
			//����ȭ
			fdSave.setVisible(true);
			
			String path = fdSave.getDirectory();
			String name = fdSave.getFile();
			
			if(name != null) { //��� �������� null�� ���� �ʰ� �ϱ�
				lblOutput.setText("���� ���� : "+path+name);
				//Ÿ��Ʋ���� ���� ����
				setTitle("���� ���̾�α� ��� - ���� : "+name);
				
			}
		
		}
	}
	
	
	
	public static void main(String[] args) {
		new EventCompare();
	}


}
